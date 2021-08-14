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

@SpringBootTest //�ش�Ŭ������ ��������Ʈ�׽�Ʈ ���� ǥ���ϴ� ������̼�
class HelloWorldControllerTest {

	@Autowired //������ ���ؽ�Ʈ���� ���� �����ϰڴٴ� ��
	private HelloWorldController helloWorldController;
	
	private MockMvc mockMvc;
	@Test
	void helloWorld() {
		//�� ���� �Ǿ����� Ȯ���ϱ�
		System.out.println("test");
		System.out.println(helloWorldController.helloWorld());
		
		//��������Ʈ ��Ÿ�� �׽�Ʈ�� ���Ե� assertthat�� ���ؼ� ������ �غ���.
		assertThat(helloWorldController.helloWorld()).isEqualTo("HelloWorld");
		//helloWorldController�� helloWorld�� helloWorld�� �� ��ȯ �ϰ� �ִ��� ����
		//http ȣ����� �ش� ��Ʈ�ѷ��� �޼ҵ带 ���� ȣ���ؼ� ����� �޾ƿ��� �׽�Ʈ
		//������ ����� http get�޼ҵ忡 ���ؼ� api(@GetMapping)�� ��������� assertThat������ 
		//�̷� �κ��� �����ϰ� �׽�Ʈ �Ѱ� 		
	}
	
	
	//���������� �����ϴ� Ŭ������ �̿��� ��� MockMvc �׽�Ʈ
	//assertThat�׽�Ʈ������ �����ߴ� ���� 
	//���� Http ������Ʈ�� ���������� ���� �׽�Ʈ�� �������ִ� ���� MockMvc�׽�Ʈ �̴�.
	@Test
	void mockMvcTest() throws Exception {
		
		//mockMvc�� ������
		mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
		
		//���� �����ϵ��� ��û
		mockMvc.perform(
				MockMvcRequestBuilders
				.get("/api/helloWorld")
			).andDo(MockMvcResultHandlers.print()) //�׽�Ʈ�� ������ Ȯ���ϱ� ����
			.andExpect(MockMvcResultMatchers.status().isOk()) //�ڵ�ȭ�� ��� üũ�� �߰�		
			//andExpect:�����Ѵ�. status:����. isOk:ok����.
			.andExpect(MockMvcResultMatchers.content().string("helloWorld")); //helloWorld���� Ȯ���ϱ�
	}
}
