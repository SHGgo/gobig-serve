package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.AdminContentMapper;
import top.gobig.mapper.AdminMapper;
import top.gobig.pojo.Admin;
import top.gobig.pojo.AdminContent;
import top.gobig.service.AdminService;
import top.gobig.util.JwtUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    AdminContentMapper adminContentMapper;

    @Override
    public Map<Object, Object> adminLogin(Admin admin, HttpServletRequest request) {
        Map<Object, Object> resposeMap = new HashMap<>();
        //1.验证账号和密码
        System.out.println(admin);
        Admin adminRes = adminMapper.selectByAdminAccountAndPwd(admin);
        if (adminRes == null){
            resposeMap.put("status",40100);
        }else {
            //2.创建token
            Map<String, Object> claimsMap = new HashMap<>();
            Map<Object, Object> dataMap = new HashMap<>();
            claimsMap.put("aid",adminRes.getAid());
            String token = JwtUtils.createToken(claimsMap);
            dataMap.put("token",token);
            resposeMap.put("data",dataMap);
            resposeMap.put("status",20000);
        }
        return resposeMap;
    }

    @Override
    public Map<Object, Object> getAdminInfo(HttpServletRequest request) {
        Map<Object, Object> resMap = new HashMap<>();
        String token = request.getHeader("Authorization");
        int resNum = JwtUtils.verifyToken(token);
        if (resNum==1){
            Integer aid = (int) JwtUtils.parseToken(token).get("aid");
            AdminContent adminContent = adminContentMapper.selectByPrimaryKey(aid);
            resMap.put("status",20000);
            resMap.put("data",adminContent);
        }else {
            resMap.put("status",50008);
        }
        return resMap;
    }
}
