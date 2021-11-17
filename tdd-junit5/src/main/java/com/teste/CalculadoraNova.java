package com.teste;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraNova {

    public int somar(int ... valores){
        int soma = 0;
        for (int valor: valores) {
            soma += valor;
        }
        return soma;
    }

    public int subtrair(int... valores) {
        List<Integer> listValores = new ArrayList<>();
        for(int valor: valores){
            listValores.add(valor);
        }
        int resultado = listValores.get(0);
        for(int i = 1; i < listValores.size(); i++){
            resultado -= listValores.get(i);
        }

        return resultado;
    }

    public int multiplicar(int... valores){
        int resultado = 1;
        for(int valor: valores){
            resultado *= valor;
        }
        return resultado;
    }

    public int dividir(int... valores){
        List<Integer> listValores = new ArrayList<>();
        for(int valor: valores){
            listValores.add(valor);
        }
        int resultado = listValores.get(0);
        for(int i = 1; i < listValores.size(); i++){
            resultado /= listValores.get(i);
        }

        return resultado;
    }

}
