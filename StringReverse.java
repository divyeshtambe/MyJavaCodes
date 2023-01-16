package demoCode;
import java.util.*;


public class StringReverse {

	public static void main(String[] args) 
	{
		
		String org = new String("divyesh");
		System.out.println("the reverse string is :");
		char[] arr = org.toCharArray();
		
		for(int i=org.length()-1;i>=0;i--)
		{
			
			System.out.print(arr[i]);
			
		}
		
		
		
	}

}
