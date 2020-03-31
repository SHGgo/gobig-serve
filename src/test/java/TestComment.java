import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.mapper.CommentMapper;
import top.gobig.pojo.Comment;
import top.gobig.util.GDao;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestComment {
    @Autowired
    CommentMapper commentMapper;
    @Test
    public void selectByUidTest() {
        GDao gDao = new GDao();
        gDao.setUid(1);
        List<Comment> comments = commentMapper.selectByVid(gDao);
        for (Comment comment : comments) {
            System.out.println("comment = " + comment.toString());
        }
    }

}
