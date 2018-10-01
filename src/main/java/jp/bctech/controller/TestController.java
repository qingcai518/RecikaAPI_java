package jp.bctech.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.bctech.common.ExcelUtility;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(method = RequestMethod.GET)
	public String test(Model model) {
		model.addAttribute("msg", "サンプルメッセージ");
		
		ExcelUtility.create();
		
		return "test";
	}
}
