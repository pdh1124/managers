package com.javaproject.members.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id//이 값이 id값이라고 표시해 주기 위함
	@GeneratedValue //이값을 자동으로 생성하기 위함
	private Long id; //person객체 하나하나를 유니크하게 특정짓는 id값이다.
	
	private String name;
	private int age;
	
	
	/*Getter, Setter*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
		//�� ��ü�� �ʵ尪�� ���ڿ��� ǥ����.
	}
}
 