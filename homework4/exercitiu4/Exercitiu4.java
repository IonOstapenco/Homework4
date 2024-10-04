package homework4.exercitiu4;

import java.util.Scanner;

/*Aveti inregistrata ora in formatul american in una din variabile
 * (de exemplu 11, 12, 6, 16, 23). Programul va spune daca este prima parte a zilei
 * daca ora e pana la 12 (inclusiv) si a doua parte a zilei  daca este trecut de 12*/
public class Exercitiu4 {
    public static void main(String[] args) {
        int ora, minuta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu ora");
        ora = scanner.nextInt();
        System.out.println("introdu minuta");
        minuta = scanner.nextInt();
        if (((ora < 0) && (ora > 24)) && (minuta < 0) && (minuta > 60)) {
            System.out.println("ai introdus ceva gresit");
        } else if ((ora >= 0) && (ora <= 12)) {
            System.out.println("AM " + " ora " + ora + " : " + minuta);
        } else if ((ora > 12)) {
            System.out.println("PM " + " ora " + ora + " : " + minuta);
        }
    }
}