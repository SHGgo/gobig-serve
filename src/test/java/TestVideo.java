

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.mapper.VideoMapper;
import top.gobig.pojo.Video;
import top.gobig.service.VideoService;
import top.gobig.util.GDao;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestVideo {
    @Autowired
    VideoMapper videoMapper;
    @Autowired
    VideoService videoService;
    @Test
    public void selectByUid() {
        List<Video> videos = videoMapper.selectByUid(1,2);
        for (Video video : videos) {
            System.out.println(video.toString());
        }
    }

    @Test
    public void selectAll() {
        List<Video> videoList = videoMapper.selectAll();
        for (Video video : videoList) {
            System.out.println(video.toString());
        }
    }

    @Test
    public void getSortVideoListTest() {
        GDao gDao = new GDao();
        gDao.setSortName("动画");
        gDao.setVideoNum(5);
        gDao.setPageStart(0);
        List<Video> videoList = videoMapper.selectBySortName(gDao);
        for (Video video : videoList) {
            System.out.println(video.toString());
        }
    }

    @Test
    public void selectTotal() {
        Integer integer = videoMapper.selectTotal();
        System.out.println(integer);
    }

    @Test
    public void getScoreVideoListTest() {
        GDao gDao = new GDao();
        gDao.setVideoNum(10);
        gDao.setPageStart(2);
        List<Video> videoList = videoMapper.selectByScore(gDao);
        for (Video video : videoList) {
            System.out.println(video.toString());
        }
    }

    @Test
    public void getRandomVideo() {
        GDao gDao = new GDao();
        gDao.setVideoNum(10);
        Map<Object, Object> randomVideo = videoService.getRandomVideo(gDao);
        Object videoList = randomVideo.get("videoList");
        System.out.println(videoList);
    }

    @Test
    public void getRandomSortVideo() {
        GDao gDao = new GDao();
        gDao.setVideoNum(10);
        gDao.setSortNum(2);
        Map<Object,Object> randomSortVideo = videoService.getRandomSortVideo(gDao);
        Object videoList = randomSortVideo.get("videoList");
        System.out.println(videoList);
    }

    @Test
    public void selectByIndex() {
        GDao daoTemp = new GDao();
        daoTemp.setIndex(30);
        daoTemp.setVideoNum(1);
        List<Video> videoListTemp = videoMapper.selectByIndex(daoTemp);
        System.out.println(videoListTemp);
    }


}
