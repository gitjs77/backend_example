package com.example.demo.representation;

import com.example.demo.domain.user.Person;
import com.example.demo.domain.user.User;
import com.example.demo.persistent.user.PersonRepository;
import com.example.demo.service.users.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class MainResource {

    @Inject
    private UserServiceImpl userService;

    @Inject
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/person")
    public Person getPerson() {
        return personRepository.findOne(77L);
    }
}
