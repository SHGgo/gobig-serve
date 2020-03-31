package top.gobig.mapper;

import org.apache.ibatis.annotations.Param;
import top.gobig.pojo.Sort;

import java.util.List;

public interface SortMapper {

    List<Sort> list();

    List<Sort> list(@Param("num") int num);

    Sort get(int id);
}
