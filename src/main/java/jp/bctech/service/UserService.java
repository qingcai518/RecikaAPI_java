package jp.bctech.service;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.UserRepository;
import jp.bctech.entity.User;
import jp.bctech.entity.LoginUser;

import java.util.*;

@Service
@Transactional
public class UserService implements UserDetailsService {
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
	
	public Optional<User> fetchByName(String name) {
		return repository.fetchByName(name);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.fetchByName(username).map(LoginUser::new).orElseThrow(() -> new UsernameNotFoundException("user not found"));
	}
}