package top.gobig.mapper;

import top.gobig.pojo.User;

public interface UserMapper {
    User selectById(int uid);

    Integer insert(User user);

    User selectByUserAccount(User user);

    User selectByUserAccountAndPwd(User user);

    Integer deleteByPrimaryKey(int id);

    int updateByPrimaryKey(User user);
}
