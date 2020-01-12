package com.example.demo.`interface`

import com.example.demo.model.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRespository : JpaRepository<Users, Long> {
}