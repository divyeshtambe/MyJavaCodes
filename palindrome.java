package demoCode;

public class palindrome
{

	public static void main(String[] args) 
	{

		int num = 454;//org number
		
		int quo=num/10;//logic
		int rem=num%10;
		int a=rem;
		int b=quo%10;
		quo=quo/10;
		int c=quo%10;
		
		int fin = ((a*10+b)*10)+c;
		
		
		if (fin==num)//compare
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome...");
		}
			
	}

}
