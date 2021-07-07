import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int userNum = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a double (An int with decimals): ");
        double userDub = input.nextDouble();
        input.nextLine();

        System.out.println("Please enter your name: ");
        String userName = input.nextLine();
        input.nextLine();

        System.out.printf("\nThe User int was %d\nThe User dub was %.2f\nThe Username is %s", userNum, userDub, userName);
        input.close();

    }
}