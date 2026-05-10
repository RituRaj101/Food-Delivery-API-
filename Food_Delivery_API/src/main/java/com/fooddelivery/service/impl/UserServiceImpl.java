package com.fooddelivery.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.fooddelivery.dto.UserRequestDTO;
import com.fooddelivery.dto.UserResponseDTO;
import com.fooddelivery.entity.User;
import com.fooddelivery.enums.UserRole;
import com.fooddelivery.exception.BadRequestException;
import com.fooddelivery.exception.ResourceNotFoundException;
import com.fooddelivery.mapper.UserMapper;
import com.fooddelivery.repository.UserRepository;
import com.fooddelivery.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserResponseDTO registerUser(UserRequestDTO requestDTO) {

        validateEmailUniqueness(requestDTO.getEmail());

        User user = userMapper.toEntity(requestDTO);


        user.setRole(UserRole.CUSTOMER);
        user.setIsActive(true);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        
        User savedUser = userRepository.save(user);

        return userMapper.toDTO(savedUser);
    }

    @Override
    public UserResponseDTO getUserById(Long userId) {

        User user = fetchUserOrThrow(userId);
        return userMapper.toDTO(user);
    }

    @Override
    public UserResponseDTO getUserByEmail(String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + email));

        return userMapper.toDTO(user);
    }

    @Override
    public void deactivateUser(Long userId) {

        User user = fetchUserOrThrow(userId);

        user.setIsActive(false);
        user.setUpdatedAt(LocalDateTime.now());

        userRepository.save(user);
    }


    private void validateEmailUniqueness(String email) {
        if (userRepository.existsByEmail(email)) {
            throw new BadRequestException("Email already exists: " + email);
        }
    }

    private User fetchUserOrThrow(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));
    }
}