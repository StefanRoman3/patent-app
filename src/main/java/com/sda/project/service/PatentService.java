package com.sda.project.service;

import com.sda.project.model.Patent;
import com.sda.project.repository.PatentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatentService {

    private static final Logger log = LoggerFactory.getLogger(PatentService.class);

    private final PatentRepository patentRepository;

    @Autowired
    public PatentService(PatentRepository patentRepository) {
        this.patentRepository = patentRepository;
    }

    public Patent save(Patent patent) {
        return patentRepository.save(patent);
    }

    public List<Patent> findAll() {
        log.info("find all patents");

        return patentRepository.findAll();
    }

    public Optional<Patent> findByUserId(long userId) {
        log.info("find all patents by user Id");

        return patentRepository.findById(userId);
    }
}


