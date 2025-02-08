import java.util.Arrays;

public class RegistroStudenti {

    private Studente[] studenti = {};

    public RegistroStudenti(){
      studenti = new Studente[5];
    }      
    public void aggiungiStudente(Studente studenteDaAggiungere){
      for (int i = 0; i < studenti.length; i++) {
        if(studenti[i] == null){
          studenti[i] = studenteDaAggiungere;
          return;
        }
        if(studenteDaAggiungere.equals(studenti[i])){
          System.out.println(studenteDaAggiungere + " è già presente");
          return;
        }
      }
    }
        @Override
        public String toString() {
        return Arrays.toString(studenti);
    }
  }

