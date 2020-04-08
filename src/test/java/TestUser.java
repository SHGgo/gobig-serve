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
import top.gobig.util.JwtUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUser {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Autowired
    UserContentMapper userContentMapper;
    @Autowired
    UserVideoCollectMapper userVideoCollectMapper;

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



    @Test
    public void selectUidByVidTest() {
        Integer uid = 1;
        Integer videoCollectNum = 9;
        List<Integer> integers = userVideoCollectMapper.selectVidByUid(uid,videoCollectNum);
        System.out.println("integers = " + integers);
    }

    @Test
    public void TestJwt() {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1002);
        map.put("userName", "张晓明");
        map.put("age", 12);
        map.put("address", "山东省青岛市李沧区");
        String token = JwtUtils.createToken("123");
        Map<String, Object> stringObjectMap = JwtUtils.parseToken(token);
        System.out.println(stringObjectMap.get("sub"));
        int i = JwtUtils.verifyToken(token);
        System.out.println(i);
    }

    @Test
    public void selectByNickNameTest() {
        List<UserContent> userContents = userContentMapper.selectByNickName("root21312", 0, 0);
        int i = userContentMapper.total("root21312");
        System.out.println(i);
    }
}
