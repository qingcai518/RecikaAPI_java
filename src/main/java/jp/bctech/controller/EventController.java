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
	public String getEvents() {
		String jsonMsg = null;
		try {
			List<Event> events = new ArrayList<Event>();
			Event event = new Event();
			event.setTitle("first event");
			event.setStart("2017-10-01");
			events.add(event);
			
			Event event2 = new Event();
			event2.setTitle("second event");
			event2.setStart("2017-10-11");
			event2.setEnd("2017-10-12");
			events.add(event2);
			
			ObjectMapper mapper = new ObjectMapper();
			jsonMsg = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(events);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return jsonMsg;
	}
}
