package com.mahdiyeh_rezaei.mockitojunitfirstattempt.mocking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoBusinessMock {
    @Test
    public void testUsingMocks() {
        ToDoService toDoService = mock(ToDoService.class);
        List<String> combinedList = Arrays.asList(" Use Core Java ",
                " Use Spring Core ",
                " Use w3eHibernate ",
                " Use Spring MVC ");

        when(toDoService.getTodos("dummy")).thenReturn(combinedList);

        ToDoBusiness business = new ToDoBusiness(toDoService);
        List<String> allTodos = business.getTodosForHibernate("dummy");
        System.out.println(allTodos);
        Assert.assertEquals(1,allTodos.size());
    }
}
