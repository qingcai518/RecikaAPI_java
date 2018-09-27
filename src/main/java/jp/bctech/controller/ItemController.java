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
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Optional<Item> fetch(@PathVariable("id") Long id) {
		return service.fetch(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public User createUser(@Validated @RequestBody Item user) {
		return service.save(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
