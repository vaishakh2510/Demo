package com.example.ConnectionServ;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ConnectionControll.class)
public class ServiceTest {

@Autowired
private MockMvc mockMvc;

@MockBean
private ConnectionService service;

@Test
public void greetingShouldReturnMessageFromService() throws Exception {
when(service.getAccounts()).thenReturn("from service method for Wipro demo");
this.mockMvc.perform(get("/getAccount"))//.andExpect(status().isOk());
.andExpect(content().string(containsString("from service method")));
}

}