/**
Report
Do some calculations on temperature
TullyE
06/29/2021
*/

import java.util.Scanner;
public class Report
{
   /**
    * Ask for Temperatures and print some statistics
    */
   public static void showTempReport() 
   {
      int[] temps = new int[7];
      int daynum = 0, evenNum = 0, intHottestDay = 0, above70 = 0, tempDifference = 0, tempDifferenceDay = 1;
      double totalTemp = 0;
      String strHottestDay = "none";
      String[] daysOfTheWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
      for(String day : daysOfTheWeek)
      {
         Scanner input = new Scanner(System.in);
         System.out.printf("Please enter day %s's temperature: ", day);
         temps[daynum] = input.nextInt();
         daynum += 1;
      }
      for(int i = 0; i < 7; i += 1)
      {
         totalTemp += temps[i];
         if (temps[i]% 2 == 0)
         {
            evenNum += 1;
         }
         if (temps[i] > intHottestDay)
         {
            strHottestDay = daysOfTheWeek[i];
            intHottestDay = temps[i];
         }
         if (temps[i] > 70)
         {
            above70 += 1;
         }
         if (i > 0)
         {
            if (Math.abs(temps[i]-temps[i-1]) > tempDifference)
            {
               tempDifference = Math.abs(temps[i]-temps[i-1]);
               tempDifferenceDay = i;
            }
         }
      }
      System.out.printf("\n BEGIN OUTPUT\nAverage temperature: %.2f", totalTemp/7);
      System.out.printf("\nNumber of even Temperatures: %d", evenNum);
      System.out.printf("\nHighest temerature on: %s", strHottestDay);
      System.out.printf("\nDays with temperatures above 70: %d", above70);
      System.out.print("\nGreatest temperature change happened between: " + daysOfTheWeek[tempDifferenceDay-1] + " and " + daysOfTheWeek[tempDifferenceDay]);
   }
   public static void main(String[] args)
   {
      Report.showTempReport();
   }
}