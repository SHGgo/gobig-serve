package top.gobig.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;
import top.gobig.pojo.User;
import top.gobig.pojo.UserContent;

@Getter
@Setter
@ToString
public class GDao {

    private User user;
    private UserContent userContent;

    private int num;
    private int index;

    private Integer uid;
    private String nickName;

    private int videoNum;
    private int vid;

    private int sortNum;
    private int sortShowBlockNum;
    private String sortName;

    private int pageStart;      //每页开始的index
    private int pageLast;       //总数
    private int pageItemNum;    //一页元素的数量

    private int commentNum;

    private String searchKeyWord;
    private String searchCondition;

    MultipartFile file;

    private String username;
    private String password;

}
