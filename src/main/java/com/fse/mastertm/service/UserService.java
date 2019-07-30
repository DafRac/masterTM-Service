package com.fse.mastertm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.mastertm.entity.User;
import com.fse.mastertm.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User addNewUser(User user) {
		User n = new User();
		n.setFirstName(user.getFirstName());
		n.setLastName(user.getLastName());
		n.setEmployeeId(user.getEmployeeId());
		return userRepo.save(n);
	}

	public Iterable<User> findAll() {

		return userRepo.findAll();
	}

	public User updateUser(User user) {
		User n = userRepo.findOne(user.getUserId());
		n.setEmployeeId(user.getEmployeeId());
		n.setFirstName(user.getFirstName());
		n.setLastName(user.getLastName());
		return n;
	}

}
