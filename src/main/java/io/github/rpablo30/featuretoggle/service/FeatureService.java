package io.github.rpablo30.featuretoggle.service;

import io.github.rpablo30.featuretoggle.dto.FeatureDto;
import io.github.rpablo30.featuretoggle.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FeatureService {

    FeatureDto save(UserDto dto);

    Page<FeatureDto> findAll(Pageable pageable);

    Optional<FeatureDto> findById(Long Id);

    void delete(Long id);

}
