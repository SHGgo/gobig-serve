package top.gobig.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString@Getter@Setter
public class Video {
    private Integer vid;

    private String title;

    private Integer uid;

    private String author;

    private String introduction;

    private String sortName;

    private Date releaseDate;

    private Integer viewCount;

    private Integer commentCount;

    private Integer collectCount;

    private String pic;

    private String videoRes;

    private Integer vScore;
}