package com.example.sprintRestExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sprintRestExample.dao.UserRepository;
import com.example.sprintRestExample.entity.User;

@SpringBootApplication
public class SprintRestExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SprintRestExampleApplication.class, args);
		UserRepository dao=(UserRepository) context.getBean("userRepository");
		User user=new User();
		user.setActive(true);
		user.setId(1001);
		user.setUserName("admin");
		user.setPassword("Test123$");
		user.setRoles("ROLE_ADMIN");
		dao.save(user);
		
		
		User user2=new User();
		user2.setActive(true);
		user2.setId(1001);
		user2.setUserName("test");
		user2.setPassword("Test123$");
		user2.setRoles("ROLE_USER");
		dao.save(user2);

	}

}
