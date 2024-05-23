package dipendenti;

public class DipendentePartTime extends Dipendente {

    private double oreLavorate;

    public DipendentePartTime(String name, String surname, double stipendio, Dipartimento dipartimento) {
        super(name, surname, stipendio, dipartimento);
        this.oreLavorate = 0;
    }

    public void addOreLavorate(double ore) {
        if (ore > 0) {
            this.oreLavorate += ore;
        } else {
            System.out.println("Numero di ore non valido, numeri negativi non accettati");
        }
    }

    @Override
    public double calculateSalary() {
        return Math.floor((getStipendio() / 170) * oreLavorate);
    }


}
