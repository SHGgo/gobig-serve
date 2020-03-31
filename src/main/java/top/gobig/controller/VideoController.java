package top.gobig.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.gobig.pojo.Video;
import top.gobig.service.UploadService;
import top.gobig.service.VideoService;
import top.gobig.util.GDao;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"**/video"})
public class VideoController {

    @Autowired
    VideoService videoService;
    @Autowired
    UploadService uploadService;
    @Autowired
    HttpServletRequest request;

    /*    @RequestMapping("")
    public String aa(){
        return "asdas";
    }*/

    @RequestMapping("/getUserVideoList")
    public List<Video> getUserVideoList(@RequestBody GDao dao) {
        System.out.println("=============getUserVideoList===========");
        //        System.out.println("getUserVideoList dao.toString()=" + dao.toString());
        List<Video> videoList = videoService.getUserVideoList(dao);
        return videoList;
    }

    @RequestMapping("/getSortVideoList")
    public Map<Object, Object> getSortVideoList(@RequestBody GDao dao) {
        System.out.println("=============getSortVideoList===========");
        Map<Object, Object> res = videoService.getSortVideoList(dao);
        return res;
    }

    @RequestMapping("/getScoreVideoList")
    public Map<Object, Object> getScoreVideoList(@RequestBody GDao dao) {
        System.out.println("=============getScoreVideoList===========");
        Map<Object, Object> res = videoService.getScoreVideoList(dao);
        return res;
    }

    @RequestMapping("/getOneVideo")
    public Map<Object, Object> getOneVideo(@RequestBody GDao dao){
        System.out.println("=============getOneVideo===========");
        Map<Object, Object> res = videoService.getOneVideo(dao);
        return res;
    }

    @RequestMapping("/uploadVideoFile")
    public Map<Object, Object> uploadVideoFile(@RequestParam("videoFile") MultipartFile videoFile,
                                               @RequestParam("picFile") MultipartFile picFile,
                                               @RequestParam("vid") int vid){
        System.out.println("=============uploadVideoFile===========");
        Map<Object, Object> map = uploadService.uploadVideoFile(videoFile, picFile, vid, request);
        return map;
    }

    @RequestMapping("/uploadVideoContent")
    public Map<Object, Object> uploadVideoContent(@RequestBody Video video){
        System.out.println("=============uploadVideoContent===========");
        Map<Object, Object> map = uploadService.uploadVideoContent(video, request);
        return map;
    }
}
