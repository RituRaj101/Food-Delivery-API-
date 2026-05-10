package com.fooddelivery.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fooddelivery.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "foodUser")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	@Id
	@SequenceGenerator(name = "id_generator",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "id_generator",strategy = GenerationType.SEQUENCE)
	private Long userId;
	
	@Column(name = "name",length = 50)
	private String name;
	
	@Column(name = "email",length = 100)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phoneNumber",length = 10)
	private String phoneNumber;
	
	@Column(name = "address",length = 100)
	private String address;
	
	@Column(name = "role",length = 20)
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@Column(name = "IsActive")
	private boolean IsActive;
	
	@Column(name = "createdAt",updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	
	@Column(name = "updatedAt")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
