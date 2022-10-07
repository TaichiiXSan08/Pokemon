package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.Pokemon;
import model.Type;
import view.Menu;

public class TypeMatchup {

	public static void main(String[] args) {
		TypeMatchupController controller = new TypeMatchupController();
		Menu menu = new Menu();
		Pokemon pokemon = new Pokemon("", "", "");
		Type type = new Type();
		HashMap<String, Type> pokemonTypes;
		HashMap<String, Double> weaknessScore, resistanceScore, immunityScore;
		Scanner sc = new Scanner(System.in);

		boolean isTrue = true;
		String input;

		pokemonTypes = controller.initializePokemonTypes();

		System.out.println("Hello Trainer");
		do {
			controller.makePokemon(pokemon);
			if (pokemon.getType1() == null)
				pokemon.setType1(pokemon.getType2());
			if (pokemon.getType1().equals(pokemon.getType2()))
				pokemon.setType2(null);
			if (pokemon.getType2() == null)
				pokemon.displayPokemon1();
			else
				pokemon.displayPokemon2();

			controller.determineDefensiveValues(pokemon);
			
			do {
				menu.askToContinue();
				input = sc.next();
			} while (controller.isInvalidStringInput(input));

			if (input.equals("y"))
				isTrue = true;
			else
				isTrue = false;
		} while (isTrue);
		System.out.println("Goodbye");

	}
}
