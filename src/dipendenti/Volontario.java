package dipendenti;

import interfaces.Lavoratori;

import java.time.LocalDateTime;

public class Volontario implements Lavoratori {
    private String name;
    private String age;
    private String CV;


    public Volontario(String name, String age, String CV) {
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    @Override
    public void checkIn(LocalDateTime dateTime) {
        System.out.println("Sono " + name + ", ho " + age + " anni, ho esperienza con " + CV + " e sono entrato alle " + dateTime.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCV() {
        return CV;
    }
}
