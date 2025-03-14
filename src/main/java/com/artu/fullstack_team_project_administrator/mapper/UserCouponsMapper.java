package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserCoupons;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCouponsMapper {


    // 쿠폰 목록 조회
    List<UserCoupons> findCouponsById(@Param("Id") String userId);

    // 쿠폰 삽입
    int insertCoupon(UserCoupons coupon);

    // 쿠폰 수정
    int updateCoupon(UserCoupons coupon);


    // 쿠폰 삭제
    int deleteCoupon(@Param("couponId") String couponId);



    int deleteByPrimaryKey(Integer couponId);

    int insert(UserCoupons record);

    int insertSelective(UserCoupons record);

    UserCoupons selectByPrimaryKey(Integer couponId);

    int updateByPrimaryKeySelective(UserCoupons record);

    int updateByPrimaryKey(UserCoupons record);
}