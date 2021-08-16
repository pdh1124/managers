package com.javaproject.members.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

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
		person.setName("martin");
		person.setAge(10);
		
		//jpa �������丮�� ���ؼ� DB�� ���̺� �Ѵ�.
		personRepository.save(person);
		
		//System.out.println(personRepository.findAll()); //����Ǿ� �ִ��� �ֿܼ� Ȯ��
		
		List<Person> people = personRepository.findAll();
		
		assertThat(people.size()).isEqualTo(1);
		assertThat(people.get(0).getName()).isEqualTo("martin");
		assertThat(people.get(0).getAge()).isEqualTo(10);
		
	}
	
	
}
