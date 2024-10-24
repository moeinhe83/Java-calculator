import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Defaule Value
        int a = 0;
        int b = 0;
        String option = "Null";

        // Scanner
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Intro
        System.out.println(" *** Welcome To Moein Calculator *** ");
        System.out.println("=====================================");

        // Input Value For Number 1
        try{
            System.out.println("Please Enter Number 1 => ");
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error ! Please Try Again");
        }
        // Input Value For Number 2
        try{
            System.out.println("Please Enter Number 2 => ");
            b= scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error ! Please Try Again");
        }

        // Input Value For Option
        System.out.println("Please Enter Your Option [+ ,  - , * , /]=> ");
        scanner.nextLine();
        option = scanner.nextLine();

        // IF For Option
        if (option.equals("+")) {
            int op = a + b;
            System.out.println("Result => " + op);
        }
        if (option.equals("-")) {
            int op = a - b;
            System.out.println("Result => " + op);
        }
        if (option.equals("*")) {
            int op = a * b;
            System.out.println("Result => " + op);
        }
        if (option.equals("/")) {
            int op = a / b;
            System.out.println("Result => " + op);
        }
    }
}