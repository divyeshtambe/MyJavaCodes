package demoCode;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		int sum;
		int a=0;
		int b=1;
		
		System.out.print(a+",");
		System.out.print(b+",");
		
		for(int i=0;i<=10;i++)
		{
			sum = a+b;
			System.out.print(sum+",");
			a=b;
			b=sum;
		
		}
		
	}

}
