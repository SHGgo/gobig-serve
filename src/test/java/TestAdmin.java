import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.mapper.AdminMapper;
import top.gobig.pojo.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAdmin {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void select() {
        Admin admins = adminMapper.selectByPrimaryKey(1);
        System.out.println(admins.toString());
    }

    @Test
    public void selectByAdminAccountAndPwdTest() {
        Admin admin = new Admin();
        admin.setAdminAccount("admin");
        admin.setAdminPassword("12341");
        Admin admin1 = adminMapper.selectByAdminAccountAndPwd(admin);
        System.out.println(admin1.toString());
    }
}
