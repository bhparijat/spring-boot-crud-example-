package com.example.example.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.example.model.User;
import com.example.example.repository.UserRepository;

@RestController

public class UserController {

    @Autowired
    UserRepository userRepository;
    @RequestMapping("/hello")
   ModelAndView welcome(){
    System.out.println("hello");
    return new ModelAndView("index").addObject("name", "Parijat");
    }
    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user) {
    	System.out.println(user.getId());
        userRepository.save(user);
        return userRepository.findOne(user.getId());
    }  
    
    @RequestMapping(value = "/user/{id}") 
    public User read(@PathVariable long id) {
        return userRepository.findOne(id);
   }

    @RequestMapping(value = "/user" ,method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findOne(user.getId());
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE) 
    public User delete(@PathVariable long id) {
    	User delUser =  userRepository.findOne(id);
        userRepository.delete(id); 
        return delUser;
    }
	@RequestMapping(value="/users")
	public Iterable<User> allUsers(){
		return userRepository.findAll();
	}


}