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
	//PersonRepository Bean을 주입한다.
	
	
	@Test
	void crud() { 
		//crud는 레파지토리 또는 DB쿼리에서 사용할 때 많이 쓰는 관용어로
		//create, read, update, delete
		Person person = new Person(); //Person 객체를 새롭게 만든다.
		person.setName("martin");
		person.setAge(10);
		
		//jpa 레파지토리를 통해서 DB에 세이브 한다.
		personRepository.save(person);
		
		//System.out.println(personRepository.findAll()); //저장되어 있는지 콘솔에 확인
		
		List<Person> people = personRepository.findAll();
		
		assertThat(people.size()).isEqualTo(1);
		assertThat(people.get(0).getName()).isEqualTo("martin");
		assertThat(people.get(0).getAge()).isEqualTo(10);
		
		
	}
	
	
}
