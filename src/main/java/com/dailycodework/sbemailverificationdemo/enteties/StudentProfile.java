package com.dailycodework.sbemailverificationdemo.enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentProfileID;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String fullName;
    private String bio;
    private String projects;
    private String skills;
    private String contactInfo;

}

