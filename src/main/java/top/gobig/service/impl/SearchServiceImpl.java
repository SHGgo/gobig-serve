package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.UserContentMapper;
import top.gobig.mapper.VideoMapper;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.service.SearchService;
import top.gobig.util.GDao;

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
     *
     * @param dao |uid |nickName pageItemNum
     * @return
     */
    @Override
    public Map<Object, Object> searchUser(GDao dao) {
        System.out.println(dao);
        Map<Object, Object> resMap = new HashMap<>();
        Map<Object, Object> dataMap = new HashMap<>();
        if (dao.getUid() != null) {
            UserContent userContent = userContentMapper.selectByPrimaryKey(dao.getUid());
            if (userContent != null) {
                dataMap.put("total", 1);
                dataMap.put("table", userContent);
            } else {
                dataMap.put("total", 0);
            }
        } else if (dao.getNickName() != null) {
            List<UserContent> userContents = userContentMapper.selectByNickName(
                    dao.getNickName(), dao.getPageStart(), dao.getPageItemNum());
            dataMap.put("total", userContents.size());
            if (userContents.size()!=0){
                dataMap.put("table", userContents);
            }
        } else {
            //TODO 无条件查询
        }
        resMap.put("status",20000);
        resMap.put("data",dataMap);
        return resMap;
    }
}
