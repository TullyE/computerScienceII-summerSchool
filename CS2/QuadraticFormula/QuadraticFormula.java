public class QuadraticFormula
{

   public static void main(String[] args)
   {
      //Initial Values
      double a = 4.0;
      double b = 349.0;
      double c = 7.0;
      //Answers
      double ans1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
      double ans2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
      //Print
      System.out.println("x = "+ ans1 + ", " + ans2);
   }
}