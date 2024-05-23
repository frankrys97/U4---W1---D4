import dipendenti.*;
import interfaces.Lavoratori;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      /*  Dipendente dipendente1 = new Dipendente("Mario", "Rossi", 2000.0, 120, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("Luigi", "Verdi", 3000.0, 170, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente("Pippo", "Neri", 1500.0, 80, Dipartimento.VENDITE);

        System.out.println(dipendente1.toString());
        System.out.println(dipendente2.toString());
        System.out.println(dipendente3.toString());

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i].getMatricola());
        }*/


        DipendentePartTime dipendentePartTime1 = new DipendentePartTime("Mario", "Rossi", 2000.0, Dipartimento.PRODUZIONE);
        DipendenteFullTime dipendenteFullTime1 = new DipendenteFullTime("Luigi", "Verdi", 3000.0, Dipartimento.AMMINISTRAZIONE);
        DipendenteFullTime dipendenteFullTime2 = new DipendenteFullTime("Pippo", "Neri", 1500.0, Dipartimento.VENDITE);
        Dirigente dirigente = new Dirigente("Andrea", "Marrone", 5000.0, Dipartimento.AMMINISTRAZIONE);
        dipendentePartTime1.addOreLavorate(120);

        dipendenteFullTime2.setDipartimento(Dipartimento.AMMINISTRAZIONE);
        System.out.println(dipendenteFullTime2.toString());

        System.out.println();


        Dipendente[] dipendenti = {dipendentePartTime1, dipendenteFullTime1, dipendenteFullTime2, dirigente};

        double totaleStipendiMese = 0;


        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Stipendio di " + dipendenti[i].getName() + " " + dipendenti[i].getSurname() + ": " + dipendenti[i].calculateSalary());

            totaleStipendiMese += dipendenti[i].calculateSalary();

        }

        System.out.println("Totale stipendi mese: " + totaleStipendiMese);


        Volontario volontario = new Volontario("Mario", "25", "Java");

        System.out.println();


        Lavoratori[] dipendentiPiuVolontari = {dipendentePartTime1, dipendenteFullTime1, dipendenteFullTime2, dirigente, volontario};
        for (int i = 0; i < dipendentiPiuVolontari.length; i++) {
            dipendentiPiuVolontari[i].checkIn(LocalDateTime.now());
        }

    }
}