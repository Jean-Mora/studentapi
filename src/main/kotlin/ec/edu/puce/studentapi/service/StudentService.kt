package ec.edu.puce.studentapi.service

import ec.edu.puce.studentapi.dto.StudentRequest
import ec.edu.puce.studentapi.dto.StudentResponse
import ec.edu.puce.studentapi.entity.Student
import ec.edu.puce.studentapi.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository
) {

    fun createStudent(request: StudentRequest): StudentResponse {
        val student = Student(
            name = request.name,
            email = request.email
        )

        val savedStudent = studentRepository.save(student)

        return StudentResponse(
            id = savedStudent.id,
            name = savedStudent.name,
            email = savedStudent.email
        )
    }

    fun getAllStudents(): List<StudentResponse> {
        return studentRepository.findAll().map { student ->
            StudentResponse(
                id = student.id,
                name = student.name,
                email = student.email
            )
        }
    }
}