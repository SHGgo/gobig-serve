package top.gobig.service;

import top.gobig.pojo.Video;
import top.gobig.util.GDao;

import java.util.List;
import java.util.Map;

public interface VideoService {
    public List<Video> getUserVideoList(GDao dao);

    public Map<Object, Object> getSortVideoList(GDao dao);

    public Map<Object, Object> getScoreVideoList(GDao dao);

    Map<Object, Object> getOneVideo(GDao dao);

    Map<Object,Object> getRandomVideo(GDao data);

    Map<Object,Object> getRandomSortVideo(GDao data);
}
