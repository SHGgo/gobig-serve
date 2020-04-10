package top.gobig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.gobig.pojo.User;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.service.UploadService;
import top.gobig.service.UserService;
import top.gobig.service.VideoService;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"**/user"})
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    VideoService videoService;
    @Autowired
    UploadService uploadService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @RequestMapping("/userRegister")
    public String userRegister(@RequestBody User user){
        System.out.println("userRegister:"+user.toString());
        String res = userService.userRegister(user);
        return res;
    }

    @RequestMapping("/userLogin")
    public Map<Object, Object> userLogin(@RequestBody User user) throws Exception {
        System.out.println("userLoginController:"+user.toString());
        Map<Object, Object> map = userService.userLogin(user, request);
        return map;
    }

    @RequestMapping("/userConditionCheck")
    public Map<Object, Object> userConditionCheck() {
        System.out.println("========userConditionCheck===========");
        Map<Object, Object> map = userService.userConditionCheck(request);
        return map;
    }

    /**
     *
     * @param dao num
     * @return
     */
    @RequestMapping("/getUserContent")
    public UserContent getUserContent(@RequestBody GDao dao){
        System.out.println("========getUserContent==========");
//        System.out.println("dao.toString() = " + dao.toString());
        UserContent resUserContent = userService.getUserContent(dao,request);
        return resUserContent;
    }

    @RequestMapping("/getUserVideoCollect")
    public List<Video> getUserVideoCollect(@RequestBody GDao dao){
        System.out.println("========getUserVideoCollect==========");
        List<Video> userVideoCollect = userService.getUserVideoCollect(dao);
        return userVideoCollect;
    }

    /**
     * 上传文件 用@RequestParam注解来指定表单上的file为MultipartFile
     *
     * @param file 头像信息
     * @param uid 用户id
     * @return
     */
    @RequestMapping("/uploadUserFigure")
    public Map<Object,Object> uploadUserFigure(@RequestParam("file") MultipartFile file,@RequestParam("uid") int uid){
        System.out.println("========upLoadUserFigure==========");
        GDao dao = new GDao();
        dao.setFile(file);
        dao.setUid(uid);
        Map<Object, Object> map = uploadService.uploadUserFigure(dao, request);
        return map;
    }

    /**
     * 更新用户信息
     *
     * @param userContent userContent uid nickName gender signature birthDate
     * @return
     */
    @RequestMapping("/uploadUserContent")
    public Map<Object,Object> uploadUserContent(@RequestBody UserContent userContent){
        System.out.println("========upLoadUserContent==========");
        Map<Object, Object> map = uploadService.uploadUserContent(userContent, request);
        return map;
    }

    /**
     * 添加用户
     *
     * @param dao userContent user
     * @return
     */
    @RequestMapping("/insertUserContent")
    public Map<Object,Object> insertUserContent(@RequestBody GDao dao){
        System.out.println("========insertUserContent==========");
        Map<Object, Object> map = userService.insertUserContent(dao);
        return map;
    }

    /**
     * 删除用户
     *
     * @param dao uid
     * @return
     */
    @RequestMapping("/deleteUserContent")
    public Map<Object,Object> deleteUserContent(@RequestBody GDao dao){
        System.out.println("========deleteUserContent==========");
        Map<Object, Object> map = userService.deleteUserContent(dao);
        return map;
    }


}
