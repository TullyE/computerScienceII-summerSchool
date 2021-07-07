/**
LoopFileProblems
Read files and return some information about them
TullyE
6/28/2021
*/
import java.util.*;
import java.io.*;

public class LoopFileProblems
{
   /**
    * determin the total number of call minutes
    * @param file
    * @return Integer (Minutes)
    */
   public static int callMinutes(String file)
   {
      try
      {
         Scanner input = new Scanner(new File(file));
         int numLines = input.nextInt(), minutesOnCall = 0;
         input.nextLine();
      
         for(int i = 0; i < numLines; i += 1)
         {
            String currLine = input.nextLine();
            Scanner wordScanner = new Scanner(currLine);
            int callnum = 0, callLen1 = 0, callLen2;
            while(wordScanner.hasNext())
            {
               String currentWord = wordScanner.next();
               for(int k = 0; k < currentWord.length(); k ++)
               {
                  if (":".equals(currentWord.substring(k, k+1)))
                  {   
                     if (callnum == 0)
                     {
                        callLen1 = (Integer.parseInt(currentWord.substring(0, k)) * 60) + Integer.parseInt(currentWord.substring(k+1, currentWord.length()));
                     }
                     else
                     {
                        callLen2 = (Integer.parseInt(currentWord.substring(0, k)) * 60) + Integer.parseInt(currentWord.substring(k+1, currentWord.length()));
                        minutesOnCall += (callLen2-callLen1);
                     }
                     callnum += 1;
                  }    
               }
            }
            wordScanner.close();
         }
         return minutesOnCall;
      }
      catch(IOException e)
      {

      }
      return 1;
   }
   /**
    * add all the largest number on a line from a .dat file
    * @param file
    * @return Integer (Sum)
    */
   public static int sumLargest(String file)
   {
      int total = 0;
      try
      {
         Scanner input = new Scanner(new File(file));
         int numLines = input.nextInt();
         input.nextLine();
      
         for(int i = 0; i < numLines; i += 1)
         {
            int biggestNumOnLine = 0;
            String currLine = input.nextLine();
            Scanner wordScanner = new Scanner(currLine);
            while(wordScanner.hasNext())
            {
               String currentWord = wordScanner.next();
               if (biggestNumOnLine < Integer.parseInt(currentWord))
               {
                  biggestNumOnLine = Integer.parseInt(currentWord);
               }
            }
            total += biggestNumOnLine;
            wordScanner.close();
         }
      }
      catch(IOException e)
      {

      }
      return total;
   }
   
   public static void main(String[] args)
   {
      System.out.println(callMinutes("CellPhone.dat"));
      System.out.println(sumLargest("line.dat"));
   }
}