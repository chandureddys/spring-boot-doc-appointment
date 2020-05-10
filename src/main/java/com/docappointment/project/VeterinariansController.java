package com.docappointment.project;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/veterinarians")
public class VeterinariansController {

	@GetMapping
	public List<String> getVeterinarians() {
		return Arrays.asList("venkat", "chandu");

	}

}
