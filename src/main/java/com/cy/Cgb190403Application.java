package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.cy.dao")
public class Cgb190403Application {

	public static void main(String[] args) {
		SpringApplication.run(Cgb190403Application.class, args);
	}

}
