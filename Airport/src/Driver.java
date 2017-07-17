import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Planes planes = new Planes();
		Flights flights = new Flights();
		
		TextUserInterface ui = new TextUserInterface(reader,planes,flights);
		ui.start();
	}

}
