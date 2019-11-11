package com.customerapp.kreeneats.controller;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
//	@GetMapping("/test")
//	public ResponseEntity<String> getString() {
//		return new ResponseEntity<String>("murali",HttpStatus.OK);
//		
//	}
//	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}
