package exercicio02;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

        // Sequências solicitadas no exercício
        String sequencia01 = "1 2 3 44 5";
        String sequencia02 = "55 2 1 854 963 520 1 0 98 8";
        String sequencia03 = "2 3 5 44 8 99 6 55 72 3 01 25";
        String sequencia04 = "98 99 100 101 102 103 105 105";
        String sequencia05 = "1";

        // Imprimindo o que foi solicitado
        System.out.println("Sequência: "+sequencia01
                +"\nO maior número é "+maiorNumero(sequencia01)
                +"\nA soma dos valores é "+soma(sequencia01)
                +"\n---------------------------------------------");

        System.out.println("Sequência: "+sequencia02
                +"\nO maior número é "+maiorNumero(sequencia02)
                +"\nA soma dos valores é "+soma(sequencia02)
                +"\n---------------------------------------------");

        System.out.println("Sequência: "+sequencia03
                +"\nO maior número é "+maiorNumero(sequencia03)
                +"\nA soma dos valores é "+soma(sequencia03)
                +"\n---------------------------------------------");

        System.out.println("Sequência: "+sequencia04
                +"\nO maior número é "+maiorNumero(sequencia04)
                +"\nA soma dos valores é "+soma(sequencia04)
                +"\n---------------------------------------------");

        System.out.println("Sequência: "+sequencia05
                +"\nO maior número é "+maiorNumero(sequencia05)
                +"\nA soma dos valores é "+soma(sequencia05)
                +"\n---------------------------------------------");
    }

    static int maiorNumero(String sequencia){
        String[] strNums;
        strNums = sequencia.split(" ");

        // Passando o array de string para array de inteiro
        int [] intNums = new int [strNums.length];
        for(int i=0; i<strNums.length; i++) {
            intNums[i] = Integer.parseInt(strNums[i]);
        }

        // Descobrindo o maior número da sequência
        int max = 0;
        for (int num : intNums) {
            if (num > max)
                max = num;
        }
        return max;
    }

    static int soma(String sequencia){
        String[] strNums;
        strNums = sequencia.split(" ");

        // Passando o array de string para array de inteiro
        int [] intNums = new int [strNums.length];
        for(int i=0; i<strNums.length; i++) {
            intNums[i] = Integer.parseInt(strNums[i]);
        }

        // Somando os valores da sequência
        int soma = 0;
        for (int num : intNums) {
            soma += num;
        }
        return soma;
    }

}
