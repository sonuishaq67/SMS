package com.college;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.model.Student;

@RestController
public class GetMapng {

    @ResponseBody
    @GetMapping("/customersget")
    String index() {
        return "Hello, World!";
    }
    
    @ResponseBody
    @PostMapping("/customerspost")
    void indexa(@RequestBody ArrayList<String> names) {
    	for(String onei:names)
    	{
    		System.out.println(onei);
    	}
    }
    
    @ResponseBody
    @PostMapping("/customerspostobject")
    ArrayList<Student> indexb(@RequestBody ArrayList<Student> students) {
    	return students;
    }
       

}