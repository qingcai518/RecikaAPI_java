package jp.bctech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.bctech.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> fetchByName(String name);
}