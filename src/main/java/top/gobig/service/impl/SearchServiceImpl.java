package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.UserContentMapper;
import top.gobig.mapper.VideoMapper;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.service.SearchService;
import top.gobig.util.GDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    VideoMapper videoMapper;
    @Autowired
    UserContentMapper userContentMapper;

    @Override
    public Map<String, Object> searchVideo(GDao dao) {
        Map<String, Object> resMap = new HashMap<>();
        if (dao.getSearchKeyWord() != null && dao.getVideoNum() > 0) {
            if (dao.getPageLast() == 0) {//pageLast为0，则重新获取pageLast
                Integer pageLast = videoMapper.selectByKeyWordCount(dao);
                resMap.put("pageLast", pageLast);
            }
            List<Video> videoList = videoMapper.selectByKeyWord(dao);
            if (videoList.size() != 0) {
                resMap.put("videoList", videoList);
                resMap.put("state", "200");
            } else {
                resMap.put("state", "204");
            }
        } else {
            resMap.put("state", "400");
        }
        return resMap;
    }

    /**
     * admin搜索video
     * @param dao |vid |title |uid |nickName pageItemNum
     * @return
     */
    @Override
    public Map<Object, Object> searchVideoByAdmin(GDao dao) {
        Map<Object, Object> resMap = new HashMap<>();
        Map<Object, Object> dataMap = new HashMap<>();
        if (dao.getVid() != null) {
            Video video = videoMapper.selectByVid(dao.getVid());
            if (video != null) {
                List<Video> videoList = new ArrayList<>();
                videoList.add(video);
                dataMap.put("total", 1);
                dataMap.put("table", videoList);
            } else {
                dataMap.put("total", 0);
            }
        } else if (dao.getAuthor() != null) {
            Integer total = videoMapper.total(dao.getAuthor(),null,0);
            dataMap.put("total", total);
            if (total!=0){
                List<Video> videoList = videoMapper
                        .selectByAuthor(dao);
                dataMap.put("table", videoList);
            }
        }else if (dao.getUid() != null) {
            Integer total = videoMapper.total(null,null,dao.getUid());
            dataMap.put("total", total);
            if (total!=0){
                System.out.println(dao.getUid());
                List<Video> videoList = videoMapper
                        .selectByUid(dao);
                dataMap.put("table", videoList);
            }
        }else if (dao.getTitle() != null) {
            Integer total = videoMapper.total(null,dao.getTitle(),0);
            dataMap.put("total", total);
            if (total!=0){
                List<Video> videoList = videoMapper
                        .selectByTitle(dao);
                dataMap.put("table", videoList);
            }
        } else {
            Integer total = videoMapper.total(null,null,0);
            dataMap.put("total", total);
            if (total!=0){
                List<Video> videoList = videoMapper.selectAll(dao);
                dataMap.put("table", videoList);
            }
        }
        resMap.put("status",20000);
        resMap.put("data",dataMap);
        return resMap;
    }

    /**
     *
     * @param dao |uid |nickName pageItemNum
     * @return
     */
    @Override
    public Map<Object, Object> searchUser(GDao dao) {
        Map<Object, Object> resMap = new HashMap<>();
        Map<Object, Object> dataMap = new HashMap<>();
        if (dao.getUid() != null) {
            UserContent userContent = userContentMapper.selectByPrimaryKey(dao.getUid());
            if (userContent != null) {
                List<UserContent> userContents = new ArrayList<>();
                userContents.add(userContent);
                dataMap.put("total", 1);
                dataMap.put("table", userContents);
            } else {
                dataMap.put("total", 0);
            }
        } else if (dao.getNickName() != null) {
            Integer total = userContentMapper.total(dao.getNickName());
            dataMap.put("total", total);
            if (total!=0){
                List<UserContent> userContents = userContentMapper
                        .selectByNickName(dao.getNickName(), dao.getPageStart(), dao.getPageItemNum());
                dataMap.put("table", userContents);
            }
        } else {
            Integer total = userContentMapper.total(dao.getNickName());
            dataMap.put("total", total);
            if (total!=0){
                List<UserContent> userContents = userContentMapper
                        .selectAll(dao.getPageStart(), dao.getPageItemNum());
                dataMap.put("table", userContents);
            }
        }
        resMap.put("status",20000);
        resMap.put("data",dataMap);
        return resMap;
    }
}
