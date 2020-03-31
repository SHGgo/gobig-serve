package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.CommentMapper;
import top.gobig.pojo.Comment;
import top.gobig.service.CommentService;
import top.gobig.util.GDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public Map<Object, Object> getVideoComment(GDao gDao) {
        Map<Object, Object> map = new HashMap<>();
        System.out.println("gDao.toString() = " + gDao.toString());
        if (gDao.getVid() <= 0 || gDao.getPageStart() < 0 || gDao.getCommentNum() < 0) {
            map.put("status", "400");
        } else {
            List<Comment> comments = commentMapper.selectByVid(gDao);
            int commentLastNum = commentMapper.selectTotalByVid(gDao);
            if (comments != null) {
                map.put("comments", comments);
                map.put("status", "200");
                map.put("commentLastNum",commentLastNum);
            } else {
                map.put("status", "204");
            }

        }
        return map;
    }
}
