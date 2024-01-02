package com.dailycodework.sbemailverificationdemo.enteties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internshipID;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    private String title;
    private String description;
    private String requirements;
    private LocalDate postedDate;


}

