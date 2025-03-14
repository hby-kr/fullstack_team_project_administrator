package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostingsMapper {


    // 게시글 조회
    List<Postings> findPostsById(@Param("Id") String userId);

    int deleteByPrimaryKey(Integer postId);

    int insert(Postings record);

    int insertSelective(Postings record);

    Postings selectByPrimaryKey(Integer postId);

    int updateByPrimaryKeySelective(Postings record);

    int updateByPrimaryKey(Postings record);
}