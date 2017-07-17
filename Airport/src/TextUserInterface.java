import java.util.Scanner;

public class TextUserInterface 
{
	private Scanner reader;
	private Planes planes;
	private Flights flights;
	
	public TextUserInterface(Scanner reader, Planes planes, Flights flights)
	{
		this.reader = reader;
		this.planes = planes;
		this.flights = flights;
	}
	
	public void start()
	{
		System.out.println("Airport Panel\n--------------\n");
		
		mainLoop:
		while(true)
		{
			System.out.println("\nChoose operation:\n  [1] Add airplaine\n  "
					+ "[2] Add flight\n  [x] Exit\n>");
			
			String input = reader.nextLine();
			
			if(input.equals("1"))
			{
				System.out.println("Give plane ID :");
				String planeID = this.reader.nextLine();
				System.out.println("Give plane capacity : ");
				int capacity = this.reader.nextInt();
				this.planes.add(planeID, capacity);
				this.reader.nextLine();
			}
			
			if(input.equals("2"))
			{
				System.out.println("Give plane ID : ");
				String planeID = this.reader.nextLine();
				System.out.println("Give departure airport code : ");
				String departureCode = this.reader.nextLine();
				System.out.println("Give destination airport code : ");
				String destinationCode = this.reader.nextLine();
				String flightCode = planes.get(planeID) + " (" + departureCode + "-" + destinationCode + ")";
				this.flights.add(flightCode);
			}
			
			if(input.equals("x"))
			{
				System.out.println("Flight service\n------------\n");
				
				while(true)
				{
					System.out.println("\nChoose operation:\n  [1] Print planes\n  "
							+ "[2] Print flights\n  [3] Print plane info\n  [x] Quit\n>");
					
					String input2 = reader.nextLine();
					
					if(input2.equals("1"))
					{
						System.out.println(planes);
					}
					if(input2.equals("2"))
					{
						System.out.println(flights);
					}
					if(input2.equals("3"))
					{
						System.out.println("Give plane ID : ");
						String planeID = reader.nextLine();
						System.out.println(planes.get(planeID));
					}
					if(input2.equals("x"))
					{
						System.out.println("Cheers !");
						break mainLoop;
					}
				}
			}
		}
		
	}
}
