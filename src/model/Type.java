package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Type 
{
	private String typeName;
	private ArrayList<String> resistance, weakness,immunityOff, immunityDef;
	
	

	public Type(String typeName) {
		this.typeName = typeName;
		resistance = new ArrayList<>();
		weakness = new ArrayList<>();
		immunityOff = new ArrayList<>();
		immunityDef = new ArrayList<>();
	}

	public Type() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getImmunityOff() {
		return immunityOff;
	}

	public void setImmunityOff(ArrayList<String> immunityOff) {
		this.immunityOff = immunityOff;
	}

	public ArrayList<String> getImmunityDef() {
		return immunityDef;
	}

	public void setImmunityDef(ArrayList<String> immunityDef) {
		this.immunityDef = immunityDef;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public ArrayList<String> getresistance() {
		return resistance;
	}
	public void setresistance(ArrayList<String> resistance) {
		this.resistance = resistance;
	}
	public ArrayList<String> getWeakness() {
		return weakness;
	}
	public void setWeakness(ArrayList<String> weakness) {
		this.weakness = weakness;
	}
	
	public void addresistance(List<String> list)
	{
		resistance.addAll(list);
	}
	
	public void addWeakness(List<String> list)
	{
		weakness.addAll(list);
	}
	
	public void addImmunityOff(List<String> list)
	{
		immunityOff.addAll(list);
	}
	
	public void addImmunityDef(List<String> list)
	{
		immunityDef.addAll(list);
	}
	
	public void addresistance(String value)
	{
		resistance.add(value);
	}
	
	public void addWeakness(String value)
	{
		weakness.add(value);
	}
	
	public void addImmunityOff(String value)
	{
		immunityOff.add(value);
	}
	
	public void addImmunityDef(String value)
	{
		immunityDef.add(value);
	}
}
