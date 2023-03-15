import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hur gammal är du? ");
       Scanner scanner = new Scanner(System.in);
       int humanAge = scanner.nextInt();
       int doggieAge = humanAge*7;

       System.out.println("Hundålder: " + doggieAge);
    }
}
