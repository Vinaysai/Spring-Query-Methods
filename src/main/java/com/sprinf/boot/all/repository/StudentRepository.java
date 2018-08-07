package com.sprinf.boot.all.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sprinf.boot.all.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Object> {

	@Query("SELECT t.fname FROM Student t where t.id = ?1")
	List<Student> findUsernameById(int id);

	@Query("SELECT t.fname FROM Student t where t.id = :id")
	String findusernameById(@Param("id") Long id);

	List<Student> findByLname(String lname);

	List<Student> findByFnameAndLname(String fname, String lname);
}
