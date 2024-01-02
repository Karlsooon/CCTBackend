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
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employerID;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String companyName;
    private String industry;
    private String contactInfo;

}

