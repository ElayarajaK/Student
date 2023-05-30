package com.student.studentmanagement.studentregistrationcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentmanagement.entity.StudentRegistration;
import com.student.studentmanagement.service.StudentRegistrationService;

@RestController
public class StudentRegistrationController {
	
	@Autowired
	private StudentRegistrationService studentregistrationservice;
	
	@GetMapping("/Home")
	public String printData() {
		
		String Tag = "<h1>This Home Pages</h1>";
		return Tag;
		
	}
	@GetMapping("/About")
	public String parintAbout() {
		
		String Tag = "<h1>This about Pages</h1>";
		return Tag;
		
	}
	@GetMapping("/Contact")
	public String printContact() {
		
		String Tag = "<h1>This contact Pages</h1>";
		return Tag;
		
	}
	
	
	@PostMapping("/AddStudent")
	public StudentRegistration saveStudentRegistration(@RequestBody StudentRegistration studentregistration)
	{
		return studentregistrationservice.saveData(studentregistration);
	}
	
	
	@GetMapping("/listStudents")
	public List<StudentRegistration> getStudentData1(){
		
		return studentregistrationservice.getStudentdata();
		
	}
	
	
	@GetMapping("/getStudent/{id}")
	public StudentRegistration getAStudentData(@PathVariable("id") Long StudentRgisitraionId) {
		
		return studentregistrationservice.getAData(StudentRgisitraionId);
	}
}
