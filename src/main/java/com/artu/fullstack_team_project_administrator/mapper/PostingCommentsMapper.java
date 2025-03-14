package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.PostingComments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostingCommentsMapper {

    // 댓글 조회
    List<PostingComments> findCommentsById(@Param("Id") String userId);


    int deleteByPrimaryKey(Integer commentId);

    int insert(PostingComments record);

    int insertSelective(PostingComments record);

    PostingComments selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(PostingComments record);

    int updateByPrimaryKey(PostingComments record);
}