package com.greenfox.filip.model;

import com.greenfox.filip.controllers.RestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class TestRestController {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    // if an additional service layer is used
    // - meaning not all logic is added to the controller and you have Autowired fields in it -
    // then you have to mock out the service class like below
    //
    //@MockBean
    //private UserService userService;


    @Test
    public void doublingSuccessful() throws Exception {
        mockMvc.perform(get("/doubling?input=15"))
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"result\":30,\"received\":15}"))
                .andExpect(status().isOk());
    }

//    @Test
//    public void doUntilSuccessful() throws Exception {
//        mockMvc.perform(post("/dountil/sum)
//                .contentType(MediaType.APPLICATION_JSON)
//
//                                .andExpect(status().isOk())
//                .andExpect(content().contentType(contentType))
//                .andExpect(jsonPath("$.result", is("success")));
//    }



//    @Test
//    public void addNewUser_succesfull() throws Exception {
//        mockMvc.perform(post("/users")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"email\": \"name@example.com\", \"password\": \"12345\"}"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(contentType))
//                .andExpect(jsonPath("$.result", is("success")))
//                .andExpect(jsonPath("$.message", is("User is added")));
//    }
//
//    @Test
//    public void addNewUser_missingEmail() throws Exception {
//        mockMvc.perform(post("/users")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"password\": \"12345\"}"))
//                .andExpect(status().isBadRequest())
//                .andExpect(content().contentType(contentType))
//                .andExpect(jsonPath("$.result", is("fail")))
//                .andExpect(jsonPath("$.message", is("Email is missing")));
//    }


}
