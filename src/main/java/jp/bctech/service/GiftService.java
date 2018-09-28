package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.GiftRepository;
import jp.bctech.entity.Gift;

import java.util.*;

@Service
@Transactional
public class GiftService {
	@Autowired
	GiftRepository repository;
	
	public List<Gift> fetchAll(Pageable pageable) {
		Page<Gift> data = repository.findAll(pageable);
		return data.getContent();
	}
	
	public Optional<Gift> fetch(Long id) {
		return repository.findById(id);
	}
	
	public Gift save(Gift gift) {
		return repository.save(gift);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}	
}
