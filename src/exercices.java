import java.util.Scanner;

public class exercices {

    public static void main(String[] args) {

        /*Exercices if and else*/

        /* Exercice 1*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Number nul");
        } else if (number % 2 == 0) {
            System.out.println("Number pair");
        } else {
            System.out.println("Number impair");
        }

        /* Exercice 2 */
        System.out.println("Write a number");
        int newNumber = scanner.nextInt();
        if (newNumber >= 0) {
            System.out.println("Number positif");
        } else {
            System.out.println("Number negatif");
        }

        /* Exercice 3 */
        System.out.println("Write a number between 0 and 20");
        int noteNumber = scanner.nextInt();
        if (noteNumber > 20) {
            System.out.println("Wrong number or no valid");
        } else if (noteNumber < 0) {
            System.out.println("Wrong number or no valid");
        } else if (noteNumber >= 16 && noteNumber <= 20) {
            System.out.println("Très bien");
        } else if (noteNumber >= 12 && noteNumber <= 16) {
            System.out.println("Bien");
        } else if (noteNumber >= 10 && noteNumber <= 12) {
            System.out.println("Assez Bien");
        } else {
            System.out.println("Insuffisant");
        }

        /* Exercice 4 */
        System.out.println("Write a first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Write a second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The number one is bigger");
        } else if (firstNumber < secondNumber) {
            System.out.println("The number one is smaller");
        } else {
            System.out.println("The numbers are equal");
        }


        /* Exercies Boucles*/

        /*Exercice 1*/
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        /*Exercice 2*/
        int countdown = 10;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Zéro");

        /* OR */

        for (int i = 10; i > -1; i--) {
            System.out.println(i);
        }

        /*Exercice 3 */
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        /*Exercice 4 */
        int somme = 0;
        for (int i = 1; i <= 100; i++) {
            somme = somme + i;
        }
        System.out.println("La somme est " + somme);
    }



}

