package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.UserRepository;
import jp.bctech.entity.User;

import java.util.*;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository repository;
	
	public Optional<User> fetch(Long id) {
		return repository.findById(id);
	}
	
	public List<User> fetchAll() {
		return repository.findAll();
	}
	
	public User save(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public List<User> findAllUsers(List<Long> ids) {
		return repository.findAllById(ids);
	}
}