package com.aifortune.authdemo.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aifortune.authdemo.dao.UserMapper;
import com.aifortune.authdemo.model.User;
import com.aifortune.authdemo.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;// 注入dao
	
	private  final Logger LOG = Logger.getLogger(getClass());

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);

	}

	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(Long.parseLong(userId));
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

	public User getUserByNameAndPw(String username, String password) {
		// TODO Auto-generated method stub
		LOG.info("======>1  name: " + username + " ,password" + password);
		return userMapper.selectByUserAndPw(username, password);
	}

}
