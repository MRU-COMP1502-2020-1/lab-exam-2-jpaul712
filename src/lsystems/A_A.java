package lsystems;

public class A_A extends LRule{
	
	private final char match = 'A';
	private final char[] body = {'A'};
	
	public A_A()
	{
		
	}
	
	public char getMatch()
	{
		return match;
	}
	
	public char[] getBody()
	{
		return body;
	}

}
