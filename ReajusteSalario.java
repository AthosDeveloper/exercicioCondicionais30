package exerciciosCondicionais30;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioAtual;
        double reajuste;
        double reajuste2;
        double reajuste3;

        double reajuste4;

        System.out.printf("\n Informe seu salário atual: \n");
        salarioAtual = sc.nextDouble();
        reajuste = (0.20 * salarioAtual);
        reajuste2 = (0.15 * salarioAtual);
        reajuste3 = (0.10 * salarioAtual);
        reajuste4 = (0.05 * salarioAtual);


if (salarioAtual <= 280.00){
    double salarioAjustado = salarioAtual + reajuste;

    System.out.printf("\n Seu salário anterior é de: \n %.2f Com o reajuste de 20 por cento está com: \n %.2f Valor do reajuste é de: \n %.2f ", salarioAtual, salarioAjustado, reajuste);

}else if(salarioAtual > 280.00 && salarioAtual <= 700.00){
    double salarioAjustado = salarioAtual + reajuste2;
    System.out.printf("\n Seu salário anterior é de: \n %.2f Com o reajuste de 15 por cento está com: \n %.2f Valor do reajuste é de: \n %.2f ", salarioAtual, salarioAjustado, reajuste2);

} else if (salarioAtual > 700.00 && salarioAtual <= 1500.00){
            double salarioAjustado = salarioAtual + reajuste3;

            System.out.printf("\n Seu salário anterior é de: \n %.2f Com o reajuste de 10 por cento está com: \n %.2f Valor do reajuste é de: \n %.2f ", salarioAtual, salarioAjustado, reajuste3);

        }else {
    double salarioAjustado = salarioAtual + reajuste4;
    System.out.printf("\n Seu salário anterior é de: \n %.2f Com o reajuste de 5 por cento está com: \n %.2f Valor do reajuste é de: \n %.2f ", salarioAtual, salarioAjustado, reajuste4);

}

sc.close();
    }

}

