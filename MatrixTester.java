class MatrixTester{
	public static void main(String[] args)
	{
		Matrix toTest = new Matrix(4, 4);
		System.out.println("Now setting the matrix to all 4s in row 1.");
		toTest.setRow(1, "4,4,4,4");
		toTest.prettyPrint();
		System.out.println("Now setting the matrix to all 3s in column 2.");
		toTest.setColumn(2, "3,3,3,3");
		toTest.prettyPrint();
		String totestprint = toTest.toString();
		System.out.println(totestprint);
		System.out.println("Now creating a new matrix with a string, 1,2,3,4,5;1,2,3,4,5;5,3,2,1");
		Matrix newone = setMAtrix("1,2,3,4,5;1,2,3,4,5;5,3,2,1");
		setMAtrix.prettyPrint();

	}
}

