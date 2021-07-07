/**
Social
returns the sum of each section of a given ss# sections are defined as "-"
TullyE
06/24/2021
*/

public class Social{

   public static int getTotal(String socialNumber)
   {
      int num = 0, dashes = 0, start = 0;
      for (int i = 0; i < socialNumber.length(); i ++)
      {
         if ("-".equals(socialNumber.substring(i, i+1)))
         {
            dashes = dashes + 1;
         }
      }
      if (dashes != 2){
         return -1;
      }
      //ONLY THINGS WITH TWO DASHES BELOW HERE
      for (int i = 0; i < socialNumber.length(); i ++)
      {
         if (socialNumber.substring(start, i).contains("-"))
         {
            num  = num + Integer.parseInt(socialNumber.substring(start, i-1));
            start = i;
         }
      }
      return num + Integer.parseInt(socialNumber.substring(start, socialNumber.length()));
   }
   public static void main(String[] args){
      String ss1 = "456-56-234", ss2 = "75-99", ss3 = "1-11-111";
      System.out.printf("\nss# %s has a total of " + Social.getTotal(ss1), ss1);
      System.out.printf("\nss# %s has a total of " + Social.getTotal(ss2), ss2);
      System.out.printf("\nss# %s has a total of " + Social.getTotal(ss3), ss3);
   }
}