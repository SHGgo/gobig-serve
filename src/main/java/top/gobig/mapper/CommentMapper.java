package top.gobig.mapper;

import top.gobig.pojo.Comment;
import top.gobig.util.GDao;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer cid);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);

    int selectTotalByVid(GDao dao);

    List<Comment> selectByVid(GDao dao);
}