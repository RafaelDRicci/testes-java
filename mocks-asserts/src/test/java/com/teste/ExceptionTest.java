package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage(){
        List<Object> lista = new ArrayList<>();

        expectedException.expect(IndexOutOfBoundsException.class);
        expectedException.expectMessage("Index 0 out of bounds for length 0");
        lista.get(0);
    }

    @Test
    public void testExceptionMessage(){
        try{
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOfBoundsException seja lancao");
        } catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }


}
