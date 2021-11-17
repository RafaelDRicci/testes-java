package com.dio.calculadorasimples;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculadoraTest {

    static Calculadora calculadora;

    @Test
    public void testSomaMenosIngenuo(){
        calculadora = new Calculadora();
        boolean temErro = false;
        if(calculadora.soma(2,2) != 4){
            temErro = true;
        }
        if(calculadora.soma(-2, 2) != 0){
            temErro = true;
        }
        if(calculadora.soma(2, -2) != 0){
            temErro = true;
        }
        if(calculadora.soma(-2, 2) != 0){
            temErro = true;
        }
        if(calculadora.soma(-2, -2) != -4){
            temErro = true;
        }
        if(calculadora.soma(0, 0) != 0){
            temErro = true;
        }
        if(temErro){
            fail("\n\n## Houve um erro na validacao da soma ##\n\n");
        }
    }

    @Test
    public void deveResultarQuatroQuandoDoisComDois(){
        assertEquals(4.0, calculadora.soma(2.0, 2.0));
    }

    @Test
    public void deveResultarZeroAoSimarDoisComMenosDois(){
        assertEquals(0, calculadora.soma(2.0, -2.0));
    }

    @BeforeAll
    public static void setup(){
        calculadora = new Calculadora();
    }

    @DisplayName("Valida multiplas somas com informacoes CSV")
    @ParameterizedTest
    @CsvSource({"1.0, 1.0, 2.0", "2.0, 3.0 , 5.0"})
    void validaMultiplasSomasCSV(double valorA, double valorB, double resultadoEsperado){
        assertEquals(resultadoEsperado, calculadora.soma(valorA, valorB));
    }

    @DisplayName("Valida multiplas somas com informacoes CSV")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @Disabled
    void validaMultiplasSomasArquivoCSV(double valorA, double valorB, double resultadoEsperado){
        assertEquals(resultadoEsperado, calculadora.soma(valorA, valorB));
    }

}
