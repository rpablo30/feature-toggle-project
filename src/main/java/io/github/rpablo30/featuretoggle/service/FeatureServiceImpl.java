package io.github.rpablo30.featuretoggle.service;


import io.github.rpablo30.featuretoggle.dto.FeatureDto;
import io.github.rpablo30.featuretoggle.dto.UserDto;
import io.github.rpablo30.featuretoggle.entity.Feature;
import io.github.rpablo30.featuretoggle.entity.User;
import io.github.rpablo30.featuretoggle.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class FeatureServiceImpl {

    @Autowired
    private FeatureRepository repository;


    public FeatureDto save(FeatureDto dto) {
        Feature entity = new Feature();
        entity.setName(dto.getName());
        entity.setActive(dto.getActive());
        entity.setDateCreated(LocalDateTime.now());
        repository.save(entity);
        return dto;
    }


    public Page<FeatureDto> findAll(Pageable pageable) {
        Page<Feature> list = repository.findAll(pageable);
        return list.map(x -> new FeatureDto(x));
    }


    public Optional<FeatureDto> findById(Long id) {
        Optional<Feature> FeatureOptional = repository.findById(id);
        Feature entity = FeatureOptional.get();
        return Optional.of(new FeatureDto(entity));
    }

    public FeatureDto update(Long id, FeatureDto dto) {
        Optional<Feature> featureOptional = repository.findById(id);
        Feature entity = new Feature();
        entity.setName(dto.getName());
        entity.setActive(dto.getActive());
        repository.save(entity);
        return new FeatureDto(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }














}
