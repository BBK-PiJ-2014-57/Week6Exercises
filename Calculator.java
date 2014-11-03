public class Calculator{
	public int add(int a, int b)
	{
		int answer = (a+b);
		print(answer);
		return (a+b);
	}

	public int subtract(int a, int b)
	{
		int answer = (a-b);
		print(answer);
		return(a-b);
	}

	public int multiply(int a, int b)
	{
		int answer = a*b;
		print(answer);
		return(a*b);
	}

	public double divide(int a, int b)
	{
		double adub = (double)a;
		double bdub = (double)b;
		if(b != 0)
		{
			double answer = (adub / bdub);
			print(answer);
			return (adub / bdub);
		}
		else
		{
			System.out.println("Error: Cannot divide by 0!");
			return 0;
		}
	}

	public double modulus(int a, int b)
	{
		double answer = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
		print(answer);
		return answer;
	}

	private void print(int answer)
	{
		print((double)answer);
	}

	private void print(double answer)
	{
		System.out.println("The answer is:" + answer);
	}

}