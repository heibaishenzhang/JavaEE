package reglogin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reglogin.dao.UserMapper;
import reglogin.model.User;
import reglogin.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;// 注入dao

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
		return userMapper.selectByUserAndPw(username, password);
	}

}
