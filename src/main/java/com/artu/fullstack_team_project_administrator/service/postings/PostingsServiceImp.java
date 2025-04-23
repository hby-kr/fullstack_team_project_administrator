package com.artu.fullstack_team_project_administrator.service.postings;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import com.artu.fullstack_team_project_administrator.mapper.PostingsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PostingsServiceImp implements PostingsService {

    @Autowired
    PostingsMapper postingsMapper;

    @Override
    public List<Postings> findDeactivatedPosts() {
        return (postingsMapper.findDeactivatedPosts());
    }

    @Override
    public boolean activatePostings(Integer postId) {
        return postingsMapper.activatePostings(postId) > 0;
    }

    @Override
    public boolean deactivatePostings(Integer postId, String reason, LocalDate deletedAt) {
        Postings post = new Postings();
        post.setPostId(postId);
        post.setIsUsed(false);
        post.setDeletedReason(reason);
        post.setDeletedAt(java.sql.Date.valueOf(deletedAt));
        return postingsMapper.updateByPrimaryKeySelective(post) > 0;
    }

    @Override
    public List<Postings> getDeactivatedPosts() {
        return postingsMapper.findDeactivatedPosts();
    }
}
