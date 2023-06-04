package com.codewithdurgesh.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, message = "Min size of category title is 4")
	private String categoryTitle;
	
	@Size(min = 10, message = "Min size of category discription is 10")
	private String categoryDescription;
	
}
