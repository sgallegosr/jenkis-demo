package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controllers.JenkinsDemoController;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Autowired
	private JenkinsDemoController jenkinsDemoController;
	
	@Test
	void contextLoads() {
		assertThat(jenkinsDemoController).isNotNull();
	}

}
