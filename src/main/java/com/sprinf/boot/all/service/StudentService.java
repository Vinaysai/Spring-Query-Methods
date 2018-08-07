package com.sprinf.boot.all.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprinf.boot.all.entity.Student;
import com.sprinf.boot.all.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository studentRepository;

	public List<Student> finduser1(int i) {

		List<Student> s = (List<Student>) studentRepository.findUsernameById(i);

		if (s != null) {

			System.out.println("USER EXISTS:::" + s);

		} else {
			System.out.println("No user found:::");
		}
		return s;

	}

	public List<Student> findlname(String i) {

		List<Student> s = (List<Student>) studentRepository.findByLname(i);

		if (s != null) {

			System.out.println("Last name found :::" + s.toString());

		} else {
			System.out.println("No user found:::");
		}
		return s;

	}

	public List<Student> findname(String i) {

		List<Student> s = (List<Student>) studentRepository.findByLname(i);

		if (s != null) {

			System.out.println("Last name found :::" + s.toString());

		} else {
			System.out.println("No user found:::");
		}
		return s;

	}

	public List<Student> findname(String fname, String lname) {

		List<Student> s = studentRepository.findByFnameAndLname(fname, lname);

		if (s != null) {

			System.out.println("User found :::" + s);

		} else {
			System.out.println("No user found:::");
		}
		return s;

	}
}
