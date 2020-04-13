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

    List<Video> selectAll(GDao dao);

    Video selectByVid(Integer vid);

    List<Video> selectByUid(GDao dao);

    List<Video> selectByTitle(GDao dao);

    List<Video> selectByAuthor(GDao dao);

    List<Video> selectBySortName(@Param("dao") GDao dao);

    List<Video> selectByScore(@Param("dao") GDao dao);

    Integer selectTotal();

    Integer selectSortVideoTotal(@Param("dao") GDao dao);

    List<Video> selectByIndex(@Param("dao") GDao dao);

    List<Video> selectByKeyWord(@Param("dao") GDao dao);

    Integer selectByKeyWordCount(@Param("dao") GDao dao);

    Integer total(@Param("author") String author,@Param("title") String title,@Param("uid") int uid);
}