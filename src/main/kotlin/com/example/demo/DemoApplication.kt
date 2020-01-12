package com.example.demo

import com.example.demo.resource.UsersResource
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication

class DemoApplication


fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
