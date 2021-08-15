package com.javaproject.members.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.members.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
