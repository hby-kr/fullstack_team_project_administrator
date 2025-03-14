package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {
    // 전체 회원 목록 조회
    List<User> findAll();

    // 특정 회원 조회
    User findById(@Param("id") String userId);

    // 회원 삽입 // insert 연습삼아 만들지만 관리자 페이지에 필요하지는 않을 것
    int insert(User user);

    // 회원 정보 수정
    int update(User user);

    // 회원 삭제 (논리 삭제: is_used 값을 false로 변경)
    int delete(@Param("id") String userId);



}



/*
회원전체 불러오기

    회원 검색
    수정
    삭제 = 회원 논리삭제

    상세정보 조회
        로그인 기록
        회원의 공연목록
        회원의 리뷰,
        회원의 댓글

        쿠폰 crud
        포인트 사용 내역조회 crud
        구매 내역

        회원 문의 검색 / 답변관리

    팔로워-팔로이 관계



DB CRUD만들기
+ 삭제는 논리 삭제

관리자 사이트에서 CRUD 필요한 것들?
    카테고리

    공연데이터 event
    공연자 actor
    소속사 agency
    공연 티켓 event dates
    공연 리뷰

    검색어
    해시태그

    포스팅
    포스팅의 댓글







    채팅방







 */