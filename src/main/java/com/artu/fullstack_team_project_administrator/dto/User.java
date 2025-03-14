package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    public enum Gender {M, F}
    private String userId;
    private String userEmail;
    private String password;
    private String userName;
    private LocalDate userBirth;
    private Gender gender;
    private LocalDate createdAt;
    private Boolean isUsed;
    private LocalDate dropoutAt;

}