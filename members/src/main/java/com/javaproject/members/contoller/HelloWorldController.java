package com.javaproject.members.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //컨트롤러의 기능을 선언함
//@ResponseBody //API형식이기 때문에 사용
@RestController //@Controller와 @ResponseBody의 기능을 같이 쓸수 있도록 치환
public class HelloWorldController {

	@GetMapping(value ="/api/helloWorld")
	public String helloWorld() {
		return "HelloWorld";
	}
}
