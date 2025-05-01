package com.artu.fullstack_team_project_administrator.service.postings;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

public interface PostingsService{
    List<Postings> findActivePosts();

    // 신고된 게시글 조회 (is_used = false, is_deleted = false)
    List<Postings> findReportedPosts();

    // 비활성화된 게시글 조회 (is_used = false, is_deleted = true)
    List<Postings> findDeactivatedPosts();

    // 게시글 단건 조회
    Postings selectByPostId(Integer postId);

    // 신고된 게시글을 비활성화 처리 (is_used = false, is_deleted = true)
    boolean deactivatePost(Integer postId, String deletedReason, LocalDate deletedAt);

    // 잘못 신고된 게시글 복원 (is_used = true, is_deleted = false)
    boolean reactivatePost(Integer postId);
}
