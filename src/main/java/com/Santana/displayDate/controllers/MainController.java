package com.Santana.displayDate.controllers;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//	To be able to render .jsp files as a page we need to use @Controller instead of @RestController
@Controller
public class MainController {

//	In the long run @GetMapping and @PostMapping will save us a lot of typing over @RequestMapping
	@GetMapping("/")
	public String dashboard() {
		return "home.jsp";
	}
	
	@GetMapping("/date")
//	Using Model is how we send things to the .jsp file 
	public String date(Model model) {
//		For the time being the only way I got date to work was using the following
//		Everything else would eventually lead to something that was depricated
		LocalDateTime time= LocalDateTime.of(LocalDate.now(), LocalTime.now());
//		Once you make an instance of time, you need to do the same for the formatter. At the end you specify how you want it formatted
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE,' the' d ' of' MMMM, u ");
//		Add them both together then add it to the model
		model.addAttribute("today", formatter.format(time));
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		LocalDateTime time= LocalDateTime.of(LocalDate.now(), LocalTime.now());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		
		model.addAttribute("time",formatter.format(time));
		return "time.jsp";
	}
}
