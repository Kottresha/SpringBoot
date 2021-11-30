package com.ltts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltts.repository.MemberRepository;
import com.ltts.repository.MovieRepository;

@SpringBootApplication
public class PractiseProgramsApplication {

	static ConfigurableApplicationContext cont = null;
	
	public static void main(String[] args) {
		PractiseProgramsApplication.cont = SpringApplication.run(PractiseProgramsApplication.class, args);
			
	}
	
	public static void insertMemberToDatabase(Member member) {
		MemberRepository mr = cont.getBean(MemberRepository.class);
		
		mr.save(member);
	}

}
