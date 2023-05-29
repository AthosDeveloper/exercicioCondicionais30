package exerciciosCondicionais30;

import java.util.Scanner;

public class CompareProduto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o preço do primeiro produto: ");
        double preco = sc.nextDouble();
        System.out.println("agora, informe o preço do segundo produto: ");
        double preco2 = sc.nextDouble();
        System.out.println("agora, informe o preço do terceiro produto: ");
        double preco3 = sc.nextDouble();
        if (preco < preco2){
            System.out.printf("\n O preço %.2f é o mais barato. \n ", preco);

        }else if (preco3 < preco2){
            System.out.printf("\n o preço %.2f é o mais barato. \n", preco3);
        } else
            System.out.printf("\n O preço %.2f é o mais barato. \n", preco2);
sc.close();
    }

}


