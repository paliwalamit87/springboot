package com.paliwal.demo1.service;

import com.paliwal.demo1.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class todoservice {

    private List<Todo> list = new ArrayList<>();

    public Todo create(Todo todo)
    {
        list.add(todo);
        return todo;
    }
    public List<Todo> getList()
    {
        return list;
    }
}
