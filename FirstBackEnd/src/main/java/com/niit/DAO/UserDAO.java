package com.niit.DAO;

import java.util.List;

import com.niit.model.Product;
import com.niit.model.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	public User getUser(int userId);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public List<User> getUsers();


}
