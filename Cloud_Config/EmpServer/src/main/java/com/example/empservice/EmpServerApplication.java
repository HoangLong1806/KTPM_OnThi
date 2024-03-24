package com.example.empservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmpServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServerApplication.class, args);
	}
	
	
	@GetMapping("/getEmpList")
	public List<String> getEmpList(){
		List<String> emp = new ArrayList<>();
		emp.add("John");
		emp.add("Doe");
		emp.add("Jane");
		return emp;
	}

}
