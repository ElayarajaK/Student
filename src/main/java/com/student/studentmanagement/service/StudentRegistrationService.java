package com.student.studentmanagement.service;

import java.util.List;

import com.student.studentmanagement.entity.StudentRegistration;

public interface StudentRegistrationService {

	public StudentRegistration saveData(StudentRegistration studentregistration);

	public List<StudentRegistration> getStudentdata();

	public StudentRegistration getAData(Long studentRgisitraionId);

}
