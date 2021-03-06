package reglogin.service;

import java.util.List;

import reglogin.model.User;

public interface IUserService {

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	void addUser(User user);

	/**
	 * 根据用户id获取用户
	 * 
	 * @param userId
	 * @return
	 */
	User getUserById(String userId);
	
	User getUserByNameAndPw(String username, String password);
	
	List<User> getAllUser();
}
