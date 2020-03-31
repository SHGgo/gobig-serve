

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.gobig.pojo.UserContent;
import top.gobig.service.UploadService;

import java.util.Date;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUpload {

    @Autowired
    UploadService uploadService;

    @Test
    public void upLoadUserContent() {
        UserContent userContent = new UserContent();
        userContent.setUid(1);
        userContent.setNickName("root");
        userContent.setSignature("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        Date date = new Date();
        userContent.setBirthDate(date);
        userContent.setGender("1");
        Map<Object, Object> map = uploadService.uploadUserContent(userContent, null);
        String status = map.get("status").toString();
        System.out.println(status);
    }
}
