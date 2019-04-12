package org.ldxx.service.impl;

import java.util.List;

import org.ldxx.bean.User;
import org.ldxx.dao.UserDao;
import org.ldxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public int addUser(User user) {
		int i= userDao.addUser(user);
		return i;
	}

	@Override
	public int deleteUser(String userId) {
		return userDao.deleteUser(userId);
	}

	@Override
	public int updateUser(User user) {
		int i= userDao.updateUser(user);
		return i;
	}

	@Override
	public List<User> selectAllUser() {
		return userDao.selectAllUser();
	}

	@Override
	public User selectUserById(String userId) {
		return userDao.selectUserById(userId);
	}

	@Override
	public int countOfusername(String username) {
		return userDao.countOfusername(username);
	}

	

	@Override
	public int countOfusernameEdit(String username, String userId) {
		return userDao.countOfusernameEdit(username,userId);
	}

	

	@Override
	public String countUsername(String username) {
		return userDao.countUsername(username);
	}

	@Override
	public User selectUserByusername(String username) {
		return userDao.selectUserByusername(username);
	}

	@Override
	public int updatePasswordById(String userId, String new_password) {
		return userDao.updatePasswordById(userId,new_password);
	}
	

	
}
