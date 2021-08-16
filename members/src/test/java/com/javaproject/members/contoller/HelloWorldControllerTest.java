package com.javaproject.members.contoller;

import static org.assertj.core.api.Assertions.assertThat;

//junit5 : org.junit.jupiter.api
//junit4 : org.junit
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest //해당클래스가 스프링부트테스트 임을 표시하는 어노테이션
class HelloWorldControllerTest {

	@Autowired //스프링 컨텍스트에서 빈을 주입하겠다는 뜻
	private HelloWorldController helloWorldController;
	
	private MockMvc mockMvc;
	@Test
	void helloWorld() {
		//잘 설정 되었는지 확인하기
		System.out.println("test");
		System.out.println(helloWorldController.helloWorld());
		
		//스프링부트 스타터 테스트에 포함된 assertThat를 통해서 검증을 해본다.
		assertThat(helloWorldController.helloWorld()).isEqualTo("HelloWorld");
		//helloWorldController의 helloWorld가 helloWorld를 잘 반환 하고 있는지 검증
		//http 호출없이 해당 컨트롤러에 메소드를 집적 호출해서 결과를 받아오는 테스트
		//실제로 저희는 http get메소드에 대해서 api(@GetMapping)를 만들었지만 assertThat에서는 
		//이런 부분을 무시하고 테스트 한것	
	}
	
	
	//스프링에서 제공하는 클래스를 이용한 방법 MockMvc 테스트
	//assertThat테스트에서는 무시했던 것을 
	//모의 Http 리퀘스트와 리스폰스를 만들어서 테스트를 진행해주는 것이 MockMvc테스트 이다.
	@Test
	void mockMvcTest() throws Exception {
		
		//mockMvc를 세팅함
		mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
		
		//실제 동작하도록 요청
		mockMvc.perform(
				MockMvcRequestBuilders
				.get("/api/helloWorld")
			).andDo(MockMvcResultHandlers.print()) //테스트의 내용을 확인하기 위해
			.andExpect(MockMvcResultMatchers.status().isOk()) //자동화된 결과 체크를 추가		
			//andExpect:예측한다. status:상태. isOk:ok인지.
			.andExpect(MockMvcResultMatchers.content().string("helloWorld")); //helloWorld인지 확인하기
	}
}
