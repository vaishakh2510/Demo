package com.example.ConnectionServ;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConnectionServApplicationTests {

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Autowired
	private ConnectionControll controller;
}
