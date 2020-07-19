package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // Expected Exceptions

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        new ArrayList<Object>().get(0);
    }

    // Expected Exceptions Rules

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }

    // Try / Catch Idiom

    @Test
    public void testExceptionMessage(){
        try{
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
