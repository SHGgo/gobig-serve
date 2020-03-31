package top.gobig.mapper;

import org.apache.ibatis.annotations.Param;
import top.gobig.pojo.Video;
import top.gobig.util.GDao;

import java.util.List;

public interface VideoMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(Video record);

    int updateByPrimaryKey(Video record);


    List<Video> selectAll();

    Video selectByVid(Integer vid);

    List<Video> selectByUid(@Param("uid") Integer uid, @Param("videoNum")Integer videoNum);

    List<Video> selectBySortName(@Param("dao") GDao dao);

    List<Video> selectByScore(@Param("dao") GDao dao);

    Integer selectTotal();

    Integer selectSortVideoTotal(@Param("dao") GDao dao);

    List<Video> selectByIndex(@Param("dao") GDao dao);

    List<Video> selectByKeyWord(@Param("dao") GDao dao);

    Integer selectByKeyWordCount(@Param("dao") GDao dao);
}