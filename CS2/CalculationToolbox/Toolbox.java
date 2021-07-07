public class Toolbox
{
   public static void main(String[] args)
   {
      int currentDegs = 60;
      double principleBalance = 10000;
      int compoundsPerYear = 12;
      double interestRate = 3.875;
      double investmentLen = 7.5;
      
      double exp = compoundsPerYear*investmentLen;
      double amount = principleBalance*Math.pow(1+((interestRate/100)/compoundsPerYear), exp);
      
      
      //System.out.printf("The temperature outside my apartment is %d degrees Fahrenheit, also known as " + ((CurrentDegs-32)*.5556) + "Celcsius", CurrentDegs);
      System.out.printf("The temperature outside my apartment is %d degrees Fahrenheit, also \nknown as " + ((int) ((currentDegs - 32)*.5556)) + " degrees Celcsius\n\nI invested $%d in a savings account at an annual interest rate of %.3f" , currentDegs, (int)principleBalance, interestRate);
      System.out.print("%");
      System.out.printf(" compounded %d times per year for %.1f years. the total amount in my \nsavings account after %.1f years is $%.2f", compoundsPerYear, investmentLen, investmentLen, amount);
   }
}