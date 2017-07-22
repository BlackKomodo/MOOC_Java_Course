public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }
    
    public boolean equals(Object object)
    {
    	if(object == null) return false;
    	
    	if(this.getClass() != object.getClass()) return false;
    	
    	RegistrationPlate compared = (RegistrationPlate) object;
    	
    	if(this.country != compared.country || this.regCode != compared.regCode) return false;
    	
    	return true;
    }
    
    public int hashCode() 
    {
    	if(this.regCode == null) return 4;
    	
    	return this.country.hashCode() + this.regCode.hashCode();
    }
}