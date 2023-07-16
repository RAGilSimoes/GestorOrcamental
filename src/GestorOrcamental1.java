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
        double saldo_final_percentagem = saldo_final /orcamento*100;

        System.out.println("Gastou " + despesa_total + " euros.");
        System.out.println("Ficou com " + saldo_final + " euros.");
        System.out.println("Gastou " + despesa_total/orcamento*100 + "% do seu orçamento e ficou com " + saldo_final_percentagem + "% do seu orçamento.");
    } 
}
