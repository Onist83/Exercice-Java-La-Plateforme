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

        //If else age verification
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Age: " + age + "years");
        if (age % 2 == 0) {
            System.out.println("You're age pair");
        } else {
            System.out.println("You're age impair");
        }
        myscanner.close();
    }

    /*If else age verification leçon 1

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you");

    int age = input.nextInt()
    if (18 > age) {
        System.out.println("You're not 18 go away");
    }   else {
        System.out.println("You can enter");
    }
    */

    /*Leçon 2
    Scanner input = new Scanner(System.in);
    int age = input.nextInt();
     if(age == 25) {
     System.out.println("You 're 25")
     } else {
     System.out.println("You 're not 25")
     }

     == two values are equal return true
     != two values are not equal return true
     System.out.println(1 == 1);  True
     System.out.println(1 != 1);  False
     System.out.println(2 != 1);  True
     System.out.println(1 > 5);  False
     System.out.println(2 < 5);  True
     System.out.println(1!=1);  False
     System.out.println(18 <= 18); True Si plus petit ou égal
     System.out.println(15 >= 18); False Si plus grand ou égal
    */

    /*  + addition
        System.out.println(1 + 2); //3

        - soustraction
        System.out.println(5 - 2); //3

        * multiplication
        System.out.println(5 * 2); //10

        / Division
        System.out.println(10 / 5); //2

        % Modulo
        System.out.println(10 % 2); //0 True
        System.out.println(10 % 3); //1 il reste un valeur donc cest faux

        () Parentheses
        System.out.println((5*2)+2); //12
     */
}
