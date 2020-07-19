package com.teste;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MatcherTest {

    @Test
    public void givenBean_checkToString(){
        Person person = new Person("Rayrone", "Marques");
        String str = person.toString();
        assertThat(person, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists(){
        Person person = new Person("Rayrone", "Marques");
        assertThat(person, HasProperty.hasProperty("firstName"));
    }

    @Test
    public void givenCollection_checkEmpty(){
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGreater(){
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkNull(){
        String str = null;
        assertThat(str, Matchers.emptyOrNullString());
    }
}
