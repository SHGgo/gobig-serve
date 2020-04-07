package top.gobig.mapper;

import org.apache.ibatis.annotations.Param;
import top.gobig.pojo.UserContent;

import java.util.List;

public interface UserContentMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserContent record);

    UserContent selectByPrimaryKey(Integer uid);

    List<UserContent> selectAll();

    int updateByPrimaryKey(UserContent record);

    List<UserContent> selectByNickName(@Param("nickName") String nickName,
                                 @Param("pageStart") int pageStart,
                                 @Param("pageItemNum") int pageItemNum);
}