package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.gobig.mapper.UserContentMapper;
import top.gobig.mapper.VideoMapper;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.service.UploadService;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    UserContentMapper userContentMapper;
    @Autowired
    VideoMapper videoMapper;

    @Override
    public Map<Object, Object> uploadVideoContent(Video video, HttpServletRequest request) {
        Map<Object, Object> resMap = new HashMap<>();
        Map<Object, Object> dataMap = new HashMap<>();
        if (video.getUid() == null) {
            resMap.put("status", "403");
            return resMap;
        }
        if (video.getVid()==null){
            // 1.插入视频数据
            if (video.getAuthor()==null){
                // 1.1设置author
                video.setAuthor(userContentMapper.selectByPrimaryKey(video.getUid()).getNickName());
            }
            Integer res = videoMapper.insert(video);
            if (res.equals(1)) {
                dataMap.put("vid", video.getVid());
                resMap.put("data", dataMap);
                resMap.put("status", 20000);
            } else {
                dataMap.put("status", 50000);//未知原因
            }
        }else {
            // 2.更新数据
        }
        return resMap;
    }

    @Override
    public Map<Object, Object> uploadVideoFile(MultipartFile videoFile, MultipartFile picFile,
                                               int vid, HttpServletRequest request) {
        Map<Object, Object> map = new HashMap<>();
        try {
            //1.上传视频和头图
            //创建文件名字
            long time = new Date().getTime();
            String videoFileName = time + "_" + videoFile.getOriginalFilename();
            String picFileName = time + "_" + picFile.getOriginalFilename();
            //创建文件路径
            String videoFilePath = request.getServletContext().getRealPath("") + "/upload/video/" + videoFileName;//获取绝对路径
            String picFilePath = request.getServletContext().getRealPath("") + "/upload/videoPic/" + picFileName;//获取绝对路径
            //创建文件
            File newVideoFile = new File(videoFilePath);
            newVideoFile.mkdirs();
            File newPicFile = new File(picFilePath);
            newPicFile.mkdirs();
            try {
                videoFile.transferTo(newVideoFile);
                picFile.transferTo(newPicFile);
            } catch (IOException e) {
                e.printStackTrace();
                map.put("status", 50000);
                return map;
            }
            //2.更新视频和头图地址
            Video video = videoMapper.selectByVid(vid);
            video.setVideoRes("/upload/video/" + videoFileName);
            video.setPic("/upload/videoPic/" + picFileName);
            Integer res = videoMapper.updateByPrimaryKey(video);
            if (res.equals(1)) {
                map.put("status", 20000);
            } else {
                map.put("status", 50000);
            }
        } catch (Exception e) {
            System.out.println("vid = " + vid);
            int i = videoMapper.deleteByPrimaryKey(vid);
            System.out.println(i);
            map.put("status", 50000);
            e.printStackTrace();
            return map;
        }
        return map;
    }

    @Override
    public Map<Object, Object> uploadUserContent(UserContent userContent, HttpServletRequest request) {
        Map<Object, Object> map = new HashMap<>();
        System.out.println(userContent);
        if (userContent.getUid() == 0) {
            map.put("status", 40300);
        } else {
            // 更新用户数据
            Integer result = userContentMapper.updateByPrimaryKey(userContent);
            if (result.equals(1)) {
                map.put("status", 20000);
            } else {
                map.put("status", 30400);
            }
        }
        return map;
    }

    @Override
    public Map<Object, Object> uploadUserFigure(GDao dao, HttpServletRequest request) {
        Map<Object, Object> map = new HashMap<>();
        //1.上传图片
        MultipartFile file = dao.getFile();
        String fileName = new Date().getTime() + "_" + dao.getUid() + "_" + file.getOriginalFilename().substring(file.getOriginalFilename().length() - 10);
        String filePath = request.getServletContext().getRealPath("") + "/upload/figure/" + fileName;//获取绝对路径
        File newFile = new File(filePath);
        newFile.mkdirs();
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
            map.put("status", 50100);//本地储存错误
            return map;
        }
        //2.更新头像地址
        UserContent userContent = userContentMapper.selectByPrimaryKey(dao.getUid());
        userContent.setFigure("/upload/figure/" + fileName);
        Integer result = userContentMapper.updateByPrimaryKey(userContent);
        if (result.equals(1)) {
            map.put("status", 20000);
        } else {
            map.put("status", 30400);//数据库错误 或 登陆错误
        }
        return map;
    }
}
