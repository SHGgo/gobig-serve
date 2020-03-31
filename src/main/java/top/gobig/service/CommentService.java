package top.gobig.service;

import top.gobig.util.GDao;

import java.util.Map;

public interface CommentService {
    Map<Object,Object> getVideoComment(GDao gDao);
}
