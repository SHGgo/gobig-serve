package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.UserContentMapper;
import top.gobig.mapper.UserMapper;
import top.gobig.mapper.UserVideoCollectMapper;
import top.gobig.mapper.VideoMapper;
import top.gobig.pojo.User;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.service.UserService;
import top.gobig.util.GDao;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserContentMapper userContentMapper;
    @Autowired
    UserVideoCollectMapper userVideoCollectMapper;
    @Autowired
    VideoMapper videoMapper;

    @Override
    public User selectByid(int id) {
        return userMapper.selectByid(id);
    }

    @Override
    public String userRegister(User user) {
        //查询用户名是否相同
        User resUser = userMapper.selectByUserAccount(user);
        if (!(resUser == null)) {
            return "AccountDuplication";
        } else {
            Integer res = userMapper.insert(user);
            if (res.equals(1)) {
                //TODO 验证插入userContent
                UserContent userContent = new UserContent();
                userContent.setUid(user.getUid());
                userContentMapper.insert(userContent);
                return "success";
            } else {
                return "fail";
            }
        }
    }

    @Override
    public String userLogin(User user, HttpServletRequest request) {
        HashMap<Object, Object> map = new HashMap<>();
        HttpSession session = request.getSession();
        User resUser = userMapper.selectByUserAccountAndPwd(user);
        if (resUser != null && session != null) {
            session.setAttribute("uid", resUser.getUid());
            session.setAttribute("userAccount", resUser.getUserAccount());
            session.setAttribute("pwd", resUser.getPwd());
            System.out.println("=========session==========");
            System.out.println("userLoginsession.getId() = " + session.getId());
            //获取session所有信息
            /*Enumeration<String> attrs = session.getAttributeNames();
            while(attrs.hasMoreElements()){
                // 获取session键值
                String name1 = attrs.nextElement().toString();
                // 根据键值取session中的值
                Object vakue = session.getAttribute(name1);
                // 打印结果
                System.out.println("------" + name1 + ":" + vakue +"--------\n");
            }*/
            //获取session所有信息
            map.put("status","200");
            map.put("sessionId",session.getId());
            return "success";
        } else {
            return "false";
        }
    }

    @Override
    public String userConditionCheck(HttpServletRequest request) {
        //TODO 登录验证
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession(false);
        int flag = 0;
        if (cookies == null || session == null) {
            for (Cookie cookie : cookies) {
                System.out.println("1cookieValue ---- " + cookie.getValue());
            }
            return "noLogged";
        } else {
            for (Cookie cookie : cookies) {
                System.out.println("cookieName ---- " + cookie.getName());
                /*if (cookie.getName().equals("JSESSIONID")) {
                    System.out.println("userConditionCheckJSESSIONID = " + cookie.getValue());
                }*/
                if (cookie.getName().equals("userAccount")) {
                    String userAccount = cookie.getValue();
//                    System.out.println("userAccount = " + userAccount);
                    String suserAccount = (String) session.getAttribute("userAccount");
//                    System.out.println("suserAccount = " + suserAccount);
                    if (!userAccount.equals(suserAccount)) {
                        System.out.println("2");
                        return "noLogged";
                    } else {
                        flag++;
                    }
                } else if (cookie.getName().equals("pwd")) {
                    String pwd = cookie.getValue();
                    String spwd = (String) session.getAttribute("pwd");
                    if (!pwd.equals(spwd)) {
                        System.out.println("3");
                        return "noLogged";
                    } else {
                        flag++;
                    }
                }
            }
            if (flag == 2) {
                return "logged";
            } else {
                System.out.println("4");
                return "noLogged";
            }
        }
    }


    @Override
    public UserContent getUserContent(GDao dao, HttpServletRequest request) {
        if (dao != null && dao.getNum() > 0) {//TODO
            UserContent resUserContent = userContentMapper.selectByPrimaryKey(dao.getNum());
            return resUserContent;
        } else {
            HttpSession session = request.getSession(false);
            if (session != null) {
                System.out.println("getUserContentSessionUid = " + session.getAttribute("uid"));
                Integer uid = null;
                uid = (int) session.getAttribute("uid");
                System.out.println("uid = " + uid);
                UserContent resUserContent = userContentMapper.selectByPrimaryKey(uid);
                return resUserContent;
            }
        }
        return null;
    }

    @Override
    public List<Video> getUserVideoCollect(GDao dao) {
        List<Integer> vidList = userVideoCollectMapper.selectVidByUid(dao.getUid(), dao.getVideoNum());
        List<Video> videoList = new ArrayList<>();
        for (Integer vid : vidList) {
            Video video = videoMapper.selectByVid(vid);
            videoList.add(video);
        }
        return videoList;
    }

}
