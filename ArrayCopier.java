public class ArrayCopier{
	public int[] copy(int[] src, int[] dst)
	{
		int[] result = new int[dst.length];
		if(src.length > dst.length)
		{
			for(int i = 0; i<dst.length; i++)
			{
				result[i] = src[i];
			}
		}
		else if(src.length < dst.length)
		{

			for(int j = 0; j<dst.length; j++)
			{
				result[j] = 0;
			}
		}
		else
		{
			for(int j = 0; j<dst.length; j++)
			{
				result[j] = src[j];
			}
		}
		return result;
	}

}