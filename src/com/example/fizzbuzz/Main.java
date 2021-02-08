package com.example.fizzbuzz;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            String saida = "";
            if (i % 3 == 0) {
                saida += "Fizz ";
            }
            if (i % 5 == 0) {
                saida += "Buzz";
            }

            if (saida == "") {
                saida = String.valueOf(i);
            }

            System.out.println(saida);
        }
    }
}
