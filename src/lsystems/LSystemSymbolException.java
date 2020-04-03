package lsystems;

public class LSystemSymbolException extends Exception {

	char b;
	public LSystemSymbolException(char b)
	{
		this.b = b;
	}
	
	public char getSymbol()
	{
		return b;
	}

}
