package jp.bctech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import jp.bctech.entity.User;
import jp.bctech.service.UserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> fetchAll() {
		return service.fetchAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Optional<User> fetch(@PathVariable("id") Long id) {
		return service.fetch(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public User createUser(@Validated @RequestBody User user) {
		return service.save(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
