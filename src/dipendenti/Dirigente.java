package dipendenti;

public class Dirigente extends Dipendente {
    public Dirigente(String name, String surname, double stipendio, Dipartimento dipartimento) {
        super(name, surname, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

}
