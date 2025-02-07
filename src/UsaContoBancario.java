public class UsaContoBancario {

    public static void main(String[] args) {
        ContoBancario mioConto = new ContoBancario(32);
        mioConto.aggiuntaDenaro(550);
        mioConto.togliDenaro(430);
        System.out.println("Il saldo residuo è : " + mioConto.visualizzaSaldo());
    }
    
}
