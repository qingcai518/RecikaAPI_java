package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.ReceiptRepository;
import jp.bctech.entity.Receipt;

import java.util.*;

@Service
@Transactional
public class ReceiptService {
	@Autowired
	ReceiptRepository repository;
	
	public Optional<Receipt> fetch(Long id) {
		return repository.findById(id);
	}
	
	public List<Receipt> fetchAll(Pageable pageable) {
		Page<Receipt> result = repository.findAll(pageable);
		return result.getContent();
	}
	
	public Receipt save(Receipt receipt) {
		return repository.save(receipt);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}