package com.jayhubb.dt.admin.controller;


import com.jayhubb.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("hello，校园代腿");
    }


}
