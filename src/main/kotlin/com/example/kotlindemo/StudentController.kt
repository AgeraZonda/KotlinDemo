package com.example.kotlindemo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/rest/students")

class StudentController(val studentRepository: StudentRespository) {

    @GetMapping("/Students")
    fun getAllStudents(): List<Student> =  studentRepository.findAll()




    @PostMapping("/Students")
    fun createNewStudent(@Valid @RequestBody Student: Student): Student =
            studentRepository.save(Student)


    @GetMapping("/Students/{id}")
    fun getStudentById(@PathVariable(value = "id") StudentId: Long): ResponseEntity<Student> {
        return studentRepository.findById(StudentId).map { Student ->
            ResponseEntity.ok(Student)
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/Students/{id}")
    fun deleteStudentById(@PathVariable(value = "id") StudentId: Long): ResponseEntity<Void> {

        return studentRepository.findById(StudentId).map { Student  ->
            studentRepository.delete(Student)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

    }

}