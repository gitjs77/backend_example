package com.example.demo.persistent.user;

import com.example.demo.domain.user.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Jack <e.kobets>
 * 8/3/18
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
