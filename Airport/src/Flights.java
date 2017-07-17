import java.util.ArrayList;

public class Flights 
{
	private ArrayList<String> flights;
	
	public Flights() 
	{
		this.flights = new ArrayList<String>();
	}
	
	public void add(String flight) 
	{
		this.flights.add(flight);
	}
	
	public String toString() 
	{
		String str = "";
		for(String flight : flights)
		{
			str += flight + "\n";
		}
		return str;
	}
}