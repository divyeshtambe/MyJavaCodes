package demoCode;

public class CountLENGTH 
{

	public static void main(String[] args) 
	{
		
		String str = "divyesh";
		
		int i = 0;
		int len = 0;
		
		char a = str.charAt(i);
		
		do
		{
			
			len++;
			i++;
			
		}while(a !=' ');
		
		
		System.out.println(len);
		
		

	}

}
