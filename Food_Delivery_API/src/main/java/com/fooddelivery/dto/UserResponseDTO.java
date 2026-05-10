package com.fooddelivery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class UserResponseDTO {

	private Long userId;
	
	private	String name;

	private	String email;

	private	String phoneNumber;

	private	String address;
}
