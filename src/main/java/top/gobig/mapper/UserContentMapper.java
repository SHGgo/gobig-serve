package top.gobig.mapper;

import java.util.List;
import top.gobig.pojo.UserContent;

public interface UserContentMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserContent record);

    UserContent selectByPrimaryKey(Integer uid);

    List<UserContent> selectAll();

    int updateByPrimaryKey(UserContent record);
}