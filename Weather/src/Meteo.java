import java.util.Random;

public class Meteo 
{
	protected Random random;
	
	public Meteo()
	{
		random = new Random();
	}
	
	public Random getRandom() {
		return random;
	}
	
	public void setRandom(Random random) {
		this.random = random;
	}

	public String predireTemps()
	{
		double proba = random.nextDouble();
		if(proba <= 0.1) return "Neige";
		else if(proba <=0.4) return "Pluie";
		else return "Soleil";
	}
	
	public int predireDegree()
	{
		return (int) (4 * random.nextGaussian() - 3);
	}
}
