package cofrinho;

public class Menu {

    public static void inicial() {
        System.out.println();
        System.out.println("=======================================");
        System.out.println("============== Cofrinho ===============");
        System.out.println("=======================================");
        System.out.println("============= 1.Adicionar =============");
        System.out.println("============= 2.Remover ===============");
        System.out.println("============= 3.Listar Moedas =========");
        System.out.println("============= 4.Converter Total =======");
        System.out.println("============= 5.Sair ==================");
        System.out.println("=======================================");
        System.out.print("Escolha uma das opções acima: ");
    }

    public static void tipoMoeda() {
        System.out.println();
        System.out.println("=======================================");
        System.out.println("=============== 1.Dolar ===============");
        System.out.println("=============== 2.Euro ================");
        System.out.println("=============== 3.Real ================");
        System.out.println("=======================================");
        System.out.print("Escolha o tipo de moeda: ");
    }

    public static void valor() {
        System.out.print("Insira o valor: ");
    }
}