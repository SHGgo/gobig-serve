package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.VideoMapper;
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

    @Override
    public Map<String, Object> searchVideo(GDao dao) {
        Map<String, Object> resMap = new HashMap<>();
        if (dao.getSearchKeyWord()!=null&&dao.getVideoNum()>0){
            if(dao.getPageLast()==0){
                Integer pageLast = videoMapper.selectByKeyWordCount(dao);
                resMap.put("pageLast",pageLast);
            }
            List<Video> videoList = videoMapper.selectByKeyWord(dao);
            if (videoList.size() != 0){
                resMap.put("videoList",videoList);
                resMap.put("state","200");
            }else {
                resMap.put("state","204");
            }
        } else {
            resMap.put("state","400");
        }
        return resMap;
    }
}
