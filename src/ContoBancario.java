public class ContoBancario {

    private double numeroConto;
    private double saldo;
    private double saldoCorrente;
    
    public ContoBancario(double numeroConto){
        saldo = 0;
    }

    public double aggiuntaDenaro(double inserisciImportoDaAggiungere){
       saldoCorrente = saldo + inserisciImportoDaAggiungere;
        return saldoCorrente;
    }

    public double togliDenaro(double inserisciImportoDaPrelevare){
        saldoCorrente -= inserisciImportoDaPrelevare;
        return saldoCorrente;
    }
    public double visualizzaSaldo(){
        return saldoCorrente;
        }
}
