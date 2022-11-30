package pack2;

public class Demo1
{
	public  int numSpecial1(int[] arr)
	{
		int arrayLength = arr.length;
		int tempNumDigitF = 0;
		int sum_fact=0;
		int count =0;
		for(int i =0; i<arrayLength; i++)
		{
		int tempNum=arr[i];
		while(tempNum>0)
		{
			tempNumDigitF = tempNum%10;
			int fact = 1;
			for (int j=1;j<tempNumDigitF;j++)
			{
				fact=fact*j;
			}
			sum_fact=sum_fact+fact;
			}
		if(tempNum==sum_fact)
		{
			count++;
		}
		}
		return count;
	}

}
