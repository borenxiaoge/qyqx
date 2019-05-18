package qyqx.org.data.po;

import java.util.Date;

public class AccBook {
    private String accBookId;

    private String accBookName;

    private String openId;

    private String userId;

    private Date lastUpTime;

    public String getAccBookId() {
        return accBookId;
    }

    public void setAccBookId(String accBookId) {
        this.accBookId = accBookId == null ? null : accBookId.trim();
    }

    public String getAccBookName() {
        return accBookName;
    }

    public void setAccBookName(String accBookName) {
        this.accBookName = accBookName == null ? null : accBookName.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLastUpTime() {
        return lastUpTime;
    }

    public void setLastUpTime(Date lastUpTime) {
        this.lastUpTime = lastUpTime;
    }
}