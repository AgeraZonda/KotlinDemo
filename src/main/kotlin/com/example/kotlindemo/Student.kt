package com.example.kotlindemo

import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotBlank


@Entity
@Table(name = "tbl_student")
class Student (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,

        @get: NotBlank
        var name: String = "",

        @get: NotBlank
        var dob: LocalDate = LocalDate.now()
)