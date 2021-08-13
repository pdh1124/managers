package com.javaproject.members.contoller;

//junit5 : org.junit.jupiter.api
//junit4 : org.junit
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //해당클래스가 스프링부트테스트 임을 표시하는 어노테이션
class HelloWorldControllerTest {

	@Autowired
	private HelloWorldController helloWorldController;
	
	@Test
	void helloWorld() {
		//잘 설정 되었는지 확인하
		System.out.println("test");
		System.out.println(helloWorldController.helloWorld());
	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
