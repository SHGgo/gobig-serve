package top.gobig.service;

import org.springframework.web.multipart.MultipartFile;
import top.gobig.pojo.UserContent;
import top.gobig.pojo.Video;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface UploadService {


    /**
     * @param dao     uid
     * @param request
     * @return
     */
    Map<Object, Object> uploadUserFigure(GDao dao, HttpServletRequest request);


    Map<Object, Object> uploadVideoContent(Video video, HttpServletRequest request);

    Map<Object, Object> uploadVideoFile(MultipartFile videoFile, MultipartFile picFile, int vid, HttpServletRequest request);

    /**
     * @param userContent uid nickName gender signature birthDate
     * @param request
     * @return
     */
    Map<Object, Object> uploadUserContent(UserContent userContent, HttpServletRequest request);
}
