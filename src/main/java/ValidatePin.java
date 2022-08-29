import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {

        int pin=3919;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter 4 digit pin :  ");
        int num = console.nextInt();

        while(num!=pin){

            System.out.print("Incorrect Pin. Try Again :  ");
            num = console.nextInt();

        }

        System.out.println("Correct Pin");

        console.close();
    }
}
