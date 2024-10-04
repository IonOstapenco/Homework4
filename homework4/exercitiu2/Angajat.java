package homework4.exercitiu2;

/*Inregistrati in tipul de variabile corespunzatoare urmatoarele
 * date: Mihai Munteanu, anul nasterii 1965, functia ocupata: Sef sectie
 * lucreaza in companie de: 5 ani, salariul: 25000.95 lei
 * Mai adugati inca 2 angajati in variabilele cu tipul
 * corespunzator, dupa care daca angajatul are mai mult de 4 ani lucrati
 * apare rumatorul output: Mihai Munteanu din 1965, Sef sectie Resurse
 * Umane, i-a fost marit salariul cu 500 de lei si la momentul dat constituie
 * 25500.95 lei*/
public class Angajat {
    private String prenume, nume, functia;
    private int anulNasterii, stajDeLucru;
    private double salariu;

    //constructor doar Builder sa-l foloseasca
    private Angajat(Builder builder) {
        this.prenume = builder.prenume;
        this.nume = builder.nume;
        this.functia = builder.functia;
        this.anulNasterii = builder.anulNasterii;
        this.stajDeLucru = builder.stajDeLucru;
        this.salariu = builder.salariu;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public int getAnulNasterii() {
        return anulNasterii;
    }

    public double getSalariu() {
        return salariu;
    }

    public String getFunctia() {
        return functia;
    }

    public int getStajDeLucru() {
        return stajDeLucru;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' +
                ", functia='" + functia + '\'' +
                ", anulNasterii=" + anulNasterii +
                ", stajDeLucru=" + stajDeLucru +
                ", salariu=" + salariu +
                '}';
    }

    //inner class builder
    public static class Builder {
        private String prenume;
        private String nume;
        private String functia;
        private int anulNasterii;
        private int stajDeLucru;
        private double salariu;

        //metode de a inscrie valori la campuri
        public Builder prenume(String prenume) {
            this.prenume = prenume;
            return this;
        }

        public Builder nume(String nume) {
            this.nume = nume;
            return this;
        }

        public Builder functia(String functia) {
            this.functia = functia;
            return this;
        }

        public Builder anulNasterii(int anulNasterii) {
            this.anulNasterii = anulNasterii;
            return this;
        }

        public Builder stajDeLucru(int stajDeLucru) {
            this.stajDeLucru = stajDeLucru;
            return this;
        }

        public Builder salariu(double salariu) {
            this.salariu = salariu;
            return this;
        }

        //metoda de creare a obiectului
        public Angajat build() {
            return new Angajat(this);
        }
    }

}
