package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.PostingComments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;
@Mapper
public interface PostingCommentsMapper {

    // 댓글 조회
    List<PostingComments> findCommentsById(@Param("userId") String userId);

    List<PostingComments> findReportedComments();

    List<PostingComments> findDeletedComments();

    PostingComments selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(PostingComments record);
    int updateByPrimaryKey(PostingComments record);

    // 포스트 ID 기준으로 댓글 전체 비활성화
    void deactivateCommentsByPostId(@Param("postId") Integer postId,
                                    @Param("deletedReason") String reason,
                                    @Param("deletedAt") LocalDate deletedAt);

    // 포스트 ID 기준으로 댓글 전체 복원
    void restoreCommentsByPostId(@Param("postId") Integer postId);
    // 잘못 신고된 댓글 복원
    void reactivateComment(@Param("commentId") Integer commentId);
    // 댓글 논리 삭제 처리
    void deactivateComment(@Param("commentId") Integer commentId,
                           @Param("deletedReason") String deletedReason,
                           @Param("deletedAt") LocalDate deletedAt);
}