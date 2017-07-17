import java.util.HashMap;

public class Planes 
{
	private HashMap<String,Integer> planes;
	
	public Planes() {
		this.planes = new HashMap<String,Integer>();
	}
	
	public void add(String name, int capacity)
	{
		this.planes.put(name, capacity);
	}
	
	public String get(String name)
	{
		return name + " (" + this.planes.get(name) + ")";
	}

	public String toString() 
	{
		String str = "";
		for(String key : this.planes.keySet())
		{
			str += key + " (" + this.planes.get(key) + ")\n";
		}
		return str;
	}
}
