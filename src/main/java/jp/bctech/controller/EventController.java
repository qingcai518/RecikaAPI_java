package jp.bctech.controller;

import java.io.*;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import jp.bctech.entity.Event;

@RestController
@RequestMapping("/api/event")
public class EventController {
	@GetMapping(value = "/all")
	public String setEvents() {
		String jsonMsg = null;
		try {
			List<Event> events = new ArrayList<Event>();
			
			Event e1 = new Event();
			e1.setTitle("first event");
			e1.setStart("2018-10-01");
			events.add(e1);
			
			Event e2 = new Event();
			e2.setTitle("second event");
			e2.setStart("2018-10-11");
			e2.setEnd("2018-10-12");
			events.add(e2);
			
			ObjectMapper mapper = new ObjectMapper();
			jsonMsg = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(events);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return jsonMsg;
	}
}
