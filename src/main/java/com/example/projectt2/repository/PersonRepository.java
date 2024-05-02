package com.example.projectt2.repository;

import com.example.projectt2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

}
