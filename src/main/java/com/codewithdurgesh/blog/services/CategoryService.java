package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.CategoryDto;
//Giving public Access modifier is useless in Interface, 
//     because inside Interface all methods are by default public
public interface CategoryService {

	// create
	/* public */ CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// delete
	void deleteCategory(Integer categoryId);
	
	// get
	CategoryDto getCategory(Integer categoryId);
	
	// get All
	List<CategoryDto> getCategories();
}
