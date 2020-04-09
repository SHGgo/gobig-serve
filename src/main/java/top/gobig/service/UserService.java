package top.gobig.service;

import top.gobig.pojo.User;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface UserService {
    User selectById(int id);

    String userRegister(User user);

    Map<Object, Object> userLogin(User user, HttpServletRequest request);

    Map<Object, Object> userConditionCheck(HttpServletRequest request);

    UserContent getUserContent(GDao num, HttpServletRequest request);

    List<Video> getUserVideoCollect(GDao num);

    Map<Object, Object> insertUserContent(GDao dao);
}
