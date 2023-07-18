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

        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("1 - Fazer compras ");
        System.out.println("2 - Eliminar a última compra ");
        System.out.println("3 - Ver compras efetuadas ");
        System.out.println("4 - Ver a média semanal ");
        System.out.println("5 - Sair ");
        escolha = Le.umInt();

        switch (escolha) {
            case '1' -> {
                double compra1, compra2, compra3, orcamento;
                System.out.print("Introduza o valor da 1ª compra: ");
                compra1 = Le.umDouble();
                System.out.print("Introduza o valor da 2ª compra: ");
                compra2 = Le.umDouble();
                System.out.print("Introduza o valor da 3ª compra: ");
                compra3 = Le.umDouble();
                System.out.print("Introduza o valor do orçamento: ");
                orcamento = Le.umDouble();
                double despesa_total = compra1 + compra2 + compra3;
                double saldo_final = orcamento - despesa_total;
                double saldo_final_percentagem = saldo_final / orcamento * 100;
                System.out.println("Gastou " + despesa_total + " euros.");
                System.out.println("Ficou com " + saldo_final + " euros.");
                System.out.println("Gastou " + despesa_total / orcamento * 100 + "% do seu orçamento e ficou com " + saldo_final_percentagem + "% do seu orçamento.");
            }
            case '2' -> System.out.println("Ainda em desenvolvimento");
            case '3' -> System.out.println("Ainda em desenvolvimento");
            case '4' -> System.out.println("Ainda em desenvolvimento");
            case '5' -> System.out.println("Ainda em desenvolvimento");
        }
    } 
}
