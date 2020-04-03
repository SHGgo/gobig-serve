package top.gobig.mapper;

import top.gobig.pojo.Admin;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer aid);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);

    Admin selectByAdminAccountAndPwd(Admin admin);
}