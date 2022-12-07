package io.github.rpablo30.featuretoggle.service;

import io.github.rpablo30.featuretoggle.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    UserDto save(UserDto dto);

    Page<UserDto> findAll(Pageable pageable);

    Optional<UserDto> findById(Long Id);

    void delete(Long id);

}
