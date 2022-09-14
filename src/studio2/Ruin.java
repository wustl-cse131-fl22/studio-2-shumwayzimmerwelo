package studio2;

public class Ruin {

	public static void main(String[] args) {
	
	double startAmount = 5.00;
	double winChance = .50;
	double winLimit = 20.00;
	int rounds = 0;
	
	for (int totalSimulations = 0; totalSimulations <= 20; totalSimulations++)
	{
		
	rounds = 0;
	startAmount = 5;
	while (startAmount > 0 && startAmount < 20)
	{
	double probability = Math.random();
	if (probability < winChance)
	{
		startAmount++;
		rounds++;
	}
	else
	{
		startAmount--;
		rounds++;
	}
	}
	System.out.println("Day:" + totalSimulations + " Attempts " + rounds);
	
	
	if (startAmount == 0){
		System.out.println("RUIN!");
	}
	else{
		System.out.println("WIN!");
	}

	}
	startAmount = 5;
	double expectedRuin = 1 - (startAmount/winLimit);
	System.out.println("Ruin rate: " + expectedRuin);
	
	
	
	}


}
