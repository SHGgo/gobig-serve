package top.gobig.service.impl;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.SortMapper;
import top.gobig.mapper.VideoMapper;
import top.gobig.pojo.Sort;
import top.gobig.pojo.Video;
import top.gobig.service.VideoService;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper videoMapper;
    @Autowired
    SortMapper sortMapper;

    @Override
    public List<Video> getUserVideoList(GDao dao) {
        dao.setPageItemNum(dao.getVideoNum());
        List<Video> videos = videoMapper.selectByUid(dao);
        return videos;
    }

    /**
     * getSortVideoList
     * @param dao (需要开始的索引,视频的数目）
     * @return
     */
    @Override
    public Map<Object, Object> getSortVideoList(GDao dao) {
        Integer total = videoMapper.selectSortVideoTotal(dao);
        dao.setPageLast(total);
        List<Video> videoList = videoMapper.selectBySortName(dao);
        Map<Object, Object> map = new HashMap<>();
        map.put("videoLastNum",dao.getPageLast());
        map.put("videoList",videoList);
        return map;
    }

    @Override
    public Map<Object, Object> getScoreVideoList(GDao dao) {
        Integer total = videoMapper.selectTotal();
        if (dao.getVideoNum()>total){
            dao.setVideoNum(total);
        }
        List<Video> videoList = videoMapper.selectByScore(dao);
        Map<Object, Object> map = new HashMap<>();
        map.put("videoList",videoList);
        return map;
    }

    @Override
    public Map<Object, Object> getOneVideo(GDao dao) {
        int vid = dao.getVid();
        Map<Object, Object> map = new HashMap<>();
        if (vid >0){
            Video video = videoMapper.selectByVid(vid);
            map.put("video",video);
            map.put("status","200");
        }else {
            map.put("status","400");
        }
        return map;
    }

    @Override
    public Map<Object,Object> getRandomVideo(GDao dao){
        int num = dao.getVideoNum();
        Map<Object,Object> map =new LinkedHashMap<>();
        List<Video> videoList = new ArrayList<>();
        int total = videoMapper.selectTotal();
        Random random = new Random();
        int[] numArray = new int[num];
        int ele;
        for (int i = 0; i < numArray.length; i++) {
            ele = random.nextInt(total);
            while (ArrayUtils.contains(numArray, ele)) {
                ele = random.nextInt(total);
            }
            numArray[i] = ele;
            GDao daoTemp = new GDao();
            daoTemp.setIndex(ele);
            daoTemp.setVideoNum(1);
            List<Video> videoListTemp = videoMapper.selectByIndex(daoTemp);
            videoList.add(videoListTemp.get(0));
        }
        map.put("videoList",videoList);
        map.put("status","200");
        return map;
    }

    @Override
    public Map<Object,Object> getRandomSortVideo(GDao dao){
        int sortNum = dao.getSortNum();
        int videoNum = dao.getVideoNum();
        List<Sort> sorts = sortMapper.list(sortNum);//获取分类表
        Map<Object,Object> map = new LinkedHashMap<>();
        for (Sort sort : sorts) {
            List<Video> videoList = new ArrayList<>();
            dao.setSortName(sort.getSortName());
            Integer sortVideoTotal = videoMapper.selectSortVideoTotal(dao);
            if (sortVideoTotal <= videoNum+5) {//小于videoNum+5没必要随机
                videoList = videoMapper.selectBySortName(dao);
                map.put(sort.getSortName(), videoList);
                continue;
            }
            Random random = new Random();
            int[] numArray = new int[videoNum];
            int ele;
            for (int i = 0; i < numArray.length; i++) {
                //生成的随机数范围就变成[0,a)
                ele = random.nextInt(sortVideoTotal-1)+ 1;
                while (ArrayUtils.contains(numArray, ele)) {
                    ele = random.nextInt(sortVideoTotal-1)+1;
                }
                numArray[i] = ele;
                GDao daoTemp = new GDao();
                daoTemp.setIndex(ele);
                daoTemp.setVideoNum(1);
                daoTemp.setSortName(sort.getSortName());
                List<Video> videoListTemp = videoMapper.selectByIndex(daoTemp);
                videoList.add(videoListTemp.get(0));
            }
            map.put(sort.getSortName(), videoList);
        }
        return map;
    }

    @Override
    public Map<Object, Object> deleteVideoContent(GDao dao, HttpServletRequest request) {
        HashMap<Object, Object> resMap = new HashMap<>();
        try {
            videoMapper.deleteByPrimaryKey(dao.getVid());
        } catch (Exception e) {
            resMap.put("status",50000); // 未知错误
            return resMap;
        }
        resMap.put("status",20000);
        return resMap;
    }

}
