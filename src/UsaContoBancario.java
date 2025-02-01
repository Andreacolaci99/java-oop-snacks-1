public class UsaContoBancario {

    public static void main(String[] args) {
        ContoBancario mioConto = new ContoBancario(32);
        mioConto.aggiuntaDenaro(700);
        mioConto.togliDenaro(600);
        System.out.println("Il saldo residuo è : " + mioConto.saldoCorrente);
    }
    
}
