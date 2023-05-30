package com.student.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.studentmanagement.entity.StudentRegistration;

@Repository
public interface StudentRegistartionRepository extends JpaRepository<StudentRegistration, Long> {

}
