package com.mycompany.exercicio2;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio2 {

    public static void main(String[] args) {
        int[] vetorEntradaA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vetorEntradaB = {4, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 38, 38};

        ArrayList<Integer> vetorSaida = acharDuplicatas(vetorEntradaA, vetorEntradaB);

        System.out.print("Saída: [ ");
        for (int num : vetorSaida) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    public static ArrayList<Integer> acharDuplicatas(int[] vetorA, int[] vetorB) {
        int contadorVetorB;
        ArrayList<Integer> vetorFinal = new ArrayList<>();
        for (int valorA : vetorA) {
            for (contadorVetorB = 0; contadorVetorB < vetorB.length; contadorVetorB++){
                if (valorA == vetorB[contadorVetorB]) {
                    vetorFinal.add(valorA);
                }
            }
        }
        ArrayList<Integer> resultadoFinal = removerDuplicatas(vetorFinal);
        
        return resultadoFinal;
    }
    
    public static ArrayList<Integer> removerDuplicatas(ArrayList<Integer> vetorComDuplicatas) {
        HashSet<Integer> uniqueElements = new HashSet<>(vetorComDuplicatas);
        ArrayList<Integer> resultado = new ArrayList<>(uniqueElements);
        return resultado;
    }
}
