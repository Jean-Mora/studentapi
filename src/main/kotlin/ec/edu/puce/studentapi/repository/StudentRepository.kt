package ec.edu.puce.studentapi.repository

import ec.edu.puce.studentapi.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>