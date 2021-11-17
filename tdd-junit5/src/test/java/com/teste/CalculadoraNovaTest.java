package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarDoisValores(){
        int valorA = 1;
        int valorB = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        var soma = calculadoraNova.somar(valorA,valorB);

        assertEquals(3, soma);
    }

    @Test
    public void deveSomarTresValores(){
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        var soma = calculadoraNova.somar(valorA,valorB, valorC);

        assertEquals(6, soma);
    }

    @Test
    public void deveSubtrairDoisValores(){
        int valorA = 5;
        int valorB = 4;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int resultado = calculadoraNova.subtrair(valorA,valorB);

        assertEquals(1, resultado);
    }

    @Test
    public void deveSubtrairTresValores(){
        int valorA = 5;
        int valorB = 4;
        int valorC = 5;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int resultado = calculadoraNova.subtrair(valorA,valorB, valorC);

        assertEquals(-4, resultado);
    }

    @Test
    public void deveMultiplicarDoisValores(){
        int valorA = 5;
        int valorB = 4;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int resultado = calculadoraNova.multiplicar(valorA,valorB);

        assertEquals(20, resultado);
    }

    @Test
    public void deveMultiplicarTresValores(){
        int valorA = 5;
        int valorB = 4;
        int valorC = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int resultado = calculadoraNova.multiplicar(valorA,valorB, valorC);

        assertEquals(40, resultado);
    }

    @Test
    public void deveDividirDoisValores(){
        int valorA = 10;
        int valorB = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int resultado = calculadoraNova.dividir(valorA,valorB);

        assertEquals(5, resultado);
    }

    @Test
    public void deveDividirTesValores(){
        int valorA = 20;
        int valorB = 2;
        int valorC = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int resultado = calculadoraNova.dividir(valorA,valorB, valorC);

        assertEquals(5, resultado);
    }

}
