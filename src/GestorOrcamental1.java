import java.net.SocketTimeoutException;

public class GestorOrcamental1 {
    
    public static void main(String[ ] args)
    {
        System.out.println ();
        System.out.println("Bem-vindo ao seu gestor orçamental.");
        System.out.println ();
        //System.out.println("===================================");
        //for (String param : args) {
        //     System.out.println("Parametro:" + param);
        //}

        int escolha;

        do {
            System.out.println("Escolha uma das seguintes opções: ");
            System.out.println("1 - Fazer compras");
            System.out.println("2 - Eliminar a última compra");
            System.out.println("3 - Ver compras efetuadas");
            System.out.println("4 - Ver a média semanal");
            System.out.println("5 - Sair");
            System.out.print("Introduza aqui a opção: ");
            escolha = Le.umInt();
            System.out.println();

            if (escolha > 5) {
                System.out.println("Número inválido");
            }

            if (escolha < 1) {
                System.out.println("Número inválido");
            }

            switch (escolha) {
                case 1: fazerCompras();break;

                case 2:
                    System.out.println("2 - Eliminar a última compra ");
                    break;
                case 3:
                    System.out.println("3 - Ver compras efetuadas ");
                    break;
                case 4:
                    System.out.println("4 - Ver a média semanal ");
                    break;
                case 5:
                    System.out.println("5 - Sair ");
                    break;
            }

            System.out.println();

        } while (escolha != 5);

    }

    public static void fazerCompras() {
        double compra1, orcamento;
        System.out.print("Introduza o valor da 1ª compra: ");
        compra1 = Le.umDouble();
        System.out.print("Introduza o valor do orçamento: ");
        orcamento = Le.umDouble();
        double despesa_total = compra1;

        if (despesa_total < 0 && orcamento < 0) {
            System.out.println("Valores inválidos.");
        } else {

            if (despesa_total > orcamento) {
                System.out.println("Não é possível efetuar a compra.");
            } else {
                if (despesa_total == orcamento) {
                    despesa_total = orcamento;
                    double gastos_em_percentagem = despesa_total / orcamento * 100;
                    double saldo_final = orcamento - despesa_total;
                    double saldo_final_percentagem = saldo_final / orcamento * 100;
                    System.out.println("Gastou " + despesa_total + " euros.");
                    System.out.println("Ficou com " + saldo_final + " euros.");
                    System.out.println("Gastou " + gastos_em_percentagem + "% do seu orçamento e ficou com " + saldo_final_percentagem + "% do seu orçamento.");

                } else {
                    double gastos_em_percentagem = despesa_total / orcamento * 100;
                    double saldo_final = orcamento - despesa_total;
                    double saldo_final_percentagem = saldo_final / orcamento * 100;
                    System.out.println("Gastou " + despesa_total + " euros.");
                    System.out.println("Ficou com " + saldo_final + " euros.");
                    System.out.println("Gastou " + gastos_em_percentagem + "% do seu orçamento e ficou com " + saldo_final_percentagem + "% do seu orçamento.");
                }
            }
        }
    }
}


