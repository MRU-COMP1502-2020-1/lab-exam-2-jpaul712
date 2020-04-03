package lsystems;

public class A_Q extends LRule {

	private final char match = 'A';
	private final char[] body = {'A', 'Q'};
	
	
	public char getMatch()
	{
		return match;
	}
	
	public char[] getBody()
	{
		return body;
	}

}
