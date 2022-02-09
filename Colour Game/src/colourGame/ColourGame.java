package colourGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ColourGame {

	public HashMap<String,ArrayList<String>> colourRelation = new HashMap<String,ArrayList<String>>();

	public HashMap<String,ArrayList<String>> currentColourRelation = new HashMap<String,ArrayList<String>>();
	
	public ArrayList<String> ListOfSubscribeItems = new ArrayList<>();
	
	public void additemIncolourRelation() {
		this.colourRelation.put("apple", new ArrayList<String>(Arrays.asList("red","green")));
		this.colourRelation.put("book", new ArrayList<String>(Arrays.asList("red")));
		this.colourRelation.put("ink", new ArrayList<String>(Arrays.asList("red","black")));
		this.colourRelation.put("sky", new ArrayList<String>(Arrays.asList("blue","black")));
		this.colourRelation.put("frog", new ArrayList<String>(Arrays.asList("blue","yellow")));
		this.colourRelation.put("banana", new ArrayList<String>(Arrays.asList("yellow","green")));
		this.colourRelation.put("salt", new ArrayList<String>(Arrays.asList("weight")));
	}
	
	public void additemIncurrentColourRelation() {
		this.currentColourRelation.put("red", new ArrayList<String>());
		this.currentColourRelation.put("green", new ArrayList<String>());
		this.currentColourRelation.put("black", new ArrayList<String>());
		this.currentColourRelation.put("blue", new ArrayList<String>());
		this.currentColourRelation.put("yellow", new ArrayList<String>());
		this.currentColourRelation.put("weight", new ArrayList<String>());
	}
	
	
}
