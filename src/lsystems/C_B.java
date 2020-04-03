package lsystems;

public class C_B extends LRule {

	private final char match = 'C';
	private final char[] body = {'C', 'B'};
	
	
	public char getMatch()
	{
		return match;
	}
	
	public char[] getBody()
	{
		return body;
	}

}
