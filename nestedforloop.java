package demoCode;

public class nestedforloop 
{

	public static void main(String[] args)
	{
		
		for(int i=0;i<4;i++)
		{
			System.out.println("outer loop starts");
			for(int j=0;j<4;j++)
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}

	}

}


