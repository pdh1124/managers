package com.javaproject.members.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor //인자가 없는 생성자 만드는 어노테이션
@AllArgsConstructor //모든 인자가 담긴 생성자 만드는 어노테이션
@RequiredArgsConstructor 
@EqualsAndHashCode
public class Person {

	@Id//이 값이 id값이라고 표시해 주기 위함
	@GeneratedValue //이값을 자동으로 생성하기 위함
	private Long id; //person객체 하나하나를 유니크하게 특정짓는 id값이다.
	
	@NonNull
	private String name;
	
	@NonNull
	private int age;
	
	private String hobby;
	
	@NonNull
	private String bloodType;
	private String address;
	private LocalDate birthday;
	//LocalDate : 예전에는 Date를 많이 사용했지만 Java7에서 부터 LocalDate도 많이 사용한다.
	//private Date birthday;

	private String jab;
	@ToString.Exclude
	private String phoneNumber;
	//이렇게 추가한 5개에 대한 Getter,Setter를 추가하게 되면
	//라인이 너무 길게 되고 별 기능이 없음에도 100라인이 넘어가게 된다.
	
}
 