package com.javaproject.members.contoller;

//junit5 : org.junit.jupiter.api
//junit4 : org.junit
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //�ش�Ŭ������ ��������Ʈ�׽�Ʈ ���� ǥ���ϴ� ������̼�
class HelloWorldControllerTest {

	@Autowired
	private HelloWorldController helloWorldController;
	
	@Test
	void helloWorld() {
		//�� ���� �Ǿ����� Ȯ����
		System.out.println("test");
		System.out.println(helloWorldController.helloWorld());
	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
