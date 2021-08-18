package com.javaproject.members.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Person {

	@Id//이 값이 id값이라고 표시해 주기 위함
	@GeneratedValue //이값을 자동으로 생성하기 위함
	private Long id; //person객체 하나하나를 유니크하게 특정짓는 id값이다.
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int age;

	private String hobby;
	private String bloodType;
	private String address;
	private LocalDate birthday;
	//LocalDate : 예전에는 Date를 많이 사용했지만 Java7에서 부터 LocalDate도 많이 사용한다.
	//private Date birthday;
	private String jab;
	
	//이렇게 추가한 5개에 대한 Getter,Setter를 추가하게 되면
	//라인이 너무 길게 되고 별 기능이 없음에도 100라인이 넘어가게 된다.
	//Lombok으로 대처할 수 있다.
	
	/*Getter, Setter*/
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
		//각 객체의 필드값을 문자열로 표시함.
	}
}
 