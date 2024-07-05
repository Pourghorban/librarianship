package com.example.presentation.dto;

import com.example.domain.model.UserType;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private UserType userType;
}
