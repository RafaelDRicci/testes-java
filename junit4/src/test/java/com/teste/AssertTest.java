package com.teste;

import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class AssertTest {

    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] recebido = "teste".getBytes();
        assertArrayEquals(esperado, recebido);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("teste", "teste");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Object obj = new Object();
        assertSame(obj, obj);
    }

}
