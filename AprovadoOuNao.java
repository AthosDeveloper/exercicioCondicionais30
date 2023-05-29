package exerciciosCondicionais30;

import java.util.Scanner;

public class AprovadoOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Informe a primeira nota: \n");
        double nota1 = sc.nextDouble();
        System.out.printf("\n Agora, informe a segunda nota: \n");
        double nota2 = sc.nextDouble();
        double media = nota1 + nota2 / 2;
        if (media >= 7) {
            System.out.printf("\n Você foi aprovado \n");
        } else if (media < 7) {
            System.out.printf("\n Você foi reprovado. \n");
        } else if (media == 10) {
            System.out.printf("\n Você foi aprovado com distinção. \n");
        }
    }

}