package org.ldxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ldxx.bean.User;

public interface UserDao {

	int addUser(@Param("user")User user);

	int deleteUser(@Param("userId")String userId);

	int updateUser(@Param("user")User user);

	List<User> selectAllUser();

	User selectUserById(@Param("userId")String userId);

	int countOfusername(@Param("username")String username);

	int countOfusernameEdit(@Param("username") String username,@Param("userId") String userId);


	String countUsername(@Param("username")String username);

	User selectUserByusername(@Param("username")String username);

	int updatePasswordById(@Param("userId")String userId,@Param("new_password") String new_password);
	
}
