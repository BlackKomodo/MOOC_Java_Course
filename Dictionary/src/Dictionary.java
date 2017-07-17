import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary 
{
	private HashMap<String,String> dictionary;

	public HashMap<String, String> getDictionary() {
		return dictionary;
	}

	public void setDictionary(HashMap<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	public Dictionary() {
		this.dictionary = new HashMap<String, String>();
	}

	public String translate(String word)
	{
		if(dictionary.containsKey(word))
		{
			return dictionary.get(word);
		}
		else
		{
			return null;
		}
	}
	
	public void add(String word, String translation)
	{
		dictionary.put(word, translation);
	}
	
	public int amountOfWords()
	{
		return dictionary.size();
	}
	
//	public ArrayList<String> translationList()
//	{
//		ArrayList<String> list = new ArrayList<String>();
//		for(String key : dictionary.keySet())
//		{
//			list.add(key + " = " + dictionary.get(key));
//		}
//		return list;
//	}
	
}
