

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.mapper.UserContentMapper;
import top.gobig.mapper.UserMapper;
import top.gobig.mapper.UserVideoCollectMapper;
import top.gobig.pojo.User;
import top.gobig.pojo.UserContent;
import top.gobig.service.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUser {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Autowired
    UserContentMapper userContentMapper;

    @Test
    public void selectByUserAccountAndPwdTest() {
        User user = new User();
        user.setUserAccount("root");
        user.setPwd("1234");
        User user1 = userMapper.selectByUserAccountAndPwd(user);
        System.out.println(user1.toString());
    }

    @Test
    public void userRegisterTest() {
        User user = new User();
        user.setUserAccount("root3");
        user.setPwd("123");
        String res = userService.userRegister(user);
        System.out.println(res);
    }

    @Test
    public void getUserContentTest() {
        Integer uid = 1;
        UserContent resUserContent = userContentMapper.selectByPrimaryKey(uid);
        System.out.println("resUserContent = " + resUserContent.toString());
    }


    @Autowired
    UserVideoCollectMapper userVideoCollectMapper;
    @Test
    public void selectUidByVidme() {
        Integer uid = 1;
        Integer videoCollectNum = 9;
        List<Integer> integers = userVideoCollectMapper.selectVidByUid(uid,videoCollectNum);
        System.out.println("integers = " + integers);
    }
}
