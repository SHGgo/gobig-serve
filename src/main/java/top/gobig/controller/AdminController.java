package top.gobig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gobig.pojo.Admin;
import top.gobig.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("**/admin")
public class AdminController {

    @Autowired
    HttpServletRequest request;
    @Autowired
    AdminService adminService;


   /* @RequestMapping("/adminTest")
    public Map<String, Object> adminTest(@RequestBody GDao dao){
        System.out.println("===========adminTest========");
        System.out.println(dao);
        Map<String, Object> claimsMap = new HashMap<>();
        claimsMap.put("aid",1);
        String token = JwtUtils.createToken(claimsMap);
        Map<String, Object> resposeMap = new HashMap<>();
        Map<Object, Object> dataMap = new HashMap<>();
        dataMap.put("token",token);
        resposeMap.put("data",dataMap);
        resposeMap.put("code",20000);
        return resposeMap;
    }*/

    /**
     * 管理员登录
     * @param admin Admin对象 aid、adminAccount、adminPassword
     * @return Map<Object, Object> json对象
     */
    @RequestMapping("/adminLogin")
    public Map<Object, Object> adminLogin(@RequestBody Admin admin){
        System.out.println("===========adminLogin========");
        Map<Object, Object> map = adminService.adminLogin(admin, request);
        return map;
    }

    /**
     * 获取管理员信息
     * @return Map<Object, Object> json对象
     */
    @RequestMapping("/getAdminInfo")
    public Map<Object, Object> getAdminInfo(){
        System.out.println("===========adminInfo========");
        Map<Object, Object> map = adminService.getAdminInfo(request);
        return map;
    }

    /**
     * 获取管理员信息
     * @return Map<Object, Object> json对象
     */
    @RequestMapping("/adminLogout")
    public Map<Object, Object> adminLogout(){
        System.out.println("===========adminLogout========");
        Map<Object, Object> map = new HashMap<>();
        map.put("status",20000);
        map.put("data","success");
        return map;
    }
}
