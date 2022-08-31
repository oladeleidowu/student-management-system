package com.bimcode.studentmanagementsystem.respository;

import com.bimcode.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
