package com.marondal.marondalgram.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello World!!";
	}

}
