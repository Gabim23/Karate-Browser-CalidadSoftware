package es.codeurjc.test.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class MessageController {

	private List<Message> messages = Collections.synchronizedList(new ArrayList<>());

	@GetMapping("/")
	public String showMessages(Model model) {

		model.addAttribute("messages", this.messages);

		return "index";
	}

	
	@PostMapping("/")
	public String newMessage(@Valid Message message, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("message", message);  
			model.addAttribute("org.springframework.validation.BindingResult.message", result);
			model.addAttribute("messages", this.messages);
			return "index";
		}
		
		messages.add(message);
		return "redirect:/";
	}

}
