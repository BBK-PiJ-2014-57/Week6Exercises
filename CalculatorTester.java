public class CalculatorTester{
	public static void main(String[] args)
	{
		Calculator myCalculator = new Calculator();
		System.out.println("Now testing your calculator with all the different operations. Enter two values to be te3sted:");
		int a = 14;
		int b = 8;
		myCalculator.add(a, b);
		myCalculator.subtract(a, b);
		myCalculator.multiply(a, b);
		myCalculator.divide(a, b);
		myCalculator.modulus(a, b);
		System.out.println("Thanks");
	}

}
