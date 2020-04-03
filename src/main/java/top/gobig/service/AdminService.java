package top.gobig.service;

import top.gobig.pojo.Admin;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface AdminService {

    Map<Object,Object> adminLogin(Admin admin, HttpServletRequest request);

    Map<Object,Object> getAdminInfo(HttpServletRequest request);
}
