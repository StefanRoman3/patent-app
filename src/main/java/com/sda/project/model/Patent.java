package com.sda.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "patent")
public class Patent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patentId;
    private String name;
    private String description;
    private String country;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}
