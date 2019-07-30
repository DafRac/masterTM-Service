package com.cognizant.projectmanagement.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.validateMockitoUsage;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cognizant.projectmanagement.entity.User;
import com.cognizant.projectmanagement.model.UserRequest;
import com.cognizant.projectmanagement.repository.UserRepository;

public class UserServiceTest {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserRepository repo;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void validate() {
		validateMockitoUsage();
	}

	@Test
	public void getAllUsersTest()

	{
		List<User> list = new ArrayList<User>();

		User taskOne = new User(1, "shobna", "vk", "EMP123");
		User taskTwo = new User(2, "shobna", "vk", "EMP123");
		User taskThree = new User(3, "shobna", "vk", "EMP123");

		list.add(taskOne);
		list.add(taskTwo);
		list.add(taskThree);

		when(repo.findAll()).thenReturn(list);

		Iterable<User> taskList = userService.findAll();

		assertEquals(3, ((List<User>) taskList).size());
		verify(repo, times(1)).findAll();
	}

	@Test

	public void updateUserTest() {

		User u = new User(12, "Test", "test", "Test123");

		when(repo.findOne(12)).thenReturn(u);
		when(userService.updateUser(u)).thenReturn(u);

	}

	@Test
	public void addNewUserTest() {

		User taskOne = new User(1, "shobna", "vk", "EMP123");
		// userService.addNewUser(taskOne);
		when(userService.addNewUser(taskOne)).thenReturn(taskOne);
		when(repo.save(taskOne)).thenReturn(taskOne);

		// verify(repo, times(0).save(taskOne);

		/*
		 * User n =new User();
		 * 
		 * n.setFirstName(user.getFirstName()); n.setLastName(user.getLastName());
		 * n.setEmployeeId(user.getEmployeeId()); return userRepo.save(n);
		 */

	}

	@Test
	public void gettersSetters() {
		UserRequest u = new UserRequest();
		u.setFirstName("shobana");
		u.getFirstName();
		u.setLastName("vk");
		u.getLastName();
		u.setEmployeeId("12");
		u.getEmployeeId();
	}

}
