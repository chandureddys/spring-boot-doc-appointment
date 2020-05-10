package com.docappointment.project;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/doctors")
public class DoctorsController {

	@GetMapping
	public List<String> getDoctors() {
		return Arrays.asList("venkat", "chandu");

	}

}
