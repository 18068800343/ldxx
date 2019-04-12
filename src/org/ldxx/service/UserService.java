package org.ldxx.service;

import java.util.List;

import org.ldxx.bean.User;

public interface UserService {

	int addUser(User user);

	int deleteUser(String userId);

	int updateUser(User user);

	List<User> selectAllUser();

	User selectUserById(String userId);
	
	String countUsername(String username);

	User selectUserByusername(String username);
	
	int countOfusername(String username);

	int countOfusernameEdit(String username, String userId);

	int updatePasswordById(String userId, String new_password);


	


}
