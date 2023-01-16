package demoCode;

public class largestnum 
{

	public static void main(String[] args)
	{
		int largest=0;
		int[] arr = {1,2,5,4,3};
		
		for(int i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				if(arr[i]>arr[j])
				{
					largest = arr[i];
				}
				else
				{
					
				}
				
			}
			
			
		}
		
		System.out.println(largest);

	}

}
