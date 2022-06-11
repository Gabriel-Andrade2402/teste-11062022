package com.example.demo.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class controller {
	@GetMapping
	public ResponseEntity<String> test(){
		return ResponseEntity.ok().body("Test");
	}
}
