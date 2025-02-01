public class ContoBancario {

    public double numeroConto;
    public double saldo;
    public double saldoCorrente;
    
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
}
