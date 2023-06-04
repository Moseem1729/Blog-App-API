package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;

public interface PostService {

	// create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	// update
	
	Post updatePost(PostDto postDto, Integer postId);
	
	// delete
	
	void deletePost(Integer postId);
	
	// get all posts
	
	List<Post> getAllPost();
	
	// get single post
	
	Post getPostById(Integer postId);
	
	// get all posts by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	// get All posts user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	// search posts
	
	List<Post> searhPosts(String keyword);
	
}