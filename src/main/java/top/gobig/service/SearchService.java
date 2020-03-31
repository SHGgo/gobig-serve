package top.gobig.service;

import top.gobig.util.GDao;

import java.util.Map;

public interface SearchService {
    Map<String,Object> searchVideo(GDao dao);
}
