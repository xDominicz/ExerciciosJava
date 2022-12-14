//Após receber a palavra "fim"
// o program deve exibir os resultados de cada uma das contas realizadas
// até o presente momento. Utilize um array ou Array List para realizar essa tarefa.

import java.util.ArrayList;
import java.util.Scanner;

public class HistoricoCalculo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        boolean finalizaCalculadora = false;

        while (finalizaCalculadora == false) {
            System.out.println("""
                    Utilize os números para Selecionar:\s
                     1 - Soma
                     2 - Subtração
                     3 - Multiplicação
                     4 - Divisão
                     5 - Encerrar""");
            Scanner scan = new Scanner(System.in);
            System.out.print("\nEscolher Operação: ");
            int opcao = scan.nextInt();
            int n1, n2;

            switch (opcao) {
                case 1:
                    System.out.println("Soma");

                    System.out.print("Digite o primeiro número: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scan.nextInt();
                    System.out.printf("Resultado: %d + %d = %d\n", n1, n2, n1 + n2);
                    arrayList.add(String.valueOf(n1) + " + " + String.valueOf(n2) + " = " + String.valueOf(n1+n2));
                    break;
                case 2:
                    System.out.println("Subtração");
                    System.out.print("Digite o primeiro número: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scan.nextInt();
                    System.out.printf("Resultado: %d - %d = %d\n", n1, n2, n1 - n2);
                    arrayList.add(String.valueOf(n1) + " - " + String.valueOf(n2) + " = " + String.valueOf(n1-n2));

                    break;
                case 3:
                    System.out.println("Multiplicação");
                    System.out.print("Digite o primeiro número: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scan.nextInt();
                    System.out.printf("Resultado: %d * %d = %d\n", n1, n2, n1 * n2);
                    arrayList.add(String.valueOf(n1) + " * " + String.valueOf(n2) + " = " + String.valueOf(n1*n2));
                    break;
                case 4:
                    System.out.println("Divisão");
                    System.out.print("Digite o primeiro número: ");
                    n1 = scan.nextInt();
                    System.out.print("Digite o segundo número: ");
                    n2 = scan.nextInt();
                    System.out.printf("Resultado: %d / %d = %d\n", n1, n2, n1 / n2);
                    arrayList.add(String.valueOf(n1) + " / " + String.valueOf(n2) + " = " + String.valueOf(n1/n2));

                    break;
                case 5:
                    finalizaCalculadora = true;
                    break;
            }

        }
        System.out.println("----------------------------------------");
        System.out.println("Operações Realizadas: ");
        arrayList.forEach(item -> System.out.println(item));
    }
}
