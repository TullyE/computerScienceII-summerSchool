public class Fib
{
   public static void firstFibNumFor(int n)
   {
      System.out.printf("\nFIB NUMS UNTIL %d\n0\n1\n1\n", n);
      int fibVal1 = 1, fibVal2 = 1, placeHolder = 0;
      if (n == 0 || n == 1)
      {
         System.out.println(1);
         return;
      }
      
      for (int i = 0; i <= n; i += 1)
      {
         System.out.println(fibVal1 + fibVal2);
         placeHolder = fibVal1;
         fibVal1 = fibVal1 + fibVal2;
         fibVal2 = placeHolder;
      
      }
   }

   public static void firstFibNumWhile(int n)
   {
      System.out.printf("\nFIB NUMS UNTIL %d\n0\n1\n1\n", n);
      int fibVal1 = 1, fibVal2 = 1, placeHolder = 0;
      if (n == 0 || n == 1)
      {
         System.out.println(1);
         return;
      }
      
      int i = 0;
      while (i <= n)
      {
         System.out.println(fibVal1 + fibVal2);
         placeHolder = fibVal1;
         fibVal1 = fibVal1 + fibVal2;
         fibVal2 = placeHolder;
         i += 1;
      }
   }

   public static void firstPrimes(int n)
   {
      System.out.printf("\nPrime Numbers until %d\n", n);
      for (int i = 0; i <= n; i += 1)
      {
         for (int num = 2; num <= i-1; num += 1)
         {
            if (i % num == 0)
            {
               break;
            }
            if (num == i-1)
            {
               System.out.println(i);
            }
         }
      }
   }


   public static void main(String[] args)
   {
   
      Fib.firstFibNumFor(3);
      Fib.firstFibNumWhile(4);
      Fib.firstPrimes(15);
   }
}