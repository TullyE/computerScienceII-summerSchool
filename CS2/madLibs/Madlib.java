import java.util.Scanner;
/**
Madlib
This is My Trip To Disney World!
TullyE
06/24/2021
*/

public class Madlib 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a friends's name: ");
      String friendsName1 = input.nextLine();
   
      System.out.println("please enter a number of hours: ");
      int numberHours = input.nextInt();
      input.nextLine();
   
      System.out.println("Please enter a vehicle type: ");
      String vehicleType = input.nextLine();
   
      System.out.println("Please enter an adjective: ");
      String adj1 = input.nextLine();
   
      System.out.println("Please enter an adjective: ");
      String adj2 = input.nextLine();
   
      System.out.println("Please enter an -ing Verb: ");
      String ingVerb1 = input.nextLine();
   
      System.out.println("Please enter an animal: ");
      String animal = input.nextLine();
   
      System.out.println("Pleasae enter an adjective: ");
      String adj3 = input.nextLine();
   
      System.out.println("Please enter a past tense verb");
      String pTVerb1 = input.nextLine();
   
      System.out.println("Please enter an adjective: ");
      String adj4 = input.nextLine();
   
      System.out.println("Please enter a noun: ");
      String noun1 = input.nextLine();
   
      System.out.println("Please enter a past tense verb: ");
      String pTVerb2 = input.nextLine();
   
      System.out.println("Please enter another past tense verb: ");
      String pTVerb3 = input.nextLine();
   
      System.out.println("Please enter a place: ");
      String Place = input.nextLine();
   
      System.out.println("Please enter a verb: ");
      String verb = input.nextLine();
   
      System.out.printf("\n\tLast month, I went to Disney World with %s. We", friendsName1);
      System.out.printf("\ntraveled for %o hours by %s. Finally, we", numberHours, vehicleType.toLowerCase());
      System.out.printf("\narrived and it was very %s. There were", adj1.toLowerCase());
      System.out.printf("\n%s people %s everywhere. There", adj2.toLowerCase(), ingVerb1.toLowerCase());
      System.out.printf("\nwere also people dressed up in %s costumes", animal.toLowerCase());
      System.out.printf("\n\n\tI wish it had been more %s, but we %s", adj3.toLowerCase(), pTVerb1.toLowerCase());
      System.out.printf("\nanyway. We also went on a(n) %s ride", adj4.toLowerCase());
      System.out.printf("\ncalled Magic %s. %s nearly fell off a ride and had to be", noun1.toLowerCase(), friendsName1);
      System.out.printf("\n%s. Later, we went to the hotel and", pTVerb2.toLowerCase());
      System.out.printf("\n%s. Next year, I want to go to %s", pTVerb3.toLowerCase(), Place);
      System.out.printf("\nwhere we can %s.", verb.toLowerCase());
      input.close();
   }    
}
