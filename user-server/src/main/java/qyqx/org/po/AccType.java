package qyqx.org.po;

import java.util.Date;

public class AccType {
    private String accTypeId;

    private String accTypeName;

    private Integer trdType;

    private String accBookId;

    private String userId;

    private String diyFlag;

    private String iconPath;

    private Date lastUpTime;

    public String getAccTypeId() {
        return accTypeId;
    }

    public void setAccTypeId(String accTypeId) {
        this.accTypeId = accTypeId == null ? null : accTypeId.trim();
    }

    public String getAccTypeName() {
        return accTypeName;
    }

    public void setAccTypeName(String accTypeName) {
        this.accTypeName = accTypeName == null ? null : accTypeName.trim();
    }

    public Integer getTrdType() {
        return trdType;
    }

    public void setTrdType(Integer trdType) {
        this.trdType = trdType;
    }

    public String getAccBookId() {
        return accBookId;
    }

    public void setAccBookId(String accBookId) {
        this.accBookId = accBookId == null ? null : accBookId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDiyFlag() {
        return diyFlag;
    }

    public void setDiyFlag(String diyFlag) {
        this.diyFlag = diyFlag == null ? null : diyFlag.trim();
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }

    public Date getLastUpTime() {
        return lastUpTime;
    }

    public void setLastUpTime(Date lastUpTime) {
        this.lastUpTime = lastUpTime;
    }
}