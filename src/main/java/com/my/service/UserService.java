package com.my.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.mapper.UserMapper;
import com.my.user.User;
@Service
public class UserService {
	@Resource
	private UserMapper userMapper;
	public List<User> sel() {
		return userMapper.selAll();
	}

}
