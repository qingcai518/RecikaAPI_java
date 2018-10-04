package jp.bctech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.entity.User;
import jp.bctech.repository.UserRepository;

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