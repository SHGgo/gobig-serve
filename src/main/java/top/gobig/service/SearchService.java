package top.gobig.service;

import top.gobig.util.GDao;

import java.util.Map;

public interface SearchService {
    Map<String,Object> searchVideo(GDao dao);

    Map<Object, Object> searchVideoByAdmin(GDao dao);

    Map<Object, Object> searchUser(GDao dao);
}
