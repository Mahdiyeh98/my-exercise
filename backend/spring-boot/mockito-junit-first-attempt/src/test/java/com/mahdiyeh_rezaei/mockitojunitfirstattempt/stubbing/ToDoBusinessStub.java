package com.mahdiyeh_rezaei.mockitojunitfirstattempt.stubbing;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ToDoBusinessStub {

    @Test
    public void test(){
        ToDoService doServiceStub = new ToDoServiceStub();
        ToDoBusiness business = new ToDoBusiness(doServiceStub);

        List<String> retrievedTodos = business.getTodosForSpring("Dummy");

        Assert.assertEquals(retrievedTodos.size(), 2);
        System.out.println("Stub is working correctly 👌");
    }
}
