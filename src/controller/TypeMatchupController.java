package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import model.Pokemon;
import model.Type;
import view.Menu;

public class TypeMatchupController {
	// set default values for all the types
	private Type normal, fire, water, grass, electric, ice, fighting, poison, ground, flying, psychic, bug, rock, ghost,
			dragon, dark, steel, fairy;
	private HashMap<String, Type> pokemonTypes = new HashMap<String, Type>();

	Menu menu = new Menu();
	Scanner sc = new Scanner(System.in);

	public HashMap<String, Type> initializePokemonTypes() {
		normal = new Type("normal");
		normal.addWeakness("fighting");
		normal.addImmunityDef("ghost");
		pokemonTypes.put(normal.getTypeName(), normal);

		fire = new Type("fire");
		fire.addresistance(Arrays.asList("fire", "grass", "ice", "bug", "steel", "fairy"));
		fire.addWeakness(Arrays.asList("water", "ground", "rock"));
		pokemonTypes.put(fire.getTypeName(), fire);

		water = new Type("water");
		water.addresistance(Arrays.asList("fire", "water", "ice", "steel"));
		water.addWeakness(Arrays.asList("electric", "grass"));
		pokemonTypes.put(water.getTypeName(), water);

		grass = new Type("grass");
		grass.addresistance(Arrays.asList("water", "grass", "electric", "ground"));
		grass.addWeakness(Arrays.asList("fire", "ice", "poison", "flying", "bug"));
		pokemonTypes.put(grass.getTypeName(), grass);

		electric = new Type("electric");
		electric.addresistance(Arrays.asList("electric", "flying", "steel"));
		electric.addWeakness("ground");
		pokemonTypes.put(electric.getTypeName(), electric);

		ice = new Type("ice");
		ice.addresistance("ice");
		ice.addWeakness(Arrays.asList("fire", "fighting", "rock", "steel"));
		pokemonTypes.put(ice.getTypeName(), ice);

		fighting = new Type("fighting");
		fighting.addresistance(Arrays.asList("bug", "rock", "dark"));
		fighting.addWeakness(Arrays.asList("flying", "psychic", "fairy"));
		pokemonTypes.put(fighting.getTypeName(), fighting);

		poison = new Type("poison");
		poison.addresistance(Arrays.asList("grass", "fighting", "poison", "bug", "fairy"));
		poison.addWeakness(Arrays.asList("ground", "psychic"));
		pokemonTypes.put(poison.getTypeName(), poison);

		ground = new Type("ground");
		ground.addresistance(Arrays.asList("poison", "rock"));
		ground.addWeakness(Arrays.asList("water", "grass", "ice"));
		ground.addImmunityDef("electric");
		pokemonTypes.put(ground.getTypeName(), ground);

		flying = new Type("flying");
		flying.addresistance(Arrays.asList("grass", "fighting", "bug"));
		flying.addWeakness(Arrays.asList("electric", "ice", "rock"));
		flying.addImmunityDef("ground");
		pokemonTypes.put(flying.getTypeName(), flying);

		psychic = new Type("psychic");
		psychic.addresistance(Arrays.asList("fighting", "psychic"));
		psychic.addWeakness(Arrays.asList("bug", "ghost", "dark"));
		pokemonTypes.put(psychic.getTypeName(), psychic);

		bug = new Type("bug");
		bug.addresistance(Arrays.asList("grass", "fighting", "ground"));
		bug.addWeakness(Arrays.asList("fire", "flying", "rock"));
		pokemonTypes.put(bug.getTypeName(), bug);

		rock = new Type("rock");
		rock.addresistance(Arrays.asList("norma", "fire", "poison", "flying"));
		rock.addWeakness(Arrays.asList("water", "grass", "fighting", "ground", "steel"));
		pokemonTypes.put(rock.getTypeName(), rock);

		ghost = new Type("ghost");
		ghost.addresistance(Arrays.asList("poison", "bug"));
		ghost.addWeakness(Arrays.asList("ghost", "dark"));
		ghost.addImmunityDef(Arrays.asList("normal", "fighting"));
		pokemonTypes.put(ghost.getTypeName(), ghost);

		dragon = new Type("dragon");
		dragon.addresistance(Arrays.asList("fire", "water", "grass", "electric"));
		dragon.addWeakness(Arrays.asList("ice", "dragon", "fairy"));
		pokemonTypes.put(dragon.getTypeName(), dragon);

		dark = new Type("dark");
		dark.addresistance(Arrays.asList("ghost", "dark"));
		dark.addWeakness(Arrays.asList("fighting", "bug", "fairy"));
		pokemonTypes.put(dark.getTypeName(), dark);

		steel = new Type("steel");
		steel.addresistance(Arrays.asList("normal", "grass", "ice", "flying", "psychic", "bug", "rock", "dragon",
				"steel", "fairy"));
		steel.addWeakness(Arrays.asList("fire", "fighting", "ground"));
		steel.addImmunityDef("poison");
		pokemonTypes.put(steel.getTypeName(), steel);

		fairy = new Type("fairy");
		fairy.addresistance(Arrays.asList("fighting", "bug", "dark"));
		fairy.addWeakness(Arrays.asList("poison", "steel"));
		fairy.addImmunityDef("dragon");
		pokemonTypes.put(fairy.getTypeName(), fairy);

		return pokemonTypes;
	}

