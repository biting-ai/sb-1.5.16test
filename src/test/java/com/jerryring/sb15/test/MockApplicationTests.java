package com.jerryring.sb15.test;

import com.jerryring.sb15.test.controller.IndexController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author broker
 * @version v1.0
 * @date 2018-09-28
 */
public class MockApplicationTests {
    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello world")));
    }

}
