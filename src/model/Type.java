package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Type 
{
	private String typeName;
	private ArrayList<Double> defensiveValue, offensiveValue;

	
	public Type(String typeName) {
		this.typeName = typeName;
		defensiveValue = new  ArrayList<>();
		offensiveValue = new ArrayList<>();
	}

	public Type() {
		// TODO Auto-generated constructor stub
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public ArrayList<Double> getDefensiveValue() {
		return defensiveValue;
	}

	public void setDefensiveValue(Collection<? extends Double> defensiveValue) {
		this.defensiveValue.addAll(defensiveValue);
	}

	public ArrayList<Double> getOffensiveValue() {
		return offensiveValue;
	}

	public void setOffensiveValue(Collection<? extends Double>  offensiveValue) {
		this.offensiveValue.addAll(offensiveValue);
	}
}