package com.example.demo.security.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	UserVO getUser(String userId);

}
