package com.dio.calculadorasimples;

public class TesteIngenuoCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        if(temErroNaSoma(calculadora)){
            System.exit(1);
        }

        if(subtracaoEstaOk(calculadora) == false){
            System.out.println("\n\n Houve um erro na validacao da subtracao ##\n\n");
            System.exit(1);
        }

        System.out.println("\n\n ==> Todos os testes passaram <==");
        System.exit(0);

    }

    public static boolean temErroNaSoma(Calculadora calculadora){
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
            System.out.println("\n\n## Houve um erro na validacao da soma##\n\n");
        }
        return temErro;
    }

    public static boolean subtracaoEstaOk(Calculadora calculadora){
        if(calculadora.subtrai(2,2) != 0){
            return false;
        }
        if(calculadora.subtrai(2,-2) != 4){
            return false;
        }
        if(calculadora.subtrai(-2,2) != -4){
            return false;
        }
        if(calculadora.subtrai(-2,-2) != 0){
            return false;
        }
        if(calculadora.subtrai(0,0) != 0){
            return false;
        }
        return  true;
    }
}
