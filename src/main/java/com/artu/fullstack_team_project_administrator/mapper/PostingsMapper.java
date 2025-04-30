package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostingsMapper {


    // 활성화된 게시글
    List<Postings> findAllByIsUsed(@Param("bool") boolean bool);

    // 신고된 게시글
    List<Postings> findReportedPosts(); // is_used = false, is_deleted = false

    // 비활성화된 게시글
    List<Postings> findDeactivatedPosts(); // is_used = false, is_deleted = true

    // 게시글 1개 조회
    Postings selectByPrimaryKey(Integer postId);

    // 게시글 상태 수정
    int updateByPrimaryKeySelective(Postings post);
}