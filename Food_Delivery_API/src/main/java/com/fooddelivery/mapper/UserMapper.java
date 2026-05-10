package com.fooddelivery.mapper;

import org.springframework.stereotype.Component;

import com.fooddelivery.dto.UserRequestDTO;
import com.fooddelivery.dto.UserResponseDTO;
import com.fooddelivery.entity.User;

@Component
public class UserMapper {

    public User toEntity(UserRequestDTO dto) {

        if (dto == null) {
            return null;
        }

        User user = new User();

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setAddress(dto.getAddress());

        return user;
    }

    public UserResponseDTO toDTO(User user) {

        if (user == null) {
            return null;
        }

        UserResponseDTO dto = new UserResponseDTO();

        dto.setUserId(user.getUserId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setAddress(user.getAddress());

        return dto;
    }
}