package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ATest {
	
	private A_A a = new A_A();

	@Test
	public void testgetMatch() 
	{
		assertEquals("A", a.getMatch());
		
	}
	
	@Test
	public void testgetBody() 
	{
		assertEquals("A", a.getBody());
		
	}


}
