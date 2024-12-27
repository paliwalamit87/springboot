package com.paliwal.demo1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

   @RequestMapping("/dev")

    public String  greet()
    {
        return "amit start java class";
    }
}
