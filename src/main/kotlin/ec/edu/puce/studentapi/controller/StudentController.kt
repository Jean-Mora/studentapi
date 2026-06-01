package ec.edu.puce.studentapi.controller

import ec.edu.puce.studentapi.dto.StudentRequest
import ec.edu.puce.studentapi.dto.StudentResponse
import ec.edu.puce.studentapi.service.StudentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(
    private val studentService: StudentService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createStudent(@RequestBody request: StudentRequest): StudentResponse {
        return studentService.createStudent(request)
    }

    @GetMapping
    fun getAllStudents(): List<StudentResponse> {
        return studentService.getAllStudents()
    }
}