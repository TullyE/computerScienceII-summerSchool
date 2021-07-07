/**
Purse.java
Defines the Purse Class
TullyE
07/01/2021
*/
public class Purse
{
   private int quarters;
   private int dimes;
   private int nickels;

   /**
    * sets the default value to 0 for each of the coins
    */
   public Purse()
   {
      this.quarters = 0;
      this.dimes = 0;
      this.nickels = 0;
   }

   /**
    * when creating an instance of the purse class defines number of quarters, dimes, nickels
    * @param q
    * @param d
    * @param n
    */
   public Purse(int q, int d, int n)
   {
      this.quarters = q;
      this.dimes = d;
      this.nickels = n;
   }

   /**
    * returns the number of quarters
    * @return
    */
   public int getQuarters()
   {
      return this.quarters;
   }

   /**
    * returns the number of dimes
    * @return
    */
   public int getDimes()
   {
      return this.dimes;
   }

   /**
    * returns the number of nickels
    * @return
    */
   public int getNickels()
   {
      return this.nickels;
   }
   
   //mutators
   /**
    * set the number of quarters of an instance after the instance has been created
    * @param n
    */
   public void setQuarters(int n)
   {
      this.quarters = n;
   }

   /**
    * set the number of dimes of an instance after the instance has been created
    * @param n
    */
   public void setDimes(int n)
   {
      this.dimes = n;
   }

   /**
    * set the number of nickels of an instance after the instance has been created
    * @param n
    */
   public void setNickels(int n)
   {
      this.nickels = n;
   }

   //adders or subtractors
   /**
    * add n quarters to the total number of quarters in that instance
    * @param n
    */
   public void addQuarters(int n)
   {
      this.quarters += n;
   }

   /**
    * add n dimes to the total number of quarters in that instance
    * @param n
    */
   public void addDimes(int n)
   {
      this.dimes += n;
   }

   /**
    * add n nickels to the total number of quarters in that instance
    * @param n
    */
   public void addNickels(int n)
   {
      this.nickels += n;
   }

   /**
    * returns the total number of coins
    * @return
    */
   public int getTotal()
   {
      return this.quarters + this.dimes + this.nickels;
   }

   /**
    * returns the total value (cents) of this purse
    * @return
    */
   public int totalValue()
   {
      return (this.quarters*25) + (this.dimes*10) + (this.nickels*5);
   }

   /**
    * when System.out.println(<<PURSE OBJECT>>) prints the number of each coin in a nice format
    */
   public String toString()
   {
      return "Quarters: " + this.quarters + " Dimes: " + this.dimes + " Nickels: " + this.nickels; 
   }

   public static void main(String[] args)
   {
      System.out.println("Test");
   }
}