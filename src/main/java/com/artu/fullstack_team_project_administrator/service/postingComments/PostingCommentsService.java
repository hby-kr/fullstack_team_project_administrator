package com.artu.fullstack_team_project_administrator.service.postingComments;

import com.artu.fullstack_team_project_administrator.dto.PostingComments;

import java.time.LocalDate;
import java.util.List;

public interface PostingCommentsService {
    // 게시글이 삭제될 때 댓글 전체 비활성화
    void deactivateCommentsByPostId(Integer postId, String deletedReason, LocalDate deletedAt);

    // 게시글이 복원될 때 댓글 전체 복원
    void restoreCommentsByPostId(Integer postId);
    // 잘못 신고된 댓글 복원
    boolean reactivateComment(Integer commentId);

    boolean deactivateComment(Integer commentId, String deletedReason, LocalDate deletedAt);

    List<PostingComments> findReportedComments();
    List<PostingComments> findDeletedComments();
}
