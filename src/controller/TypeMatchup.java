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

			resistanceScore = controller.determineResistances(pokemonTypes, pokemon);

			weaknessScore = controller.determineWeaknesses(pokemonTypes, pokemon);

			immunityScore = controller.determineImmunity(pokemonTypes, pokemon);

			/*
			 * System.out.println("immunity"); for(String a : immunityScore.keySet()) {
			 * if(a.equalsIgnoreCase("dragon") || a.equalsIgnoreCase("flying"))
			 * System.out.println(); System.out.print(a + " - " + immunityScore.get(a) +
			 * "\t"); }
			 */

			for (String a : resistanceScore.keySet()) {
				double finalValue = 0, absoluteDifferenceValue = 0;
				absoluteDifferenceValue = Math.abs(resistanceScore.get(a) - weaknessScore.get(a));

				if (immunityScore.get(a) == 0)
					finalValue = 0;
				else if (resistanceScore.get(a) > weaknessScore.get(a))
					finalValue = 0.5 / absoluteDifferenceValue;
				else if (resistanceScore.get(a) < weaknessScore.get(a))
					finalValue = absoluteDifferenceValue * 2;
				else
					finalValue = 1;

				if (a.equalsIgnoreCase("dragon") || a.equalsIgnoreCase("flying"))
					System.out.println();
				System.out.print(a + " - " + finalValue + "\t");
			}
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
