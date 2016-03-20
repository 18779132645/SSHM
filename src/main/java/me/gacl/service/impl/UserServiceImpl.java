package me.gacl.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.gacl.dao.UserDaoI;
import me.gacl.model.User;
import me.gacl.service.UserServiceI;
//ʹ��Spring�ṩ��@Serviceע�⽫UserServiceImpl��עΪһ��Service
@Service("userService")
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserDaoI userDao;
	
    public void test() {
        System.out.println("Hello World!");
    }

	@Override
	public Serializable save(User user) {
		return userDao.save(user);
	}

}