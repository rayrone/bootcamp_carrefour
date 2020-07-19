package com.teste;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoTest {

    public void test(){
        List mock = mock(List.class);

        when(mock.get(0)).thenReturn("one");
        when(mock.get(1)).thenReturn("two");

        verify(mock).clear();
    }
}
