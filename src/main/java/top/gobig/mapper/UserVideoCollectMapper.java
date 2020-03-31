package top.gobig.mapper;

import org.apache.ibatis.annotations.Param;
import top.gobig.pojo.UserVideoCollect;

import java.util.List;

public interface UserVideoCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserVideoCollect record);

    UserVideoCollect selectByPrimaryKey(Integer id);

    List<UserVideoCollect> selectAll();

    int updateByPrimaryKey(UserVideoCollect record);

    List<Integer> selectVidByUid(@Param("uid") Integer uid,@Param("videoNum") Integer videoNum);
}