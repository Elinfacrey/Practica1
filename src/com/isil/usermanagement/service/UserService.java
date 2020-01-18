package com.isil.usermanagement.service;

import java.sql.SQLException;
import java.util.List;

import com.isil.usermanagement.dao.UserDAO;
import com.isil.usermanagement.model.Alumno;

/**
 * AbstractService.java This SERVICE class provides CRUD database operations for the
 * table users in the database.
 * 
 * @author Abel Huarca [Isil]
 *
 */
public class UserService {

    UserDAO dao= new UserDAO();

	public void insertUser(Alumno user) throws SQLException {
		dao.insertUser(user);
		} 

	public Alumno selectUser(int id) {
		return dao.selectUser(id);
	}

	public List<Alumno> selectAllUsers() {
		return dao.selectAllUsers();
	}

	public boolean deleteUser(int id) throws SQLException {
		return dao.deleteUser(id);
	}

	public boolean updateUser(Alumno user) throws SQLException {
		return dao.updateUser(user);
	}

	

}
