class ArrayTester{
	public static void main(String[] args)
	{
		System.out.println("Now testing the copier program");
		int[] output = new int[6];
		int[] fst;
		for(int i = 5; i<8; i++)
		{
			System.out.println(i);
			fst = new int[i];
			for(int j = 0; j<i; j++)
			{
				fst[j] = j;
			}
			ArrayCopier copier = new ArrayCopier();
			output = copier.copy(fst, output);
			for(int k = 0; k<output.length; k++)
			{
				System.out.print(output[k]);
			}
			System.out.println();
		}
	}
}