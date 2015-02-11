import java.util.ArrayList;


public class IndexEntry {
	
	private String word;
	private ArrayList<Integer> numList;
	
	
	public IndexEntry(String word)
	{
		word = word.toUpperCase();
	}
	
	
	public void add(int num)
	{
		Integer x = new Integer (num);
		if (!numList.contains(x))
			numList.add(x);
	}
	
	public String getWord()
	{
		
		return word;
	}
	
	public String toString()
	{
		String formatnumList = " ";
		
		for (int i = 0; i<numList.size(); i++)
		{
			formatnumList += numList.get(i) + ", ";
		}
			
		return word + formatnumList;
	}
	
	

}
