package com.codewithdurgesh.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithdurgesh.blog.entities.Category;
import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);

}
//Defining Query Methods
//The repository proxy has two ways to derive a store-specific query from the method name:
//
//By deriving the query from the method name directly.
//
//By using a manually defined query.
//
//Available options depend on the actual store. 
//However, there must be a strategy that decides what actual query is created. 
//The next section describes the available options.