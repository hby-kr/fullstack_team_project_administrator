package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Inquiry;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryMapper {
    int deleteByPrimaryKey(Integer inquiryId);

    int insert(Inquiry record);

    int insertSelective(Inquiry record);

    Inquiry selectByPrimaryKey(Integer inquiryId);

    int updateByPrimaryKeySelective(Inquiry record);

    int updateByPrimaryKey(Inquiry record);
}