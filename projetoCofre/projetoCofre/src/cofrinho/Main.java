package cofrinho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao;
        int tipoMoeda;
        double valor;

        Scanner sc = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        System.out.println("---------------------------------------");
        System.out.println("SEJA BEM VINDO AO COFRINHO!");
        System.out.println("---------------------------------------");
        Menu.inicial();
        opcao = sc.nextInt();

        while (opcao != 5) {

            if (opcao == 1) {
                Menu.tipoMoeda();
                tipoMoeda = sc.nextInt();
                if (tipoMoeda < 1 || tipoMoeda > 3) {
                    System.out.println("Código da moeda não existe.");
                } else {
                    Menu.valor();
                    valor = sc.nextDouble();
                    if (tipoMoeda == 1) {
                        cofre.adiconar(new Dolar(valor));
                    } else if (tipoMoeda == 2) {
                        cofre.adiconar(new Euro(valor));
                    } else if (tipoMoeda == 3) {
                        cofre.adiconar(new Real(valor));
                    }
                }
            } else if (opcao == 2) {
                if (cofre.getMoedas().isEmpty()) {
                    System.out.println("Lista vazia.");
                } else {
                    cofre.listarMoedas();
                    Menu.tipoMoeda();
                    tipoMoeda = sc.nextInt();
                    if (tipoMoeda < 1 || tipoMoeda > 3) {
                        System.out.println("Código da moeda não existe.");
                    }
                    Menu.valor();
                    valor = sc.nextDouble();
                    if (tipoMoeda == 1) {
                        cofre.remover(new Dolar(valor));
                    } else if (tipoMoeda == 2) {
                        cofre.remover(new Euro(valor));
                    } else if (tipoMoeda == 3) {
                        cofre.remover(new Real(valor));
                    };
                }
            } else if (opcao == 3) {
                cofre.listarMoedas();
            } else if (opcao == 4) {
                cofre.totalConvertido();
            } else {
                System.out.println("Opção inválida!");
            }

            Menu.inicial();
            opcao = sc.nextInt();
        }
        System.out.println("FINALIZANDO PROGRAMA...");
    }
}