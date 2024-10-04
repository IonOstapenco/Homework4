package homework4.exercitiu3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Scrieti un program in Java in care avem stocata varsta persoanei intr-o variabila
 * de tip integer. Programul ne spune daca suntem copii sau adulti. Afaugati pina la 12 copil
 * De la 12 la 18 adolescent, si de la 18 adult*/
public class Exercitiu3Main {
    public static void main(String[] args) {
        String prenume, numeDefamilie;
        int varsta;

        Queue<Cetatean> cetateni = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("introdu info cetateni");
        while (true) {
            System.out.println("introdu prenumele");
            prenume = scanner.nextLine();

            System.out.println("introdu numele de familie");
            numeDefamilie = scanner.nextLine();

            System.out.println("introdu varsta");
            //verificarea la introducerea
            while (!scanner.hasNextInt()) {
                System.out.println("va rugam introduceti un numar");
                scanner.next();//ignoram cod incorect
            }
            varsta = scanner.nextInt();
            scanner.nextLine();//curatirea input buffer

            Cetatean cetatean = new Builder()
                    .prenume(prenume)
                    .numeDefamilie(numeDefamilie)
                    .varsta(varsta)
                    .build();
            cetateni.offer(cetatean);

            if (varsta <= 12) {
                System.out.println("cetateanul " + cetatean + " este copil");
            } else if (varsta <= 18) {
                System.out.println("cetateanul " + cetatean + " este adolescent");
            } else {
                System.out.println("cetateanul " + cetatean + " este adult");
            }
            System.out.println("doriti sa introduceti inca un cetatean? da/nu");
            String raspuns = scanner.nextLine();
            if (raspuns.equalsIgnoreCase("nu")) {
                break;
            }
            System.out.println(cetateni);
        }
        System.out.println("cetatenii introdusi ");
        System.out.println(cetateni);

    }
}
