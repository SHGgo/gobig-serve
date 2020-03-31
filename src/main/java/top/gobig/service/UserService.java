package top.gobig.service;

import top.gobig.pojo.User;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    User selectByid(int id);

    String userRegister(User user);

    String userLogin(User user, HttpServletRequest request);

    public String userConditionCheck(HttpServletRequest request);

    public UserContent getUserContent(GDao num, HttpServletRequest request);

    public List<Video> getUserVideoCollect(GDao num);
}
