package com.javaproject.members.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id//�� ���� id���̶�� ǥ���� �ֱ� ����
	@GeneratedValue //�̰��� �ڵ����� �����ϱ� ����
	private Long id; //person��ü �ϳ��ϳ��� ����ũ�ϰ� Ư������ id���̴�.
	
	private String name;
	private int age;
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
		//�� ��ü�� �ʵ尪�� ���ڿ��� ǥ����.
	}
}
 