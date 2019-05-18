package qyqx.org.data.po;

import java.math.BigDecimal;
import java.util.Date;

public class AccDetail {
    private String accDetailId;

    private String accTypeId;

    private String accBookId;

    private String userId;

    private BigDecimal trdAmount;

    private Date trdDate;

    private Integer trdType;

    private String remark;

    private Date lastUpTime;

    public String getAccDetailId() {
        return accDetailId;
    }

    public void setAccDetailId(String accDetailId) {
        this.accDetailId = accDetailId == null ? null : accDetailId.trim();
    }

    public String getAccTypeId() {
        return accTypeId;
    }

    public void setAccTypeId(String accTypeId) {
        this.accTypeId = accTypeId == null ? null : accTypeId.trim();
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

    public BigDecimal getTrdAmount() {
        return trdAmount;
    }

    public void setTrdAmount(BigDecimal trdAmount) {
        this.trdAmount = trdAmount;
    }

    public Date getTrdDate() {
        return trdDate;
    }

    public void setTrdDate(Date trdDate) {
        this.trdDate = trdDate;
    }

    public Integer getTrdType() {
        return trdType;
    }

    public void setTrdType(Integer trdType) {
        this.trdType = trdType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getLastUpTime() {
        return lastUpTime;
    }

    public void setLastUpTime(Date lastUpTime) {
        this.lastUpTime = lastUpTime;
    }
}