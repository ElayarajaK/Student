package com.student.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmanagement.entity.StudentRegistration;
import com.student.studentmanagement.repository.StudentRegistartionRepository;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService{

	@Autowired
	private StudentRegistartionRepository studentregistrationrepositiry;

	@Override
	public StudentRegistration saveData(StudentRegistration studentregistration) {
		// TODO Auto-generated method stub
		return studentregistrationrepositiry.save(studentregistration);
	}

	@Override
	public List<StudentRegistration> getStudentdata() {
		// TODO Auto-generated method stub
		return studentregistrationrepositiry.findAll();
	}

	@Override
	public StudentRegistration getAData(Long studentRgisitraionId) {
		// TODO Auto-generated method stub
		return studentregistrationrepositiry.findById(studentRgisitraionId).get();
	}
	
	


}
