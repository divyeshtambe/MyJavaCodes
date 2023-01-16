package demoCode;

public class trimstring 

{
	//trim without using trimming method
	public static void main(String[] args) 
	{
		String name = "divyeshtambe";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			
			if(name.charAt(i)!=' ')
			{	
				System.out.print(name.charAt(i));	
			}
			else
			{
				//do nothing
			}
			
		}
		
	}

}
