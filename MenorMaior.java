package exerciciosCondicionais30;

import java.util.Scanner;

public class MenorMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro número");
        int number = sc.nextInt();
        System.out.println("agora, digite o segundo número ");
        int number2 = sc.nextInt();
        if (number < number2) {
            System.out.printf("o número %d é maior que o número %d", number2, number);
        } else {
            System.out.printf("o número %d é maior que o número %d", number, number2);
        }
        sc.close();
    }

}

