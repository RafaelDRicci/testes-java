package com.teste;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MatcherTest {


    @Test
    public void givenSearch_checkToString(){
        Person person = new Person("Barack", "Obama");
        String str = person.toString();
        assertThat(person, hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists(){
        Person person = new Person("Barack", "Obama");
        assertThat(person, hasProperty("firstName"));
    }

    @Test
    public  void givenCollection_checkEmpty(){
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, empty());
    }

    @Test
    public void givenInteger_checkGreater(){
        assertThat(1, greaterThan(0));
    }

    @Test
    public void givenString_checkNull(){
        String str = null;
        assertThat(str, isEmptyOrNullString());
    }

}
