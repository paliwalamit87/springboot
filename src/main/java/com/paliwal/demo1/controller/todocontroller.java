package com.paliwal.demo1.controller;

import com.paliwal.demo1.model.Todo;
import com.paliwal.demo1.service.todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")

public class todocontroller {

    @Autowired
    public todoservice service;

   @PostMapping
    public Todo createtodo(@RequestBody Todo todo)
    {
       return service.create(todo);

    };

   @GetMapping
    public List<Todo> getAll()
   {
       return  service.getList();
   }
}
