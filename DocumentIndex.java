import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {

	
	public void addWord(String word, int num)
	{
	
		IndexEntry entry = get(foundOrInserted(word));
		entry.add(num);
		
	}
	
	
	public void addAllWord(String str, int num)
	{
		String[] words = str.split("\\W+");
		for (String word : words)
			{
				if (word.length() > 0)
				{
				addWord(word, num);
				}
			}
	}
	
	private int foundOrInserted(String word){
		
		int i;
		
	for (i =0; i<this.size(); i++)
	{
		int comp = word.compareToIgnoreCase(get(i).getWord());
		if (comp==0)
		{
			return i;
		}
		else if (comp < 0)		//compare
		{
		break;	
		}
		
	}
	
	add (i, new IndexEntry(word));
	return i;
	
	}
	
	
}