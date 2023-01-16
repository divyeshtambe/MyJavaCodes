package demoCode;

public class Constructordemo
{
	int a;
	
	public Constructordemo()
	{
		System.out.println("divyesh");
		
		a=5;
		
	}

	public static void main(String[] args)
	{
		Constructordemo obj = new Constructordemo();
		
		System.out.println(obj.a);
		
	}

}
