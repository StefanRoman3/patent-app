package com.sda.project.service;

import com.sda.project.Mapper.PatentMapper;
import com.sda.project.dto.PatentDto;
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

    private final PatentMapper patentMapper;
    private final PatentRepository patentRepository;

    @Autowired
    public PatentService(PatentMapper patentMapper, PatentRepository patentRepository) {
        this.patentMapper = patentMapper;
        this.patentRepository = patentRepository;
    }

    public List<Patent> findAll() {
        log.info("find all patents");

        return patentRepository.findAll();
    }

    public Optional<Patent> findByUserId(long userId) {
        log.info("find all patents by user Id");

        return patentRepository.findById(userId);
    }

    public PatentDto save(PatentDto patentDto) {

        Patent patent = patentMapper.map(patentDto);
        Patent savedPatent = patentRepository.save(patent);
        PatentDto savedDto = patentMapper.map(savedPatent);
        return savedDto;
    }
}


