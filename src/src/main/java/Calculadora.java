package main.java;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode dividir por zero");
        }
        return a / b;
    }

    public boolean ehPositivo(int numero) {
        return numero > 0;
    }
}