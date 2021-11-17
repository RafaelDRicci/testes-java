package com.teste;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSoma(){
        Calculadora calculadora = new Calculadora();
        int recebido = calculadora.somar("1+1+3");
        int esperado = 5;
        assertEquals(esperado, recebido);
    }

    @Test
    public void testSomarComMock(){
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.somar("1+2")).thenReturn(10);

        int resultado = calculadora.somar("1+2");
        assertEquals(10, resultado);
    }

}
