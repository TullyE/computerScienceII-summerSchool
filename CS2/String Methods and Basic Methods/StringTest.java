public class StringTest
{

	public static void drawBox(){
		System.out.print("\n**********");
		System.out.print("\n**********");
		System.out.print("\n**********");
		System.out.print("\n**********\n");
	}

	public static void showTotalAmount(double checkAmt, double tipAmt){
		System.out.println("Total Amount: $" + checkAmt * (1 + tipAmt / 100));
	}
	
	// print vs return is very similar to python
	
	public static double getTotalAmt(double checkAmt, double tipAmt){
		double totalAmt = checkAmt * (1 + tipAmt / 100);
		return totalAmt;
	}

	public static int returnRantdomInteger(){
		return 42;
	}

	public static String returnModifiedName(String someName){
		return "!" + someName + "!";
	}

	
	public static void main(String[] args)
	{
		double dinnerAmount1 = 100.00, tipPercentage1 = 20.0, dinnerAmount2 = 75, tipPercentage2 = 15;

		double Totalamount1 = getTotalAmt(dinnerAmount1, tipPercentage1);
		double TotalAmount2 = getTotalAmt(dinnerAmount2, tipPercentage2);
		System.out.println("$" + Totalamount1);
		System.out.println("$" + TotalAmount2);

		int returnRantdomInteger = returnRantdomInteger();
		String myNewString = returnModifiedName("Tully");
		System.out.println(returnRantdomInteger);
		System.out.println(myNewString);


		//StringTest.showTotalAmount(dinnerAmount1, tipPercentage1);

		//StringTest.showTotalAmount(dinnerAmount2, tipPercentage2);

      	//StringTest.drawBox();
		//drawBox();
	}
}