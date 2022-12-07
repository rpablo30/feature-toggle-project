package io.github.rpablo30.featuretoggle.dto;

import io.github.rpablo30.featuretoggle.entities.User;
import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String password;

    public UserDto() {

    }

    public UserDto(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public UserDto(User entity) {
        this.name = entity.getName();
        this.password = entity.getPassword();
    }

}
