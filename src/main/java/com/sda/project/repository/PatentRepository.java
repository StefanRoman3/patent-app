package com.sda.project.repository;

import com.sda.project.model.Patent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatentRepository extends JpaRepository<Patent, Long> {
    Optional<Patent> findPatentByPatentId(Long patentId);

}
