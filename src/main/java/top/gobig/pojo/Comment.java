package top.gobig.pojo;

import java.util.Date;

public class Comment {
    private Integer cid;

    private Integer vid;

    private Integer fromUid;

    private String fromUidName;

    private String content;

    private Date releaseDate;

    private Integer likeCount;

    private String fromUidFigure;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public String getFromUidName() {
        return fromUidName;
    }

    public void setFromUidName(String fromUidName) {
        this.fromUidName = fromUidName == null ? null : fromUidName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getFromUidFigure() {
        return fromUidFigure;
    }

    public void setFromUidFigure(String fromUidFigure) {
        this.fromUidFigure = fromUidFigure == null ? null : fromUidFigure.trim();
    }
}