	public Pokemon makePokemon(Pokemon pokemon) {
		String input = "";

		menu.askPokemonName();
		pokemon.setName(sc.next());
		for (int ctr = 1; ctr <= 2; ctr++) {
			menu.askPokemonType();
			input = sc.next();
			System.out.println("input is: " + input);
			if (ctr <= 1) {
				switch (input.trim()) {
				case "1":
					pokemon.setType1("normal");
					break;
				case "2":
					pokemon.setType1("fire");
					break;
				case "3":
					pokemon.setType1("water");
					break;
				case "4":
					pokemon.setType1("grass");
					break;
				case "5":
					pokemon.setType1("electric");
					break;
				case "6":
					pokemon.setType1("ice");
					break;
				case "7":
					pokemon.setType1("psychic");
					break;
				case "8":
					pokemon.setType1("fighting");
					break;
				case "9":
					pokemon.setType1("poison");
					break;
				case "10":
					pokemon.setType1("ground");
					break;
				case "11":
					pokemon.setType1("flying");
					break;
				case "12":
					pokemon.setType1("bug");
					break;
				case "13":
					pokemon.setType1("rock");
					break;
				case "14":
					pokemon.setType1("ghost");
					break;
				case "15":
					pokemon.setType1("dark");
					break;
				case "16":
					pokemon.setType1("dragon");
					break;
				case "17":
					pokemon.setType1("steel");
					break;
				case "18":
					pokemon.setType1("fairy");
					break;
				case "0":
					pokemon.setType1(null);
					;
					break;
				default:
					System.out.println("invalid input");
					break;
				}
			} else {
				switch (input.trim()) {
				case "1":
					pokemon.setType2("normal");
					break;
				case "2":
					pokemon.setType2("fire");
					break;
				case "3":
					pokemon.setType2("water");
					break;
				case "4":
					pokemon.setType2("grass");
					break;
				case "5":
					pokemon.setType2("electric");
					break;
				case "6":
					pokemon.setType2("ice");
					break;
				case "7":
					pokemon.setType2("psychic");
					break;
				case "8":
					pokemon.setType2("fighting");
					break;
				case "9":
					pokemon.setType2("poison");
					break;
				case "10":
					pokemon.setType2("ground");
					break;
				case "11":
					pokemon.setType2("flying");
					break;
				case "12":
					pokemon.setType2("bug");
					break;
				case "13":
					pokemon.setType2("rock");
					break;
				case "14":
					pokemon.setType2("ghost");
					break;
				case "15":
					pokemon.setType2("dark");
					break;
				case "16":
					pokemon.setType2("dragon");
					break;
				case "17":
					pokemon.setType2("steel");
					break;
				case "18":
					pokemon.setType2("fairy");
					break;
				case "0":
					pokemon.setType2(null);
					break;
				default:
					System.out.println("invalid input");
					break;
				}
			}
		}
		return pokemon;
	}

