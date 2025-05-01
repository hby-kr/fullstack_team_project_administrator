package com.artu.fullstack_team_project_administrator.service.postingComments;

import com.artu.fullstack_team_project_administrator.dto.PostingComments;
import com.artu.fullstack_team_project_administrator.mapper.PostingCommentsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostingCommentsServiceImp implements PostingCommentsService {

    private final PostingCommentsMapper postingCommentsMapper;

    @Override
    public void deactivateCommentsByPostId(Integer postId, String deletedReason, LocalDate deletedAt) {
        postingCommentsMapper.deactivateCommentsByPostId(postId, deletedReason, deletedAt);
    }

    @Override
    public void restoreCommentsByPostId(Integer postId) {
        postingCommentsMapper.restoreCommentsByPostId(postId);
    }

    @Override
    public boolean reactivateComment(Integer commentId) {
        postingCommentsMapper.reactivateComment(commentId);
        return true;
    }

    @Override
    public boolean deactivateComment(Integer commentId, String deletedReason, LocalDate deletedAt) {
        postingCommentsMapper.deactivateComment(commentId, deletedReason, deletedAt);
        return true;
    }

    @Override
    public List<PostingComments> findReportedComments() {
        return postingCommentsMapper.findReportedComments();
    }

    @Override
    public List<PostingComments> findDeletedComments() {
        return postingCommentsMapper.findDeletedComments();
    }
}
