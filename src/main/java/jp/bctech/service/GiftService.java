package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public Optional<Gift> findGift(Long id) {
		return repository.findById(id);
	}
	
	public List<Gift> findGifts() {
		return repository.findAll();
	}
	
	public Gift save(Gift gift) {
		return repository.save(gift);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}	
}
