package com.tobeto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.dto.login.LoginRequestDTO;
import com.tobeto.dto.login.LoginResponseDTO;

@RestController
@RequestMapping("/api/v1")
//@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@PostMapping("/login")
	// CrossOrigin Annotation'ı eklemek. Her yazılan metodun başına yazmak gerekir.
	// Class'ın başın yazsaydık da olurdu fakat birden fazla classımız olacak bunu
	// her class'a yazacak mıyız?
	public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO dto) {
		if (dto.getEmail().equals(dto.getPassword())) {
			return ResponseEntity.ok(new LoginResponseDTO("59e0876548906743958"));
		} else {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}
}
