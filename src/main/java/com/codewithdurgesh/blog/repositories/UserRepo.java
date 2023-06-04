package com.codewithdurgesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgesh.blog.entities.User;

//Q lect no 11]]] How we Autowired Interface? Spring Container can't create bean of interface here not supposed to use @Service annotation
//   So how to Autowire UserRepo in UserServiceImpl class?
//Ans: 

public interface UserRepo extends JpaRepository<User, Integer> {

}
