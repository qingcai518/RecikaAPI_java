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

import jp.bctech.entity.Gift;
import jp.bctech.service.GiftService;

@RequestMapping("/v1/gift")
@RestController
@EnableAutoConfiguration
public class GiftController {
	@Autowired
	GiftService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Gift> getGifts() {
		return service.findGifts();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Optional<Gift> getGift(@PathVariable("id") Long id) {
		return service.findGift(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public Gift createGift(@Validated @RequestBody Gift gift) {
		return service.save(gift);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void deleteGift(@PathVariable("id") Long id) {
		service.delete(id);
	}	
}
