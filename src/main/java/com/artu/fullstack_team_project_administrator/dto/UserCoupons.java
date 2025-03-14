package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * user_coupons
 */
public class UserCoupons implements Serializable {
    private Integer couponId;

    private String userId;

    private Integer dcPrice;

    private String couponName;

    private String couponDetails;

    private Boolean requirement;

    private Date endDate;

    private Boolean isUsed;

    private static final long serialVersionUID = 1L;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getDcPrice() {
        return dcPrice;
    }

    public void setDcPrice(Integer dcPrice) {
        this.dcPrice = dcPrice;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponDetails() {
        return couponDetails;
    }

    public void setCouponDetails(String couponDetails) {
        this.couponDetails = couponDetails;
    }

    public Boolean getRequirement() {
        return requirement;
    }

    public void setRequirement(Boolean requirement) {
        this.requirement = requirement;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }
}