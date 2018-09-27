package jp.bctech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.bctech.entity.Gift;

@Repository
public interface GiftRepository extends JpaRepository<Gift, Long> {
	
}