public class Solus {
    public static void main(String[] args) {
   /*Cours Switch*/
        int month = 2 ;
        if (month == 1) {
            System.out.println("Janvier");
        } else if (month == 2) {
            System.out.println("Février");
        } else if (month == 3) {
            System.out.println("Mars");
        } else {
            System.out.println("No valid");
        }

        switch (month) {
            case 1 :
                System.out.println("Janvier");
            break;
            case 2 :
                System.out.println("Février");
                break;
            case 3 :
                System.out.println("Mars");
                break;
            default:
                System.out.println("No valid");
        }

    }
}
