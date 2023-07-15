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

        double compra1 = 19.25;
        double compra2 = 12.5;
        double compra3 = 15.3;
        double orcamento = 80;
        double despesa_total = compra1 + compra2 + compra3;
        double saldo_final = orcamento - despesa_total;
        double saldo_final_percentagem = saldo_final /orcamento*100;

        System.out.println("Hoje gastou " + despesa_total + " euros.");
        System.out.println("Ficou com " + saldo_final + " euros.");
        System.out.println("Gastou " + despesa_total/orcamento*100 + "% do seu orçamento e ficou com " + saldo_final_percentagem + "% do seu orçamento.");
    } 
}
