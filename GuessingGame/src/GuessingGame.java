import java.util.Scanner;

public class GuessingGame // BINARY SEARCH IMPLEMENTATION
{
	private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int avg = 0;
        int i = 0;
        int questions = howManyTimesHalvable(upperLimit - lowerLimit);
        while(i < questions)
        {
        	if(lowerLimit == upperLimit) break;
        	avg = average(lowerLimit, upperLimit);
        	boolean choix = isGreaterThan(avg);
        	if(choix) lowerLimit = avg;
        	else upperLimit = avg;
        	i++;
        }
        System.out.println("Le nombre auquel tu penses est : " + upperLimit);

    }
    
    public void setGame()
    {
    	System.out.println("Nous allons d'abord définir les intervalles du jeu.\n");
    	System.out.println("Valeur mini : ");
    	int min = reader.nextInt();
    	System.out.println("Valeur maxi : ");
    	int max = reader.nextInt();
    	reader.nextLine();
    	System.out.println();
    	play(min,max);
    }

    public boolean isGreaterThan(int value) {
    	System.out.println("Est-ce que ton nombre est plus grand que " + value + " ? (o/n)");
    	if(reader.nextLine().equals("o")) return true;
    	else return false;
    }
    
    public int average(int firstNumber, int secondNumber) {
    	int avg = (firstNumber + secondNumber)/2;
    	return avg;
    }
    
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Pense à un nombre entre " + lowerLimit + " et " + upperLimit + ".");

        System.out.println("Je te promets que je peux trouver le nombre en " + maxQuestions + " questions.\n");
        System.out.println("Je vais te poser une série de questions. Réponds honnêtement.\n");
    }

    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}

