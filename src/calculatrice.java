import java.util.Scanner;

/* Cours Opérateur d'assignation

    int x = 1
    x *= 2; // Revient à x = x * 2
    System.out.println(x *=2);

    x += 2; // Revient à x = x + 2
    x -= 2; // Revient à x = x - 2
    x /= 2; // Revient à x = x / 2

    x++; // x = x + 1; // x += 1;
    x--; // x = x - 1; // x -= 1;

Opérateur logique

boolean vrai = true;
boolean faux = flase;
System.out.println(vrai && faux); // AND/ et && il faut que les deux conditions soit vrais
System.out.println(vrai || faux); // OR/ ou || il faut qu' une des conditions soit vrais
System.out.println(!faux); // NOT/ inverse ! donne la valeur contraire de condition boolean


Condition else if
int age = 19 // exemple
    if (age >= 1 && age <= 18) {
        System.out.println("You're young");
    } else if (age >= 18 && age <= 65) {
        System.out.println("You're an adult");  // s'arrete à cette ligne si 65ans
    } else if (age >= 65 && age <= 110) {
        System.out.println("You're an old"); {
    } else {
        System.out.println("Wrong number or no valid");
        }

*/




public class calculatrice {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("What operation do you want to do?");
        System.out.println("Choice 1: Addition");
        System.out.println("Choice 2: Soustraction");
        System.out.println("Choice 3: Division");
        System.out.println("Choice 4: Multiplication");

    char addition = 1;
        char soustraction = 2;
        char division = 3;
        char multiplication = 4;
        int choice = myscanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.println("Choice valid");
        }   else {
            System.out.println("Wrong number or no valid");
        }


        if (addition == choice){
                System.out.println("Write your first number");
                int firstNumber = myscanner.nextInt();
                System.out.println("Write your second number");
                int secondNumber = myscanner.nextInt();
                System.out.println("Your result is :  " + (firstNumber + secondNumber));
            }

        else if (soustraction == choice ){
            System.out.println("Write your first number");
            int firstNumber = myscanner.nextInt();
            System.out.println("Write your second number");
            int secondNumber = myscanner.nextInt();
            System.out.println("Your result is :  " + (firstNumber - secondNumber));
            }

        else if (division == choice ){
            System.out.println("Write your first number");
            int firstNumber = myscanner.nextInt();
            System.out.println("Write your second number");
            int secondNumber = myscanner.nextInt();
            System.out.println("Your result is :  " + (firstNumber / secondNumber));
            }

        else if (multiplication == choice ){
            System.out.println("Write your first number");
            int firstNumber = myscanner.nextInt();
            System.out.println("Write your second number");
            int secondNumber = myscanner.nextInt();
            System.out.println("Your result is :  " + (firstNumber * secondNumber));
            }


        myscanner.close();
    }
}
