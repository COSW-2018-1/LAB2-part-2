/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sergio
 */
@Service
public class TodoServiceImpl implements TodoService{
    
    private List<Todo> todo = new ArrayList<>();
    
    @Autowired
    public TodoServiceImpl(){ }

    @Override
    public List<Todo> getTodoList() {
        return todo;
    }

    @Override
    public Todo addTodo(Todo todo) {
        this.todo.add(todo);
        return todo;
    }
    
}
