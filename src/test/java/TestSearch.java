

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.mapper.VideoMapper;
import top.gobig.service.SearchService;
import top.gobig.util.GDao;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class )
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSearch {

    @Autowired
    VideoMapper videoMapper;
    @Autowired
    SearchService searchService;

    @Test
    public void selectByKeyWordTest() {
        GDao gDao = new GDao();
        gDao.setVideoNum(3);
        gDao.setSearchKeyWord("o");
        gDao.setPageStart(0);
        Integer integer = videoMapper.selectByKeyWordCount(gDao);
        System.out.println(integer);
    }

    @Test
    public void searchVideoTest() {
        GDao gDao = new GDao();
        gDao.setVideoNum(3);
        gDao.setSearchKeyWord("视频");
        gDao.setPageStart(0);
        gDao.setPageLast(23);
        Map<String, Object> stringObjectMap = searchService.searchVideo(gDao);
        for (Map.Entry<String, Object> stringObjectEntry : stringObjectMap.entrySet()) {
            System.out.println(stringObjectEntry);
        }
    }
}
