import java.util.Scanner;

public class TextUserInterface 
{
	private Scanner reader;
	private Dictionary dictionary;
	
	public TextUserInterface(Scanner reader, Dictionary dictionary)
	{
		this.reader = reader;
		this.dictionary = dictionary;
	}
	
	public void start()
	{
		System.out.println("Statements:\n\tadd - adds a word pair to the dictionary"
				+ "\n\ttranslate - asks a word and prints its translation"
				+ "\n\tquit - quits the text user interface");
		while(true)
		{

			System.out.print("\nStatement : ");
			String input = reader.nextLine();//nécessaire
			if(input.equals("quit"))
			{
				System.out.println("\nCheers !");
				break;
			}
			else if(input.equals("add"))
			{
				System.out.println("Word in finnish : ");
				String word = reader.nextLine();
				System.out.println("Word in english : ");
				String translation = reader.nextLine();
				dictionary.add(word, translation);
			}
			else if(input.equals("translate"))
			{
				System.out.print("Give a word : ");
				String word = reader.nextLine();
				if(dictionary.translate(word)!=null)
				{
					System.out.println("\nTranslation : " + dictionary.translate(word));
				}
				else
				{
					System.out.println("Unknown word");
				}
			}
			else 
			{
				System.out.println("Unknown statement");
			}
			
			
		}
	}
}
