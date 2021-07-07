/**
Distance
Do some Distance formulas
TullyE
06/23/2021
*/
public class Distance
{
   public static double euclidean(int x1, int y1, int x2, int y2)
   {
      //Euclidian = (x1-x2)2+(y1-y2)2
      return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
   }

   public static double taxiCab(int x1, int y1, int x2, int y2)
   
   {
      //Taxi Cab = |x1-x2| + |y1-y2|
   
      return Math.abs(x1-x2) + Math.abs(y1-y2);
   }

   public static void main(String[] args)
   {
      int x1 = 1, y1 = 1, x2 = 4, y2 = 4;
      System.out.printf("\nPoint 1: (%d, %d)\nPoint 2: (%d, %d)\nEucidean Distance: %.2f\nTaxi Cab Distance: %.2f", x1, y1, x2, y2, euclidean(x1, y1, x2, y2), taxiCab(x1, y1, x2, y2));
   }
}
