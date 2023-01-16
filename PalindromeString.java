package demoCode;

import java.util.Scanner;

public class PalindromeString
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string = ");
		String str = sc.nextLine();
		String revString = "";
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			
			revString = revString + str.charAt(i);
			
			
		}
		if(revString.equalsIgnoreCase(str))
		{
			System.out.println("palindrome...");
		}
		else
		{
			System.out.println("not a palindrome...");
		}
	
	
	}
	
	
		
}


