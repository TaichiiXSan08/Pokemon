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
	private String[] typeNames = {"normal","fire","water","grass","electric","ice","fighting","poison","ground","flying","psychic","bug","rock","ghost","dragon","dark","steel","fairy"};
	private HashMap<String, Type> pokemonTypes = new HashMap<String, Type>();
	ArrayList<Double> finalValues = new ArrayList<>();

	Menu menu = new Menu();
	Scanner sc = new Scanner(System.in);

	public HashMap<String, Type> initializePokemonTypes() {
		normal = new Type("normal");
		normal.setDefensiveValue( Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0,0.0,1.0,1.0,1.0,1.0));
		normal.setOffensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,0.5,0.0,1.0,1.0,0.5,1.0));
		pokemonTypes.put(normal.getTypeName(), normal);
		
		fire = new Type("fire");
		fire.setDefensiveValue(Arrays.asList(1.0,0.5,2.0,0.5,1.0,0.5,1.0,1.0,2.0,1.0,1.0,0.5,2.0,1.0,1.0,1.0,0.5,0.5));		
		fire.setOffensiveValue(Arrays.asList(1.0,0.5,0.5,2.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,2.0,0.5,1.0,0.5,1.0,2.0,1.0));
		pokemonTypes.put(fire.getTypeName(), fire);

		water = new Type("water");
		water.setDefensiveValue(Arrays.asList(1.0,0.5,0.5,2.0,2.0,0.5,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,0.5,1.0));
		water.setOffensiveValue(Arrays.asList(1.0,2.0,0.5,0.5,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,2.0,1.0,0.5,1.0,1.0,1.0));
		pokemonTypes.put(water.getTypeName(), water);

		grass = new Type("grass");
		grass.setDefensiveValue(Arrays.asList(1.0,2.0,0.5,0.5,0.5,2.0,1.0,2.0,0.5,2.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0,1.0));
		grass.setOffensiveValue(Arrays.asList(1.0,0.5,2.0,0.5,1.0,1.0,1.0,0.5,2.0,0.5,1.0,0.5,2.0,1.0,0.5,1.0,0.5,1.0));
		pokemonTypes.put(grass.getTypeName(), grass);

		electric = new Type("electric");
		electric.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,0.5,1.0,1.0,1.0,2.0,0.5,1.0,1.0,1.0,1.0,1.0,1.0,0.5,1.0));
		electric.setOffensiveValue(Arrays.asList(1.0,1.0,2.0,0.5,0.5,1.0,1.0,1.0,0.0,2.0,1.0,1.0,1.0,1.0,0.5,1.0,1.0,1.0));
		pokemonTypes.put(electric.getTypeName(), electric);

		ice = new Type("ice");
		ice.setDefensiveValue(Arrays.asList(1.0,2.0,1.0,1.0,1.0,0.5,2.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,2.0,1.0));
		ice.setOffensiveValue(Arrays.asList(1.0,0.5,0.5,2.0,1.0,0.5,1.0,1.0,2.0,2.0,1.0,1.0,1.0,1.0,2.0,1.0,0.5,1.0));
		pokemonTypes.put(ice.getTypeName(), ice);

		fighting = new Type("fighting");
		fighting.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,2.0,0.5,0.5,1.0,1.0,0.5,1.0,2.0));
		fighting.setOffensiveValue(Arrays.asList(2.0,1.0,1.0,1.0,1.0,2.0,1.0,0.5,1.0,0.5,0.5,0.5,2.0,0.0,1.0,2.0,2.0,0.5));
		pokemonTypes.put(fighting.getTypeName(), fighting);

		poison = new Type("poison");
		poison.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,0.5,1.0,1.0,0.5,0.5,2.0,1.0,2.0,0.5,1.0,1.0,1.0,1.0,1.0,0.5));
		poison.setOffensiveValue(Arrays.asList(1.0,1.0,1.0,2.0,1.0,1.0,1.0,0.5,0.5,1.0,1.0,1.0,0.5,0.5,1.0,1.0,0.0,2.0));
		pokemonTypes.put(poison.getTypeName(), poison);

		ground = new Type("ground");
		ground.setDefensiveValue(Arrays.asList(1.0,1.0,2.0,2.0,2.0,1.0,0.5,1.0,1.0,1.0,1.0,1.0,0.5,1.0,1.0,1.0,1.0,1.0));
		ground.setOffensiveValue(Arrays.asList(1.0,2.0,1.0,0.5,2.0,1.0,1.0,2.0,1.0,0.0,1.0,0.5,2.0,1.0,1.0,1.0,2.0,1.0));
		pokemonTypes.put(ground.getTypeName(), ground);

		flying = new Type("flying");
		flying.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,0.5,2.0,2.0,0.5,1.0,0.0,1.0,1.0,0.5,2.0,1.0,1.0,1.0,1.0,1.0));
		flying.setOffensiveValue(Arrays.asList(1.0,1.0,1.0,2.0,0.5,1.0,2.0,1.0,1.0,1.0,1.0,2.0,0.5,1.0,1.0,1.0,0.5,1.0));
		pokemonTypes.put(flying.getTypeName(), flying);

		psychic = new Type("psychic");
		psychic.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,0.5,1.0,1.0,1.0,0.5,2.0,1.0,2.0,1.0,2.0,1.0,1.0));
		psychic.setOffensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,2.0,2.0,1.0,1.0,0.5,1.0,1.0,1.0,1.0,0.0,0.5,1.0));
		pokemonTypes.put(psychic.getTypeName(), psychic);

		bug = new Type("bug");
		bug.setDefensiveValue(Arrays.asList(1.0,2.0,1.0,0.5,1.0,1.0,0.5,1.0,0.5,2.0,1.0,1.0,2.0,1.0,1.0,1.0,1.0,1.0));
		bug.setOffensiveValue(Arrays.asList(1.0,0.5,1.0,2.0,1.0,1.0,0.5,0.5,1.0,0.5,2.0,1.0,1.0,0.5,1.0,2.0,0.5,0.5));
		pokemonTypes.put(bug.getTypeName(), bug);

		rock = new Type("rock");
		rock.setDefensiveValue(Arrays.asList(0.5,0.5,2.0,2.0,1.0,1.0,2.0,0.5,2.0,0.5,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0));
		rock.setOffensiveValue(Arrays.asList(1.0,2.0,1.0,1.0,1.0,2.0,0.5,1.0,0.5,2.0,1.0,2.0,1.0,1.0,1.0,1.0,0.5,1.0));
		pokemonTypes.put(rock.getTypeName(), rock);

		ghost = new Type("ghost");
		ghost.setDefensiveValue(Arrays.asList(0.0,1.0,1.0,1.0,1.0,1.0,0.0,0.5,1.0,1.0,1.0,0.5,1.0,2.0,1.0,2.0,1.0,1.0));
		ghost.setOffensiveValue(Arrays.asList(0.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,2.0,1.0,0.5,1.0,1.0));
		pokemonTypes.put(ghost.getTypeName(), ghost);

		dragon = new Type("dragon");
		dragon.setDefensiveValue(Arrays.asList(1.0,0.5,0.5,0.5,0.5,2.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,2.0));
		dragon.setOffensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,0.5,0.0));
		pokemonTypes.put(dragon.getTypeName(), dragon);

		dark = new Type("dark");
		dark.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.0,0.0,2.0,1.0,0.5,1.0,0.5,1.0,2.0));
		dark.setOffensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,0.5,1.0,1.0,1.0,2.0,1.0,1.0,2.0,1.0,0.5,1.0,0.5));
		pokemonTypes.put(dark.getTypeName(), dark);

		steel = new Type("steel");
		steel.setDefensiveValue(Arrays.asList(0.5,2.0,1.0,0.5,1.0,0.5,2.0,0.0,2.0,0.5,0.5,0.5,0.5,1.0,0.5,1.0,0.5,0.5));
		steel.setOffensiveValue(Arrays.asList(1.0,0.5,0.5,1.0,0.5,2.0,1.0,1.0,1.0,1.0,1.0,1.0,2.0,1.0,1.0,1.,0.5,2.0));
		pokemonTypes.put(steel.getTypeName(), steel);

		fairy = new Type("fairy");
		fairy.setDefensiveValue(Arrays.asList(1.0,1.0,1.0,1.0,1.0,1.0,0.5,2.0,1.0,1.0,1.0,0.5,1.0,1.0,0.0,0.5,2.0,1.0));
		fairy.setOffensiveValue(Arrays.asList(1.0,0.5,1.0,1.0,1.0,1.0,2.0,0.5,1.0,1.0,1.0,1.0,1.0,1.0,2.0,2.0,0.5,1.0));
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
	
	public void determineDefensiveValues(Pokemon pokemon){
		ArrayList<Double> finalValues = new ArrayList<>();
		int ctr = 0;
		double value2 = 0;
		
		for(Double value : pokemonTypes.get(pokemon.getType1()).getDefensiveValue()){
			if(pokemon.getType2() != null)
			{
				value2 = pokemonTypes.get(pokemon.getType2()).getDefensiveValue().get(ctr);
			}else
				value2 = 1;
			finalValues.add(value * value2);
			ctr++;
		}
		
		displayDefensiveValues(finalValues);
	}
	
	public void displayDefensiveValues(ArrayList<Double> finalValues)
	{
		ArrayList<String> superEffective = new ArrayList<String>();
		ArrayList<String> superEffective2 = new ArrayList<String>();
		ArrayList<String> notEffective = new ArrayList<String>();
		ArrayList<String> notEffective2 = new ArrayList<String>();
		ArrayList<String> immune = new ArrayList<String>();
		ArrayList<String> normal = new ArrayList<String>();
		String sE2= "",sE= "",nE2= "",nE= "",imm= "",nor= "";
		
		int ctr = 0;
		
		for(Double value : finalValues)
		{
			if(value == 4)
				superEffective2.add(typeNames[ctr]);
			else if(value == 2)
				superEffective.add(typeNames[ctr]);
			else if(value == 0.5)
				notEffective.add(typeNames[ctr]);
			else if(value == 0.25)
				notEffective2.add(typeNames[ctr]);
			else if(value == 0)
				immune.add(typeNames[ctr]);
			else
				normal.add(typeNames[ctr]);
			ctr++;
		}
		
		//printing 4x
		if(!superEffective2.isEmpty()) {
			for(String value : superEffective2)
				sE2 += value+",";
			System.out.format("%-30s %-1s\n","Super Effective (x4):",sE2.substring(0,sE2.length()-1));
		}
		//print 2x
		if(!superEffective.isEmpty())
		{
			for(String value : superEffective)
				sE += value+",";
			System.out.format("%-30s %-1s\n","Super Effective (x2):",sE.substring(0,sE.length()-1));
		}
		//print 1/2x
		if(!notEffective.isEmpty())
		{
			for(String value : notEffective)
				nE += value+",";
			System.out.format("%-30s %-1s\n","Not Effective (x1/2):",nE.substring(0,nE.length()-1));
		}
		//print 1/4x
		if(!notEffective2.isEmpty())
		{
			for(String value : notEffective2)
				nE2 += value+",";
			System.out.format("%-30s %-1s\n","Not Effective (x1/4):",nE2.substring(0,nE2.length()-1));
		}
		//print immunity
		if(!immune.isEmpty())
		{
			for(String value : immune)
				imm += value+",";
			System.out.format("%-30s %-1s\n","Immune(x0):",imm.substring(0,imm.length()-1));
		}
		//print normal
		if(!immune.isEmpty())
		{
			for(String value : normal)
				nor += value+",";
			System.out.format("%-30s %-1s","Not Effective (x1/2):",nor.substring(0,nor.length()-1));
		}
	}

	public boolean isInvalidStringInput(String input) {
		if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))
			return false;
		else {
			System.out.print("\nInvalid");
			return true;
		}
	}
	
	public void determineOffensiveValues(Pokemon pokemon){
		
		int ctr = 0;
		double value2 = 0;
		
		for(Double value : pokemonTypes.get(pokemon.getType1()).getOffensiveValue()){
			if(pokemon.getType2() != null)
			{
				value2 = pokemonTypes.get(pokemon.getType2()).getDefensiveValue().get(ctr);
			}else
				value2 = 1;
			finalValues.add(value * value2);
			ctr++;
		}
		
		displayDefensiveValues(finalValues);
	}

	public void displayOffensiveValues(ArrayList<Double> finalValues)
	{
		ArrayList<String> superEffective = new ArrayList<String>();
		ArrayList<String> superEffective2 = new ArrayList<String>();
		ArrayList<String> notEffective = new ArrayList<String>();
		ArrayList<String> notEffective2 = new ArrayList<String>();
		ArrayList<String> immune = new ArrayList<String>();
		ArrayList<String> normal = new ArrayList<String>();
		String sE2= "",sE= "",nE2= "",nE= "",imm= "",nor= "";
		
		int ctr = 0;
		
		for(Double value : finalValues)
		{
			if(value == 4)
				superEffective2.add(typeNames[ctr]);
			else if(value == 2)
				superEffective.add(typeNames[ctr]);
			else if(value == 0.5)
				notEffective.add(typeNames[ctr]);
			else if(value == 0.25)
				notEffective2.add(typeNames[ctr]);
			else if(value == 0)
				immune.add(typeNames[ctr]);
			else
				normal.add(typeNames[ctr]);
			ctr++;
		}
		
		//printing 4x
		if(!superEffective2.isEmpty()) {
			for(String value : superEffective2)
				sE2 += value+",";
			System.out.format("%-30s %-1s\n","Super Effective (x4):",sE2.substring(0,sE2.length()-1));
		}
		//print 2x
		if(!superEffective.isEmpty())
		{
			for(String value : superEffective)
				sE += value+",";
			System.out.format("%-30s %-1s\n","Super Effective (x2):",sE.substring(0,sE.length()-1));
		}
		//print 1/2x
		if(!notEffective.isEmpty())
		{
			for(String value : notEffective)
				nE += value+",";
			System.out.format("%-30s %-1s\n","Not Effective (x1/2):",nE.substring(0,nE.length()-1));
		}
		//print 1/4x
		if(!notEffective2.isEmpty())
		{
			for(String value : notEffective2)
				nE2 += value+",";
			System.out.format("%-30s %-1s\n","Not Effective (x1/4):",nE2.substring(0,nE2.length()-1));
		}
		//print immunity
		if(!immune.isEmpty())
		{
			for(String value : immune)
				imm += value+",";
			System.out.format("%-30s %-1s\n","Immune(x0):",imm.substring(0,imm.length()-1));
		}
		//print normal
		if(!immune.isEmpty())
		{
			for(String value : normal)
				nor += value+",";
			System.out.format("%-30s %-1s","Not Effective (x1/2):",nor.substring(0,nor.length()-1));
		}
	}
}
