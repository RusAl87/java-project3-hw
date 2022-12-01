import java.util.Scanner;

public class Main {




    static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {
        char s;
        char s1;
           System.out.println("Vvedite 3nachenie tipa char: ");
           s = scanner.next().charAt(0);
           s1 = scanner.next().charAt(1);
           System.out.println("Vi vvleli: " + s);
           System.out.println("Vi vvleli: " + s1);

           String number1 = " ";
           System.out.println("Vvedite stroku: ");
           number1 = scanner.next();
           System.out.println("Stroka: " + number1);



        System.out.println();

        System.out.println(sum());

    }


    static void printInt(){
        System.out.println("Vvedite 3nachenie: ");
        int run = scanner.nextInt();
        System.out.println("Vi vvleli: " + run);
    }
    public static int sum() {
        System.out.println("Vvedite pervoe chislo: ");
        int run = scanner.nextInt();

        System.out.println("Vvedite vtoroe chislo: ");
        int rob = scanner.nextInt();
        return run + rob;
    }


}