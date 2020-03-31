

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class )
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUtils {
    @Test
    public void getTime() {
        Date date = new Date();
        System.out.println(date.getTime());
    }
}
