public class UsaRegistro {

    public static void main(String[] args) {
        Studente studente1 = new Studente("Andrea", "Colaci", 25);
        Studente studente2 = new Studente("Alfonso", "Signorini", 60);
        Studente studente3 = new Studente("Paolo", "Bitta", 50);
        Studente studente4 = new Studente("Alberto", "Tortora", 25);
        Studente studente5 = new Studente("Fabio", "Pecchia", 40);


        RegistroStudenti registro = new RegistroStudenti();
        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);
        registro.aggiungiStudente(studente4);
        registro.aggiungiStudente(studente5);
        System.out.println(registro);
    }
}
