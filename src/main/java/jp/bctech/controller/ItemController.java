package jp.bctech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import jp.bctech.entity.Item;
import jp.bctech.service.ItemService;

@RestController
@RequestMapping("/v1/item")
public class ItemController {
	@Autowired
	ItemService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Item> fetchAll() {
		return service.fetchAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{receipt_id}")
	public Optional<Item> fetchByReceiptId(@PathVariable("receipt_id") Long id) {
		return service.fetch(receipt_id)
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Optional<Item> fetch(@PathVariable("id") Long id) {
		return service.fetch(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public Item create(@Validated @RequestBody Item item) {
		return service.save(item);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
