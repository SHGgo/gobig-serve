package top.gobig.mapper;

import java.util.List;
import top.gobig.pojo.AdminContent;

public interface AdminContentMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(AdminContent record);

    AdminContent selectByPrimaryKey(Integer aid);

    List<AdminContent> selectAll();

    int updateByPrimaryKey(AdminContent record);
}