package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserInquires;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInquiresMapper {
    //전체 문의 목록 조회
    List<UserInquires> findAll();

    //문의 ID로 조회
    UserInquires findByInquireId(Integer inquireId);

    // 문의 회원ID로 조회
    List<UserInquires> findByUserId(@Param("userId") String userId);

    // 카테고리 조회
    List<UserInquires> findByCategory(@Param("inquireCategory") String inquireCategory);

    // 상태 조회
    List<UserInquires> findByState(@Param("inquiryState") String inquiryState);

    List<UserInquires> findWithFilters(String userId, String category, String state);

    // 상태 업데이트
    int updateState(@Param("inquireId") Integer inquireId,
                    @Param("inquiryState") String inquiryState);

    // 논리적 삭제
    int deactivateInquire(@Param("inquireId") Integer inquireId);

}