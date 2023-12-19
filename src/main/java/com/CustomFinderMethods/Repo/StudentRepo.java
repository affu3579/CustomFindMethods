package com.CustomFinderMethods.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.CustomFinderMethods.Entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
	 public List<StudentEntity> findByName(String name);
	 
	 public List<StudentEntity> findByNameAndBranch(String name,String branch);
	 
	 public List<StudentEntity> findByIdLessThan(int id);
  
	 public List<StudentEntity> deleteById(int Id);
	
}
