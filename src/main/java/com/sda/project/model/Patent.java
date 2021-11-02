package com.sda.project.model;

import javax.persistence.*;

@Entity
@Table(name = "patent")
public class Patent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patentId;
    private String description;
    private String country;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}
