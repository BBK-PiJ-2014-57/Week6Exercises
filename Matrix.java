public class Matrix{

	private int[][] matrix;

	public Matrix(int m, int n)
	{
		this.matrix = new int[m][n];
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				this.matrix[i][j] = 1;
			}
		}

	}

	public void setElement(int a, int b, int c)
	{
		this.matrix[a][b] = c;
	}

	public void setRow(int a, String b)
	{
		int stringcount = 0;
		for(int d = 0; d< b.length(); d++)
		{
			if(!(b.charAt(d)==','))
			{
				stringcount++;
			}
		}
		if(stringcount == this.matrix.length)
		{
			String[] splitstring = b.split(",");
			for(int i = 0; i<this.matrix.length; i++)
			{
				this.matrix[a][i] = Integer.parseInt(splitstring[i]);
			}
		}
	}

	public void setColumn(int a, String b)
	{
		int stringcount = 0;
		for(int d = 0; d< b.length(); d++)
		{
			if(!(b.charAt(d)==','))
			{
				stringcount++;
			}
		}
		if(stringcount == this.matrix.length)
		{
			String[] splitstring = b.split(",");
			for(int i = 0; i<this.matrix.length; i++)
			{
				this.matrix[i][a] = Integer.parseInt(splitstring[i]);
			}
		}
	}

	public String toString()
	{
		String output = "";
		int length = this.matrix.length;
		int width = this.matrix[0].length;
		for(int i = 0; i<length; i++)
		{
			for(int j = 0; j<width; j++)
			{
				output = output + this.matrix[i][j] + ",";
			}
			output = output + ";";
		}
		return output;
	}

	public void prettyPrint()
	{
		int m = this.matrix.length;
		int n = this.matrix[0].length;
		for(int i = 0; i<m; i++)
		{
				for(int j = 0; j<n; j++)
				{
						System.out.print(this.matrix[i][j] + " ");
				}
				System.out.println();
		}
	}

	public Matrix(String a)
	{
			String[] rows = a.split(";");
			int m = rows.length;
			String[] values = rows[0].split(",");
			int n = values.length;
			Matrix newMatrix = new Matrix(m, n);
			int idx = 0;
			for(int i = 0; i<m; i++)
			{
				for(int j = 0; j<n; j++)
				{
					if(a.charAt(idx) != ';' || a.charAt(idx) != ',')
					{
						newMatrix[i][j] = Integer.parseInt(a.charAt(idx));
					}
					idx++;
				}
			}
	}





}