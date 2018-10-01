package jp.bctech.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class CalendarController {
	
	@RequestMapping(path = "/calendar", method = RequestMethod.GET)
	public String index(Model model) {
		return "test";
	}
}
