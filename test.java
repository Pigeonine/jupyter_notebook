package com.spring.jpa;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.internal.CustomizerRegistry;

import com.spring.jpa.entity.Board;
import com.spring.jpa.entity.Custom;
import com.spring.jpa.entity.Role;
import com.spring.jpa.repository.BoardRepository;
import com.spring.jpa.repository.CustomRepository;
import com.spring.jpa.repository.RoleRepository;

import jakarta.transaction.Transactional;


@SpringBootApplication
public class Sp04JpqlApplication implements CommandLineRunner{

	@Autowired
	private CustomRepository  customRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Transactional
	//@Override
	public void run(String... args) throws Exception {
		//boardRepository.findAll()
//		
//		//모든 게시글 검색...JPQL...조인
//		boardRepository.getBoards()
//						.forEach(b->{
//								System.out.println(b);
//								System.out.println(b.getCustom());
//						}); 
		// Role이 Admin인 권한을 가지는 사용자를 추가.
		
//		Role role = roleRepository.findById(2).get();
//		
//		Custom c = new Custom();
//		c.setName("DDD");
//		c.setPassword("ddd");
//		c.setEmail("ddd.google.com");
//		c.setRegDate(LocalDateTime.now());
//		
//		c.setRoles(Set.of(role));//고객 정보와 role 정보가 연결된다, 엔티티간의 관계(DI, Has a Relation, Setter)
//		
//		customRepository.save(c);
		
		
	}	
	public static void main(String[] args) {
		SpringApplication.run(Sp04JpqlApplication.class, args);
	}

}
