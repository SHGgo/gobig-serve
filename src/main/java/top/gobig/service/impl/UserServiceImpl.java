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
import top.gobig.util.JwtUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public User selectById(int id) {
        return userMapper.selectById(id);
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
    public Map<Object, Object> userLogin(User user, HttpServletRequest request) {
        HashMap<Object, Object> map = new HashMap<>();
        User resUser = userMapper.selectByUserAccountAndPwd(user);
        if (resUser != null) {
            String token = JwtUtils.createToken(String.valueOf(resUser.getUid()));
            map.put("status", "200");
            map.put("token", token);
            return map;
        } else {
            map.put("status", "500");
            return map;
        }
    }

    @Override
    public Map<Object, Object> userConditionCheck(HttpServletRequest request) {
        Map<Object, Object> map = new HashMap<>();
        //TODO 登录验证
        String token = request.getHeader("Authorization");
        if (token == null) {
            map.put("status", "401");//没登录
        } else {
            if (JwtUtils.verifyToken(token) == 1) {
                HttpSession session = request.getSession();
                session.setAttribute("uid", JwtUtils.parseToken(token).get("sub"));
                map.put("status", "200");
            } else {
                map.put("status", "400"); //token错误
            }
        }
        return map;
    }

    /**
     * dao.getNum()=0获取user本人信息，>0获取其他人信息
     */
    @Override
    public UserContent getUserContent(GDao dao, HttpServletRequest request) {
        if (dao != null && dao.getNum() > 0) {
            UserContent resUserContent = userContentMapper.selectByPrimaryKey(dao.getNum());
            return resUserContent;
        } else {
            String token = request.getHeader("Authorization");
            if (token != null && JwtUtils.verifyToken(token) == 1) {
                Integer uid = Integer.parseInt((String) JwtUtils.parseToken(token).get("sub"));
                UserContent resUserContent = userContentMapper.selectByPrimaryKey(uid);
                return resUserContent;
            } else {
                return null;
            }
        }
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

    /**
     * 添加用户
     *
     * @param dao user userContent
     * @return
     */
    @Override
    public Map<Object, Object> insertUserContent(GDao dao) {
        HashMap<Object, Object> resMap = new HashMap<>();
        HashMap<Object, Object> dataMap = new HashMap<>();
        // 1.添加用户账号密码
        User user = dao.getUser();
        if (user != null && user.getUserAccount() != null) {
            // 1.1 账号是否相同
            User userRes = userMapper.selectByUserAccount(user);
            if (userRes!=null){
                resMap.put("status",40301); //账号相同
                return resMap;
            }
            int i1 = userMapper.insert(user);
            if (i1 == 1) {
                // 2.添加用户信息
                System.out.println(user.toString());
                dataMap.put("user", user);
                UserContent userContent = dao.getUserContent();
                userContent.setUid(user.getUid());
                int i2 = userContentMapper.insert(userContent);
                if (i2 == 1) {
                    dataMap.put("userContent", userContent);
                    resMap.put("status", 20000);
                    resMap.put("data", dataMap);
                }
            }
        }
        return resMap;
    }
}
