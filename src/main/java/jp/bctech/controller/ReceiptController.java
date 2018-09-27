package jp.bctech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.bctech.entity.Receipt;
import jp.bctech.service.ReceiptService;

@RequestMapping("/v1/receipt")
@RestController
@EnableAutoConfiguration
public class ReceiptController {
	@Autowired
	ReceiptService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Receipt> fetchAll() {
		return service.fetchAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Optional<Receipt> fetch(@PathVariable("id") Long id) {
		return service.fetch(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public Receipt createReceipt(@Validated @RequestBody Receipt receipt) {
		return service.save(receipt);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void deleteReceipt(@PathVariable("id") Long id) {
		service.delete(id);
	}	
}