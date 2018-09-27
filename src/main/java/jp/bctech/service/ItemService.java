package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.bctech.repository.ItemRepository;
import jp.bctech.entity.Item;

import java.util.*;

@Service
@Transactional
public class ItemService {
	@Autowired
	
	ItemRepository repository;
	
	public Optional<Item> fetchAll(Long id) {
		return repository.findById(id);
	}
	
	public List<Item> fetchAll() {
		return repository.findAll();
	}
	
	public Item save(Item item) {
		return repository.save(item);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}