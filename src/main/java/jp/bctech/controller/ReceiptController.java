package jp.bctech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.bctech.entity.Receipt;
import jp.bctech.service.ReceiptService;

@RequestMapping("/v1/receipt")
@RestController
@EnableAutoConfiguration
public class ReceiptController {
	@Autowired
	ReceiptService service;
	
	@RequestMapping(method = RequestMethod.GET, params = {"page", "size"})
	public Map<String, Object> fetchAll(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "10") int size) {
		Pageable pageable = PageRequest.of(page, size);
		List<Receipt> data = service.fetchAll(pageable);
		Map<String, Object> result = new HashMap<String, Object>();
		int next_page = data.size() > 0 ? pageable.next().getPageNumber() : -1;
		result.put("next_page", next_page);
		result.put("data", data);
		return result;
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