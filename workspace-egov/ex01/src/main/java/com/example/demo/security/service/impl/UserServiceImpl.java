package com.example.demo.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.security.mapper.UserMapper;
import com.example.demo.security.service.CustomUserDetail;
import com.example.demo.security.service.UserService;
import com.example.demo.security.service.UserVO;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	
	@Autowired UserMapper userMapper;

	@Override
	public UserVO getUser(String userId) {
		return userMapper.getUser(userId);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVO user = userMapper.getUser(username);
		if (user == null) {
			throw new UsernameNotFoundException("Not found ID");
		}
		return new CustomUserDetail(user);
	}

}
