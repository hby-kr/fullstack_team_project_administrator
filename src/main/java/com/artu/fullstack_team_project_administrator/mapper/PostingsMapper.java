package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostingsMapper {


    // 신고된 게시글 조회
    List<Postings> findDeactivatedPosts();

    int activatePostings(@Param("postId") Integer postId); // 잘못 신고된 게시글 활성화

//    int deleteByPrimaryKey(Integer postId);
//
//    int insert(Postings record);
//
//    int insertSelective(Postings record);

    Postings selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(Postings record);

    int updateByPrimaryKey(Postings record);
}