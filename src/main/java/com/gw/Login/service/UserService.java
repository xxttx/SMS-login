package com.gw.Login.service;

import com.gw.Login.entity.User;

public interface UserService {

	void save(User user);

	boolean findUserByPhoneAndPassword(User user);

	boolean findUserByPhone(String phone);

}
