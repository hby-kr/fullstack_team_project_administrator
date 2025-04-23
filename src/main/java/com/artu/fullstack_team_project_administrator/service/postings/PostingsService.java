package com.artu.fullstack_team_project_administrator.service.postings;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

public interface PostingsService{
    List<Postings> findDeactivatedPosts();

    boolean activatePostings(Integer postId);

    boolean deactivatePostings(Integer postId, String reason, LocalDate deletedAt);


    List<Postings> getDeactivatedPosts();
}
