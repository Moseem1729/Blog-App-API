package com.codewithdurgesh.blog.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "user_name", nullable = false, length = 100)
	private String name;
	
	private String email;
	
	private String password;
	
	private String about;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Post> posts =new ArrayList<>();
}
//              Basics of Validation:

// Java bean is validated with JSR 380 known as Bean Validation 2.0
// JSR 380 is specification for the Java API for bean validation. Properties of bean meet the specific criteria.
// For validation different annotations is used like @NotNull, @Min, @Size etc.
// Hibernate Validator is a implementation of validation api.

//         Important Annotations for validations:

// @NotNull
// @Email
// @Size
// @Min
// @Max
// @NotEmpty

// Etc...........

//               How to use:

// Spring boot provides support for Hibernate Validator ( Even, before 2.3 Hibernate Validator was by default coming with spring boot web.
// In latest version we have to add below dependency:
      /*
 		<dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
		  <version>2.6.6</version>	
        </dependency>
      */
