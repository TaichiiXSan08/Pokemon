package model;

public class Pokemon 
{
	private String type1, type2, name;
	
	public Pokemon(String type1, String type2, String name) {
		super();
		this.type1 = type1;
		this.type2 = type2;
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayPokemon1()
	{
		System.out.printf("Your pokemon: %s is a %s type \n",getName(),getType1());
	}
	
	public void displayPokemon2()
	{
		System.out.printf("Your pokemon: %s is a %s / %s type \n",getName(),getType1(), getType2());
	}

}
