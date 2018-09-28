package jp.bctech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	
	public Optional<Item> fetch(Long id) {
		return repository.findById(id);
	}
	
	public List<Item> fetchBy(Long receiptId) {
		Item item = new Item();
		item.setReceiptId(receiptId);
		
		Example<Item> example = Example.of(item);
		return repository.findAll(example);
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