package lsystems;

public class B_A extends LRule {

	
	
	private final char match = 'B';
	private final char[] body = {'B', 'A'};
	
	
	public char getMatch()
	{
		return match;
	}
	
	public char[] getBody()
	{
		return body;
	}
}
