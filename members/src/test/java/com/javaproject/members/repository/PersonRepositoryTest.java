package com.javaproject.members.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javaproject.members.domain.Person;

@SpringBootTest
class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;
	//PersonRepository Bean�� �����Ѵ�.
	
	
	@Test
	void crud() { 
		//crud�� �������丮 �Ǵ� DB�������� ����� �� ���� ���� ������
		//create, read, update, delete
		Person person = new Person(); //Person ��ü�� ���Ӱ� �����.
		
		//jpa �������丮�� ���ؼ� DB�� ���̺� �Ѵ�.
		personRepository.save(person);
		
		System.out.println(personRepository.findAll()); //����Ǿ� �ִ��� �ֿܼ� Ȯ��
	}
	
	
}
