package com.mahdiyeh_rezaei.mockitojunitfirstattempt.mocking;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestList {

    @Test
    public void testListMockito_returnSingleValue(){
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(1);

        Assert.assertEquals(1,mockList.size());
        Assert.assertEquals(1,mockList.size());

        System.out.println("MockList size:"+mockList.size());
        System.out.println("MockList:"+mockList);

    }
}
