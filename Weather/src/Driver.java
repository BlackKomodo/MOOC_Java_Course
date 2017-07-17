import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meteo meteo = new Meteo();
		ArrayList<String> jours = new ArrayList<>();
		Collections.addAll(jours, "Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche");
//		System.out.println("Prédiction de la météo de la semaine : ");
		for(String jour : jours)
		{
			String temps = meteo.predireTemps();
			int degree = meteo.predireDegree();
//			System.out.println(jour + ": " + temps + " avec une température de " + degree + " degrés.");
		}
		MyDate date1 = new MyDate(14,3,2014);
		MyDate date2 = new MyDate(14,2,2014);
		System.out.println(date1 + " earlier than " + date2 + " : " + date1.earlier(date2));
	}

}
