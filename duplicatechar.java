package demoCode;

public class duplicatechar 
{

	public static void main(String[] args)
	{

		String str = new String("sakkett");
		
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(j!=i && str.charAt(i)==str.charAt(j))
					System.out.println("the varialble which is repeating is:"+str.charAt(i));
				else {}
					
			}
		}
		
		

	}

}
