package lsystems;
import java.util.*;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) 
	{
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException 
	{
		ArrayList <Character> a = new ArrayList <Character>();
		
		a.clear();
		for(int i = 0; i < line.length; i++)
		{
			for(LRule c: rules)
			{
				if(c.getMatch() == line[i])
				{
					for(char b: c.getBody())
					{
						if(b == 'Q') throw new LSystemSymbolException(b);
						a.add(b);
						
					}
				}
			}
		}
		
		line = listToArray(a);
	}
	
	
	
	private char[] listToArray(List<Character> list) 
	{
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) 
		{
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() 
	{
		
		return new String(line);
	}
	
}
