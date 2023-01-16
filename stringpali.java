package demoCode;

public class stringpali 
{

	public static void main(String[] args) 
	{

		String org = new String("mom");
		String revstr = new String("");
		for(int i=org.length()-1;i>=0;i--)
		{
			
			revstr = revstr + org.charAt(i);
		
		}
		
		System.out.println(revstr);
		
		if(revstr.equals(org))
		{
			System.out.println("palindrome...");
		}
		else
		{
			System.out.println("not pali...");
		}
		
	}

}
