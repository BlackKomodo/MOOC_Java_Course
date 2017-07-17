import java.util.Random;

public class PassRandomizer 
{
	protected int val;
	protected String temp="";
	protected String pass="";
	protected Random rand;
	protected int length;
	
	public PassRandomizer(int length)
	{
		this.length = length;
		rand = new Random();
	}
	
	public void setLength(int length) { this.length = length; }
	
	public int getLength() { return this.length; }
	
	public String createPass()
	{
		for(int i=0 ; i<this.length ; i++)
		{
			val = rand.nextInt(26);
			temp += "abcdefghijklmnopqrstuvwxyz".charAt(val);
		}
		pass = temp;
		temp = "";
		return pass;
	}
}
