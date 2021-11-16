package com.teste;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSoma(){
        Calculadora calculadora = new Calculadora();
        int recebido = calculadora.somar("1+1+3");
        int esperado = 5;
        assertEquals(esperado, recebido);
    }

}
