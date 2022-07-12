package com.ecanteen.repository;

import com.ecanteen.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/***
 *  Spring Data SQL Repository for Student Entity
 */

public interface StudentRepository extends JpaRepository<Student, Long> , JpaSpecificationExecutor<Student> {}

