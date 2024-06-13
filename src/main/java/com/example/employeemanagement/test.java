package com.example.employeemanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class test {
    @RequestMapping("/")
    public String test() {
        return "Working fine";
    }
}
