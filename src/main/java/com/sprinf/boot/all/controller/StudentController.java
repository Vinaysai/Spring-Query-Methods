package com.sprinf.boot.all.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sprinf.boot.all.bean.StudentBean;
import com.sprinf.boot.all.entity.Student;
import com.sprinf.boot.all.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentService;

	@PostMapping(value = "/username", produces = "application/json")
	public ModelAndView findAll1(@RequestBody StudentBean aqe) {

		List<Student> viewList = studentService.finduser1(aqe.getId());

		ModelAndView andView = new ModelAndView();

		andView.addObject("login", andView);

		if (null != viewList) {
			andView.setViewName("sucess");
			andView.addObject("login", andView);

			return andView;
		} else {
			andView.setViewName("fail");
		}

		return andView;
	}

	@PostMapping(value = "/userfnamelname", produces = "application/json")
	public ModelAndView findlname(@RequestBody StudentBean aqe) {

		List<Student> viewList = studentService.findlname(aqe.getLname());

		ModelAndView andView = new ModelAndView();

		andView.addObject("login", andView);

		if (null != viewList) {
			andView.setViewName("sucess");
			andView.addObject("login", andView);

			return andView;
		} else {
			andView.setViewName("fail");
		}

		return andView;
	}
	@PostMapping(value = "/user", produces = "application/json")
	public ModelAndView find(@RequestBody StudentBean aqe) {

		List<Student> viewList = studentService.findname(aqe.getFname(), aqe.getLname());

		ModelAndView andView = new ModelAndView();

		andView.addObject("login", andView);

		if (null != viewList) {
			andView.setViewName("sucess");
			andView.addObject("login", andView);

			return andView;
		} else {
			andView.setViewName("fail");
		}

		return andView;
	}
}