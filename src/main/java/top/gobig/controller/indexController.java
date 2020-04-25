package top.gobig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gobig.pojo.Sort;
import top.gobig.service.SortService;
import top.gobig.service.VideoService;
import top.gobig.util.GDao;

import java.util.List;
import java.util.Map;


//相当于@Controller+@ResponseBody两个注解的结合，
// 返回json数据不需要在方法前面加@ResponseBody注解了，
// 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
@RestController
@RequestMapping({"**/index"})
public class indexController {
    @Autowired
    private SortService sortService;
    @Autowired
    private VideoService videoService;


    /**
     * 获取随机的视频列表信息
     * @param dao videoNum
     * @return
     */
    @RequestMapping("/getRandomVideo")
    public Map<Object, Object> getRandomVideo(@RequestBody GDao dao) {
        System.out.println("getRandomVideo");
        Map<Object, Object> randomVideo = videoService.getRandomVideo(dao);
        return randomVideo;
    }

    /**
     * 获取视频分类信息
     * @param dao num
     * @return
     */
    @RequestMapping("/getSortNameList")
    public List<Sort> getSortNameList(@RequestBody GDao dao) {
        System.out.println("getSortNameList");
        int num = dao.getNum();
        List<Sort> sortList = sortService.list(num);
        return sortList;
    }


    /**
     * 获取 多个随机分类的视频 信息
     * @param dao videoNum  sortNum
     * @return
     */
    @RequestMapping("/getRandomSortVideo")
    public Map<Object,Object> getRandomSortVideo(@RequestBody GDao dao) {
        System.out.println("getRandomSortVideo");
        System.out.println(dao.toString());
        Map<Object, Object> randomSortVideo = videoService.getRandomSortVideo(dao);
        return randomSortVideo;
    }

}
