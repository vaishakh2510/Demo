package com.example.ConnectionServ;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

@LocalServerPort
private int port;

@Autowired
private TestRestTemplate restTemplate;

@Test
public void greetingShouldReturnDefaultMessage() throws Exception {
assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/message",
String.class)).contains("hello");
}

//@Test
//public void testMyControllerMethods() throws Exception {
//assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/demo/customer",
//String.class)).contains("from service method");
//}
}