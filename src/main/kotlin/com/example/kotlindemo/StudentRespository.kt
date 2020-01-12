package com.example.kotlindemo

import org.springframework.data.jpa.repository.JpaRepository


interface StudentRespository : JpaRepository<Student, Long> {

}