package jp.bctech.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(method = RequestMethod.GET)
	public String test(Model model) {
		model.addAttribute("msg", "サンプルメッセージ");
		return "test";
	}
	
	@RequestMapping(value = "download", method = RequestMethod.POST)
	public ModelAndView download(Map<String, Object> model) throws Exception {
		ModelAndView mav = new ModelAndView(new ExcelBuilder());
		mav.addObject("fileName", "testExcel" + ".xls");
		return mav;
	}
}
