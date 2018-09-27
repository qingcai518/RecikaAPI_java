package jp.bctech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.bctech.entity.Receipt;;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
	
}