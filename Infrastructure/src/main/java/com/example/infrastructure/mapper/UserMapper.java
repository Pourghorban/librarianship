package com.example.infrastructure.mapper;

import com.example.presentation.dto.UserDTO;
import com.example.domain.model.User;

public class UserMapper {
    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setUserType(userDTO.getUserType());
        return user;
    }

    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setUserType(user.getUserType());
        return userDTO;
    }
}
