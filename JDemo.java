package demoCode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JDemo extends locators
{

	@Test
	public void Test1()
	{
		String actual = a;
		
		Assertions.assertEquals("divyes", actual);
		
	}
	
	
	
	
	
	
}