package com.furkansahan.studentmanagement.repository;


import com.furkansahan.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {


}
