package com.artu.fullstack_team_project_administrator.service.postings;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import com.artu.fullstack_team_project_administrator.mapper.PostingsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostingsServiceImp implements PostingsService {

    @Autowired
    private PostingsMapper postingsMapper;

    @Override
    public List<Postings> findActivePosts() {
        return postingsMapper.findAllByIsUsed(true);
    }

    @Override
    public List<Postings> findReportedPosts() {
        return postingsMapper.findReportedPosts();
    }

    @Override
    public List<Postings> findDeactivatedPosts() {
        return postingsMapper.findDeactivatedPosts();
    }

    @Override
    public Postings selectByPostId(Integer postId) {
        return postingsMapper.selectByPrimaryKey(postId);
    }

    @Override
    public boolean deactivatePost(Integer postId, String deletedReason, LocalDate deletedAt) {
        Postings post = new Postings();
        post.setPostId(postId);
        post.setIsUsed(false);
        post.setIsDeleted(true);
        post.setDeletedReason(deletedReason);
        post.setDeletedAt(LocalDate.now());
        return postingsMapper.updateByPrimaryKeySelective(post) > 0;
    }

    @Override
    public boolean reactivatePost(Integer postId) {
        Postings post = new Postings();
        post.setPostId(postId);
        post.setIsUsed(true);
        post.setIsDeleted(false);
        return postingsMapper.updateByPrimaryKeySelective(post) > 0;
    }
}