package com.mahdiyeh_rezaei.mockitojunitfirstattempt.stubbing;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
    // ToDoBusiness is a SUT (system under test)
    // ToDoService is a Dependency (as ToDoBusiness is dependent on it)

    public ToDoService toDoService;

    public ToDoBusiness(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> getTodosForSpring(String user){
        List<String> retrievedTodos = new ArrayList<>();
        List<String> todos = toDoService.getTodos(user);

        for (String todo : todos) {
            if (todo.contains("Spring"))
                retrievedTodos.add(todo);
        }

        return retrievedTodos;
    }
}
