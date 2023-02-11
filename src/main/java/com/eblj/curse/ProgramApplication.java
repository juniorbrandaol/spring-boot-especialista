package com.eblj.curse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ProgramApplication {

	@Autowired
	@Qualifier("appName")
	private String appNane;

	@Autowired
	private String bdName;

	public static void main(String[] args)	{
		SpringApplication.run(ProgramApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloWord(){
		return appNane + " "+ bdName;
	}
}
