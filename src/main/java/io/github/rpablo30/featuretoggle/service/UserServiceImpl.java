package io.github.rpablo30.featuretoggle.service;

import io.github.rpablo30.featuretoggle.dto.UserDto;
import io.github.rpablo30.featuretoggle.entity.User;
import io.github.rpablo30.featuretoggle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository repository;


    public UserDto save(UserDto dto) {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setDateCreated(LocalDateTime.now());
        repository.save(entity);
        return dto;
    }

    public Page<UserDto> findAll(Pageable pageable) {
        Page<User> list = repository.findAll(pageable);
        return list.map(x -> new UserDto(x));
    }
}
