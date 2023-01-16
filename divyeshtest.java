package demoCode;

public class divyeshtest 
{
	int salary;
	int age ;
	static String ceo;
	
	
	
	
	public static void main(String[] args)
	{
		
		divyeshtest obj = new divyeshtest();
		
		obj.abc(0);
		
	}
	
	public void abc(int a)
	{
		
		divyeshtest emp1 = new divyeshtest();
		emp1.age = 25;
		emp1.salary = 50000;
	
		
		divyeshtest emp2 = new divyeshtest();
		emp2.age = 26;
		emp2.salary = 60000;
		emp2.ceo = "purvi";
		
		emp1.show();
		emp2.show();
		
	}

	public void show()
	{
		System.out.println(salary+":"+age+":"+ceo);
	}
}
