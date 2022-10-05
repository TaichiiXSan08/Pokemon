package view;

public class Menu 
{
	public void askPokemonName()
	{
		System.out.print("\nEnter Pokemon name:");
	}
	
	public void askPokemonType()
	{
		System.out.print("[1] Normal	[7] Psychic	[13] Rock	[0]None\r\n"
				+ "[2] Fire	[8] Fighting	[14] Ghost\r\n"
				+ "[3] Water	[9] Poison	[15] Dark\r\n"
				+ "[4] Grass	[10] Ground	[16] Dragon\r\n"
				+ "[5] Electric	[11] Flying	[17] Steel\r\n"
				+ "[6] Ice		[12] Bug	[18] Fairy\r\n"
				+"Enter choice: ");
	}
	
	public void askToContinue()
	{
		System.out.println("\n\nWould you like to continue? [y/n]");
	}
}
