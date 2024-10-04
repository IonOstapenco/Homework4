package homework4.exercitiu1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*scrieti un program care la executare va returna POZITIV, daca numarul stocat
 * in variabila este mai mare decat 0 si NEGATIV, daca numarul este mai mic decat 0
 * Dupa ce faceti acest lucru, dezvoltati codul vostru in asa fel inct sa folositi
 * aici inca o conditie p/u cazul in care in variabila este stocat 0*/
public class Exercitiu1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numar;


        System.out.println("introdu un numar de la tastatura");
        try {
            numar = Integer.parseInt(reader.readLine());
            if (numar > 0) {
                System.out.println("POZITIV");
            } else if (numar < 0) {
                System.out.println("NEGATIV");
            } else {
                System.out.println("este 0");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
