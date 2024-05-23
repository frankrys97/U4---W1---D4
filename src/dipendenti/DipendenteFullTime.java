package dipendenti;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(String name, String surname, double stipendio, Dipartimento dipartimento) {
        super(name, surname, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }


}
