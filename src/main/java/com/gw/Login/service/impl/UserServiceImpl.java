package com.gw.Login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gw.Login.dao.UserMapper;
import com.gw.Login.entity.User;
import com.gw.Login.service.UserService;



@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public void save(User user) {
		userMapper.save(user);
		
	}

	//在数据库中查询是否有数据
	@Override
	public boolean findUserByPhoneAndPassword(User user) {
		User temp = userMapper.findUserByPhoneAndPassword(user);
		return temp == null?false:true;
	}

	@Override
	public boolean findUserByPhone(String phone) {
		User temp = userMapper.findUserByPhone(phone);
		return temp == null?true:false;
	}

}
