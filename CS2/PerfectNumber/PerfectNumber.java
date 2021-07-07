/**
PerfectNumber
Determine if a Number is a perfect number
TullyE
06/27/2021
*/
public class PerfectNumber
{
   public static boolean isPerfect(int n)
   {
      int total = 0;
      for (int i = 1; i < n; i += 1)
      {
         if (n%i == 0)
         {
            total += i;
         }
      }
      return n == total;
   }
   public static void main(String[] args)
   {
      int num1 = 496, num2 = 45, num3 = 6, num4 = 14, num5 = 8128, num6 = 1245, num7 = 33, num8 = 28, num9 = 27, num10 = 33550336;
      if (PerfectNumber.isPerfect(num1))
      {
         System.out.printf("\n %d is perfect.\n", num1);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num1);
      }
      
      if (PerfectNumber.isPerfect(num2))
      {
         System.out.printf("\n %d is perfect.\n", num2);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num2);
      }
      if (PerfectNumber.isPerfect(num3))
      {
         System.out.printf("\n %d is perfect.\n", num3);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num3);
      }
      if (PerfectNumber.isPerfect(num4))
      {
         System.out.printf("\n %d is perfect.\n", num4);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num4);
      }
      if (PerfectNumber.isPerfect(num5))
      {
         System.out.printf("\n %d is perfect.\n", num5);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num5);
      }
      if (PerfectNumber.isPerfect(num6))
      {
         System.out.printf("\n %d is perfect.\n", num6);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num6);
      }
      if (PerfectNumber.isPerfect(num7))
      {
         System.out.printf("\n %d is perfect.\n", num7);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num7);
      }
      if (PerfectNumber.isPerfect(num8))
      {
         System.out.printf("\n %d is perfect.\n", num8);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num8);
      }
      if (PerfectNumber.isPerfect(num9))
      {
         System.out.printf("\n %d is perfect.\n", num9);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num9);
      }
      if (PerfectNumber.isPerfect(num10))
      {
         System.out.printf("\n %d is perfect.\n", num10);
      }
      else{
         System.out.printf("\n %d is not perfect.\n", num10);
      }
   
   }
}