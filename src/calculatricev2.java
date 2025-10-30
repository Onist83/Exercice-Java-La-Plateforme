import java.util.Scanner;

public class calculatricev2 {
    public static void main(String[] args) {
        boolean run=true;
        Scanner myscanner = new Scanner(System.in);
        System.out.println("What choice do you want to do?");
        System.out.println("Choice 1: Addition");
        System.out.println("Choice 2: Soustraction");
        System.out.println("Choice 3: Multiplication");
        System.out.println("Choice 4: Division");
        System.out.println("Choice 5: Exit");

        int choice = myscanner.nextInt();
        double firstNumber;
        double secondNumber;

        while (run) {
            switch (choice) {
                case 1 :
                    System.out.println("Addition");
                    System.out.println("Write your first number");
                    firstNumber = myscanner.nextInt();
                    System.out.println("Write your second number");
                    secondNumber = myscanner.nextInt();
                    System.out.println("Your result is :  " + (firstNumber + secondNumber));

                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Addition");
                    System.out.println("Choice 2: Soustraction");
                    System.out.println("Choice 3: Multiplication");
                    System.out.println("Choice 4: Division");
                    System.out.println("Choice 5: Exit");
                    choice = myscanner.nextInt();

                    break;


                case 2 :
                    System.out.println("Soustraction");
                    System.out.println("Write your first number");
                    firstNumber = myscanner.nextInt();
                    System.out.println("Write your second number");
                    secondNumber = myscanner.nextInt();
                    System.out.println("Your result is :  " + (firstNumber - secondNumber));

                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Addition");
                    System.out.println("Choice 2: Soustraction");
                    System.out.println("Choice 3: Multiplication");
                    System.out.println("Choice 4: Division");
                    System.out.println("Choice 5: Exit");
                    choice = myscanner.nextInt();

                    break;


                case 3 :
                    System.out.println("Multiplication");
                    System.out.println("Write your first number");
                    firstNumber = myscanner.nextInt();
                    System.out.println("Write your second number");
                    secondNumber = myscanner.nextInt();
                    System.out.println("Your result is :  " + (firstNumber * secondNumber));

                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Addition");
                    System.out.println("Choice 2: Soustraction");
                    System.out.println("Choice 3: Multiplication");
                    System.out.println("Choice 4: Division");
                    System.out.println("Choice 5: Exit");
                    choice = myscanner.nextInt();

                        break;


                case 4 :
                    System.out.println("Division");
                    System.out.println("Write your first number");
                    firstNumber = myscanner.nextInt();
                    System.out.println("Write your second number");
                    secondNumber = myscanner.nextInt();
                    System.out.println("Your result is :  " + (firstNumber / secondNumber));

                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Addition");
                    System.out.println("Choice 2: Soustraction");
                    System.out.println("Choice 3: Multiplication");
                    System.out.println("Choice 4: Division");
                    System.out.println("Choice 5: Exit");
                    choice = myscanner.nextInt();

                    break;


                case 5 :
                    System.out.println("Exit");
                    run = false;
                    break;


                default:
                    System.out.println("No Valid select between 1 and 5");
                    System.out.println("What choice do you want to do?");
                    System.out.println("Choice 1: Addition");
                    System.out.println("Choice 2: Soustraction");
                    System.out.println("Choice 3: Multiplication");
                    System.out.println("Choice 4: Division");
                    System.out.println("Choice 5: Exit");
                    choice = myscanner.nextInt();
            }
        }
        myscanner.close();
    }
}


