import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int number = 10;

        /* ctrl+clique gauche sur Scanner permet de
        voir toutes ses caractérisque possible
         */
        Scanner myscanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String nom = myscanner.nextLine();
        System.out.println("Hello " + nom + " and welcome");


        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Age: " +age+ "years");
        myscanner.close();
    }
}
