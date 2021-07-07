/**
PurseTester
Test the Purse Class from Purse.java
TullyE
07/01/2021
*/

public class PurseTester
{
   /**
    * find the purse with the most number of coins in it
    * @param purseList
    * @return
    */
   public static int mostCoins(Purse[] purseList)
   {
      int mostCoins = 0;
      for (Purse purse : purseList)
      {
         if (purse.getTotal() > mostCoins)
         {
            mostCoins = purse.getTotal();
         }
      }
      return mostCoins;
   }
   /**
    * get the highest value purse
    * @param purseList
    * @return
    */
   public static int mostTotalValue(Purse[] purseList)
   {
      int highestValue = 0;
      for(Purse purse : purseList)
      {
         if (purse.totalValue() > highestValue)
         {
            highestValue = purse.totalValue();
         }
      }
      return highestValue;
   }
   /**
    * Get the number of Quarters from the purse with the most quarters
    * @param purseList
    * @return
    */
   public static int mostQuarters(Purse[] purseList)
   {
      int mostQ = 0;
      for (Purse purse : purseList)
      {
         if (purse.getQuarters() > mostQ)
         {
            mostQ = purse.getQuarters();
         }
      }
      return mostQ;
   }
   /**
    * Get the total number of coins from all the purses
    * @param purseList
    * @return
    */
   public static int totalCoins(Purse[] purseList)
   {
      int totalCoins = 0;
      for (Purse purse : purseList)
      {
         totalCoins += purse.getTotal();
      }
      return totalCoins;
   }
   /**
    * get the total value (cents) from all the purses
    * @param purseList
    * @return
    */
   public static int totalValue(Purse[] purseList)
   {
      int totalVal = 0;
      for(Purse purse : purseList)
      {
         totalVal += purse.totalValue();
      }
      return totalVal;
   }
   public static void main(String[] args)
   {
      Purse purseOne = new Purse(15, 34, 4);
      Purse purseTwo = new Purse(56, 95, 2);
      Purse purseThree = new Purse(10, 2, 39);
      Purse purseFour = new Purse(15, 14, 2);
   
      purseOne.addQuarters(5);
      purseOne.addDimes(15);
      purseOne.addNickels(8);
   
      purseTwo.addQuarters(4);
      purseTwo.addDimes(20);
      purseTwo.addNickels(10);
   
      System.out.println(purseOne);
      System.out.println(purseTwo);
      System.out.println(purseThree);
      System.out.println(purseFour);
      
      Purse[] purseList = new Purse[]{purseOne, purseTwo, purseThree, purseFour};
      System.out.println(mostCoins(purseList));
      System.out.println(mostTotalValue(purseList));
      System.out.println(mostQuarters(purseList));
      System.out.println(totalCoins(purseList));
      System.out.println(totalValue(purseList));
   
   }   
}
