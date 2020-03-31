
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.mapper.SortMapper;
import top.gobig.pojo.Sort;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSort {
    @Autowired
    SortMapper sortMapper;

    @Test
    public void userMapperTest() {
        List<Sort> list = sortMapper.list(2);
        for (Sort sort : list) {
            System.out.println("sort = " + sort);
        }
    }

}
