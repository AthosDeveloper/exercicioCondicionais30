package exerciciosCondicionais30;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int dia = 0;
        System.out.printf("\n Informe um número, de 1 a 7: \n");
        dia = sc.nextInt();
   switch (dia){
       case 1:
           System.out.println("domingo");
           break;
       case 2:
           System.out.println("segunda");
           break;
       case 3:
           System.out.println("terça");
           break;
       case  4:
           System.out.println("quarta");
           break;
       case  5:
           System.out.println("quinta");
           break;
       case 6:
           System.out.println("sesta");
       case 7:
           System.out.println("sábado");
           break;
       default:
           System.out.println("valor inválido, digite um número de 1 a 7");
   }
    }
}
