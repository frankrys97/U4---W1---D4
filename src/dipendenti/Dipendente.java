package dipendenti;

import interfaces.Lavoratori;

import java.time.LocalDateTime;
import java.util.Random;

public abstract class Dipendente implements Lavoratori {

    private final int matricola;
    private final String name;
    private final String surname;
    private double stipendio;
    private Dipartimento dipartimento;


/*
    public Dipendente(String name, String surname, double stipendio, double oreLavorate, Dipartimento dipartimento) {
*/

    public Dipendente(String name, String surname, double stipendio, Dipartimento dipartimento) {
        Random random = new Random();


        this.matricola = random.nextInt(1000);
        this.name = name;
        this.surname = surname;
        /*    this.stipendio = calcoloStipendio(stipendio, oreLavorate);*/
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }



 /*   public double calcoloStipendio(double stipendio, double oreLavorate) {
        return Math.floor((stipendio / 170) * oreLavorate);
    }*/

    public abstract double calculateSalary();

    @Override
    public void checkIn(LocalDateTime dateTime) {
        System.out.println("Sono " + name + " , ho uno stipendio di " + stipendio + " € e sono entrato alle " + dateTime.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public int getMatricola() {
        return matricola;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
