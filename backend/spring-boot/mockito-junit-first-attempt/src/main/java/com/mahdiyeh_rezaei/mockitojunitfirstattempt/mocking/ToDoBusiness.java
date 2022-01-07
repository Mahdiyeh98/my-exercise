package com.mahdiyeh_rezaei.mockitojunitfirstattempt.mocking;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {

    // ToDoBusiness is a SUT (system under test)
    // ToDoService is a Dependency (as ToDoBusiness is dependent on it)
    ToDoService toDoService;

    public ToDoBusiness(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> getTodosForHibernate(String user) {
        List<String> hibernateList  = new ArrayList<>();
        List<String> combinedList = toDoService.getTodos(user);

        for (String todo : combinedList) {
            if (todo.contains("Hibernate"))
                hibernateList.add(todo);
        }

        return hibernateList;
    }
}
