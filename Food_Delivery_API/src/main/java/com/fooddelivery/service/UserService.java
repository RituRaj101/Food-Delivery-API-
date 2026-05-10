package com.fooddelivery.service;

import com.fooddelivery.dto.UserRequestDTO;
import com.fooddelivery.dto.UserResponseDTO;

public interface UserService {
	

	UserResponseDTO registerUser(UserRequestDTO requestDTO);

	UserResponseDTO getUserById(Long userId);

	UserResponseDTO getUserByEmail(String email);

	void deactivateUser(Long userId);
}
