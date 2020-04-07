package top.gobig.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class GDao {

    private int num;
    private int index;

    private Integer uid;
    private String nickName;

    private int videoNum;
    private int vid;

    private int sortNum;
    private int sortShowBlockNum;
    private String sortName;

    private int pageStart;
    private int pageLast;
    private int pageItemNum;

    private int commentNum;

    private String searchKeyWord;
    private String searchCondition;

    MultipartFile file;

    private String username;
    private String password;

}
