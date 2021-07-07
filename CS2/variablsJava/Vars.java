public class Vars
{
	public static void main(String[] args)
	{
      int myFavoriteInteger = 42;
      double PI = 3.141592;
      String myName = "TullyE";
      boolean myBool = true;
      char myFirstLetter = 'T';
      
      System.out.printf("My initial is %c and %s", myFirstLetter, myName);
      
      // + - / * %
      //Java follows the order of operations
      
      int squared = myFavoriteInteger * myFavoriteInteger;
      double res1 = ((PI*2) - (4.11 + 100.06)) % 2;
      System.out.println("\n" + res1);
      
      double res2 = 50.0/3; //16.667
      System.out.println(res2);
      //Integer division
      //if we take an integer and we divide it by another integer
      //we get another integer
      //if there usually would be a decimal, java simply removes it
      
      //Quick fix:
      //       Make one of the numbers a double by adding a .0
      System.out.println(1+ 2 + "Tully" + 42 + 6); // 3Tully426
      System.out.println(1+ 2 + "Tully" + (42 + 6)); //3Tully48
	}
}