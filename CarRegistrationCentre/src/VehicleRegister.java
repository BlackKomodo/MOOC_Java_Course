import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
	
	private HashMap<RegistrationPlate,String> reg;
	
	public VehicleRegister()
	{
		this.reg = new HashMap<RegistrationPlate,String>();
	}
	
	public boolean add(RegistrationPlate plate, String owner)
	{
		if(this.reg.containsKey(plate)) return false;
		else
		{
			this.reg.put(plate, owner);
			return true;
		}
	}
	
	public String get(RegistrationPlate plate)
	{
		if(this.reg.containsKey(plate)) return this.reg.get(plate);
		else return null;
	}
	
	public boolean delete(RegistrationPlate plate)
	{
		if(this.reg.containsKey(plate)) return false;
		else
		{
			this.reg.remove(plate);
			return true;
		}
	}
	
	public void printRegistrationPlates()
	{
		for(RegistrationPlate plate : this.reg.keySet())
		{
			System.out.println(plate);
		}
	}
	
	public void printOwners() 
	{
//		ArrayList<String> owners = new ArrayList<String>();
		String str = "";
		for(RegistrationPlate plate : this.reg.keySet())
		{
			System.out.println(this.reg.get(plate));
		
		}
	}
	
	
}
