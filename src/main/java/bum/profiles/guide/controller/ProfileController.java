package bum.profiles.guide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
	
	@Value("${spring.datasource.url}")
	private String datasource;
	
	@GetMapping
	public String checkPropergies() {
		return "자료 근원: " + datasource;
	}
}
