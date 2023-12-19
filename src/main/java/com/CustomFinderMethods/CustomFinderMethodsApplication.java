package com.CustomFinderMethods;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.CustomFinderMethods.Entity.StudentEntity;
import com.CustomFinderMethods.Repo.StudentRepo;

@SpringBootApplication
public class CustomFinderMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CustomFinderMethodsApplication.class, args);
		StudentRepo userRepo=context.getBean(StudentRepo.class);
		List<StudentEntity> users =userRepo.findByName("affan");
		users.forEach(e->{System.out.println("Find By Name : "+e);});
		
		List<StudentEntity>user1=userRepo.findByNameAndBranch("afroz", "SDPT");
		user1.forEach(e1->{System.out.println("Find by name&Branch : "+e1);});
		
		List<StudentEntity> findBelowId=userRepo.findByIdLessThan(1005);
		findBelowId.forEach(e2->{System.out.println("findBelowId user: "+e2);});
		
		//List<StudentEntity> deleteById=userRepo.deleteById(952);
		
		
		
		
		
	}

}