	public HashMap<String, Double> determineResistances(HashMap<String, Type> pokemonType, Pokemon pokemon) {
		ArrayList<String> pokemonResistanceList = new ArrayList<String>();
		HashMap<String, Double> resistanceScoreList = new HashMap<String, Double>();
		double ctr = 0;

		pokemonResistanceList.addAll(pokemonType.get(pokemon.getType1()).getresistance());
		// System.out.println(pokemonType.get(pokemon.getType1()).getresistance());
		if (pokemon.getType2() != null) {
			pokemonResistanceList.addAll(pokemonType.get(pokemon.getType2()).getresistance());
			// System.out.println(pokemonType.get(pokemon.getType2()).getresistance());
		}
		if (pokemonResistanceList.isEmpty())
			pokemonResistanceList.add("");

		// System.out.println("resistance score list: ");
		for (String type : pokemonType.keySet()) {
			for (String resist : pokemonResistanceList) {
				if (type.equalsIgnoreCase(resist)) {
					ctr++;
				}
			}
			/*
			 * if(ctr == 0) ctr = 0.5; if(0.5/ctr == 1) ctr = 0; else ctr = 0.5/ctr;
			 */
			resistanceScoreList.put(type, (double) ctr);
			ctr = 0;
			/*
			 * if(type.equalsIgnoreCase("dragon") || type.equalsIgnoreCase("flying"))
			 * System.out.println(); System.out.print(type + " - " +
			 * resistanceScoreList.get(type) + "\t");
			 */
		}
		return resistanceScoreList;
	}

	public HashMap<String, Double> determineWeaknesses(HashMap<String, Type> pokemonType, Pokemon pokemon) {
		ArrayList<String> pokemonWeaknessList = new ArrayList<String>();
		HashMap<String, Double> weaknessScoreList = new HashMap<String, Double>();
		int ctr = 0;

		pokemonWeaknessList.addAll(pokemonType.get(pokemon.getType1()).getWeakness());
		// System.out.println(pokemonType.get(pokemon.getType1()).getWeakness());
		if (pokemon.getType2() != null)
			pokemonWeaknessList.addAll(pokemonType.get(pokemon.getType2()).getWeakness());
		// System.out.println(pokemonType.get(pokemon.getType2()).getWeakness());

		for (String type : pokemonType.keySet()) {
			for (String resist : pokemonWeaknessList) {
				// counts instances of weakness
				if (type.equalsIgnoreCase(resist)) {
					ctr++;
				}
			}
			weaknessScoreList.put(type, (double) ctr);
			ctr = 0;
			/*
			 * if(type.equalsIgnoreCase("dragon") || type.equalsIgnoreCase("flying"))
			 * System.out.println(); System.out.print(type + " - " +
			 * weaknessScoreList.get(type) + "\t");
			 */
		}

		return weaknessScoreList;
	}

	public HashMap<String, Double> determineImmunity(HashMap<String, Type> pokemonType, Pokemon pokemon) {
		HashMap<String, Double> immunityScoreList = new HashMap<String, Double>();
		ArrayList<String> immunityList = new ArrayList<String>();
		double value = 1;

		immunityList.addAll(pokemonType.get(pokemon.getType1()).getImmunityDef());
		if (pokemon.getType2() != null)
			immunityList.addAll(pokemonType.get(pokemon.getType2()).getImmunityDef());
		/*
		 * System.out.println(pokemonType.get(pokemon.getType1()).getImmunityDef().
		 * toString());
		 * System.out.println(pokemonType.get(pokemon.getType2()).getImmunityDef().
		 * toString() + "\n\n");
		 */
		// System.out.println(immunityList.toString());

		for (String type : pokemonType.keySet()) {
			for (String immunity : immunityList) {
				if (type.equalsIgnoreCase(immunity))
					value = 0;
			}
			immunityScoreList.put(type, value);
			value = 1;
			if (immunityList.isEmpty()) {
				// System.out.println("no immunity");
				immunityScoreList.put(type, 1.00);
			}
		}

		return immunityScoreList;
	}

	public boolean isInvalidStringInput(String input) {
		try {
			if (input.equalsIgnoreCase("y"))
				return false;
			else if (input.equalsIgnoreCase("n"))
				return false;
			else
				throw new Exception();
		} catch (Exception e) {
			System.out.println("invalid input!");
			return true;
		}
	}
}
