package homework4.exercitiu2;
/*Inregistrati in tipul de variabile corespunzatoare urmatoarele
 * date: Mihai Munteanu, anul nasterii 1965, functia ocupata: Sef sectie
 * lucreaza in companie de: 5 ani, salariul: 25000.95 lei
 * Mai adugati inca 2 angajati in variabilele cu tipul
 * corespunzator, dupa care daca angajatul are mai mult de 4 ani lucrati
 * apare rumatorul output: Mihai Munteanu din 1965, Sef sectie Resurse
 * Umane, i-a fost marit salariul cu 500 de lei si la momentul dat constituie
 * 25500.95 lei*/

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MainAngajat {
    public static void main(String[] args) {

        String prenume, nume, functia;
        int anulNasterii, stajDeLucru;
        double salariu;
        int numarDeAngajati = 2;
        int count = 0;


        Set<Angajat> angajati = new LinkedHashSet<>(numarDeAngajati);//in ordinea adaugarii
        Scanner scanner = new Scanner(System.in);

        Angajat angajat1 = new Angajat.Builder()
                .prenume("Mihai")
                .nume("Munteanu")
                .functia("Sef Resurse umane")
                .anulNasterii(1965)
                .stajDeLucru(5)
                .salariu(25000.95)
                .build();
        angajati.add(angajat1);
        System.out.println(angajati);


        while (count < numarDeAngajati) {
            System.out.println("introdu info angajati");
            System.out.println("introdu prenumele");
            prenume = scanner.nextLine();

            System.out.println("introdu nume");
            nume = scanner.nextLine();

            System.out.println("introdu functia");
            functia = scanner.nextLine();

            System.out.println("introdu anul nasterii");
            anulNasterii = scanner.nextInt();

            System.out.println("introdu staj de lucru");
            stajDeLucru = scanner.nextInt();

            System.out.println("introdu salariu");
            salariu = scanner.nextDouble();

            if (stajDeLucru > 4) {
                salariu += 500;
            }

            scanner.nextLine();

            Angajat angajat = new Angajat.Builder()
                    .prenume(prenume)
                    .nume(nume)
                    .functia(functia)
                    .anulNasterii(anulNasterii)
                    .stajDeLucru(stajDeLucru)
                    .salariu(salariu)
                    .build();
            //adaugam in colectie
            angajati.add(angajat);

            count++;
        }

        //afisam
        System.out.println(angajati);


    }
}
