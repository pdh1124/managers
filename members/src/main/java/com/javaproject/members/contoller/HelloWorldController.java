package com.javaproject.members.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //��Ʈ�ѷ��� ����� ������
//@ResponseBody //API�����̱� ������ ���
@RestController //@Controller�� @ResponseBody�� ����� ���� ���� �ֵ��� ġȯ
public class HelloWorldController {

	@PostMapping(value ="/api/helloWorld")
	public String helloWorld() {
		return "HelloWorld";
	}
}
