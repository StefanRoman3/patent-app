package com.sda.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatentDto {
    private Long patentId;
    private String description;
    private String country;
}
