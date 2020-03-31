package top.gobig.mapper;

import top.gobig.pojo.User;

public interface UserMapper {
    User selectByid(int uid);

    Integer insert(User user);

    User selectByUserAccount(User user);

    User selectByUserAccountAndPwd(User user);
}
