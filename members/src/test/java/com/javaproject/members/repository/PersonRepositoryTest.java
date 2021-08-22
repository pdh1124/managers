package com.javaproject.members.repository;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javaproject.members.domain.Person;

@SpringBootTest
class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;
	//PersonRepository Bean을 주입한다.
	
	
//	@Test
//	void crud() { 
//		//crud는 레파지토리 또는 DB쿼리에서 사용할 때 많이 쓰는 관용어로
//		//create, read, update, delete
//		Person person = new Person(); //Person 객체를 새롭게 만든다.
//		person.setName("martin");
//		person.setAge(10);
//		person.setBloodType("A");
//		
//		//jpa 레파지토리를 통해서 DB에 세이브 한다.
//		personRepository.save(person);
//		
//		System.out.println(personRepository.findAll()); //저장되어 있는지 콘솔에 확인
//		
//		List<Person> people = personRepository.findAll();
//		
//		assertThat(people.size()).isEqualTo(1);
//		assertThat(people.get(0).getName()).isEqualTo("martin");
//		assertThat(people.get(0).getAge()).isEqualTo(10);
//		assertThat(people.get(0).getBloodType()).isEqualTo("A");
//	
//	}
	
	
	@Test
	void HashCodeAndEquals() {
		Person person1 = new Person("margin", 10, "A");
		Person person2 = new Person("margin", 10, "B");
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode()); 
		
		Map<Person, Integer> map = new HashMap<>();
		map.put(person1, person1.getAge());
		
		System.out.println(map);
		System.out.println(map.get(person2));
		//원래는 person1을 가져왔지만 person2와 값이 같기 때문에 키에 person1을 넣었지만 person2로도 가져올 수 있을 것이다라는 예상
		
	}
	
}
