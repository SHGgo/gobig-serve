package top.gobig.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.gobig.pojo.Video;
import top.gobig.service.UploadService;
import top.gobig.service.VideoService;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"**/video"})
public class VideoController {

    @Autowired
    VideoService videoService;
    @Autowired
    UploadService uploadService;
    @Autowired
    HttpServletRequest request;

    /*    @RequestMapping("")
    public String aa(){
        return "asdas";
    }*/

    /**
     * 获取用户视频信息
     * @param dao uid
     * @return
     */
    @RequestMapping("/getUserVideoList")
    public List<Video> getUserVideoList(@RequestBody GDao dao) {
        System.out.println("=============getUserVideoList===========");
        //        System.out.println("getUserVideoList dao.toString()=" + dao.toString());
        List<Video> videoList = videoService.getUserVideoList(dao);
        return videoList;
    }

    /**
     * 获取分类视频信息
     * @param dao sortName,pageLast,videoNum
     * @return
     */
    @RequestMapping("/getSortVideoList")
    public Map<Object, Object> getSortVideoList(@RequestBody GDao dao) {
        System.out.println("=============getSortVideoList===========");
        Map<Object, Object> res = videoService.getSortVideoList(dao);
        return res;
    }

    /**
     * 获取排行榜视频信息
     * @param dao videoNum
     * @return
     */
    @RequestMapping("/getScoreVideoList")
    public Map<Object, Object> getScoreVideoList(@RequestBody GDao dao) {
        System.out.println("=============getScoreVideoList===========");
        Map<Object, Object> res = videoService.getScoreVideoList(dao);
        return res;
    }

    /**
     * 获取一个视频信息
     * @param dao vid
     * @return
     */
    @RequestMapping("/getOneVideo")
    public Map<Object, Object> getOneVideo(@RequestBody GDao dao){
        System.out.println("=============getOneVideo===========");
        Map<Object, Object> res = videoService.getOneVideo(dao);
        return res;
    }


    /**
     * 上传视频文件
     * @param videoFile
     * @param picFile
     * @param vid
     * @return
     */
    @RequestMapping("/uploadVideoFile")
    public Map<Object, Object> uploadVideoFile(@RequestParam(value = "videoFile",required = false) MultipartFile videoFile ,
                                               @RequestParam("picFile") MultipartFile picFile,
                                               @RequestParam("vid") int vid){
        System.out.println("=============uploadVideoFile===========");
        Map<Object, Object> map = uploadService.uploadVideoFile(videoFile, picFile, vid, request);
        return map;
    }

    /**
     * 更新或增加视频信息
     * @param video
     * @return
     */
    @RequestMapping("/uploadVideoContent")
    public Map<Object, Object> uploadVideoContent(@RequestBody Video video){
        System.out.println("=============uploadVideoContent===========");
        Map<Object, Object> map = uploadService.uploadVideoContent(video, request);
        return map;
    }

    /**
     * 删除视频信息
     * @param vid
     * @return
     */
    @RequestMapping("/deleteVideoContent")
    public Map<Object, Object> deleteVideoContent(@RequestBody GDao dao){
        System.out.println("=============deleteVideoContent===========");
        Map<Object, Object> map = videoService.deleteVideoContent(dao, request);
        return map;
    }
}
