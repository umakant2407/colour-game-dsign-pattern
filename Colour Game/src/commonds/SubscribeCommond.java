package commonds;

import java.util.ArrayList;
import java.util.Map;

import colourGame.ColourGame;
import items.itemFactory.Item;
import items.itemFactory.ItemFactory;
import items.itemFactory.ItemType;

public class SubscribeCommond implements Commond {
	
	String name;
	Item item;
	ItemFactory itemFactory = new ItemType();

	public SubscribeCommond(String name) {
		super();
		this.name = name;
	}

	@Override
	public void executeOn(ColourGame game) {
		
		item=itemFactory.createItem(this.name);
		if(!game.ListOfSubscribeItems.contains(name) && game.colourRelation.containsKey(name)) {
			game.ListOfSubscribeItems.add(name);
			item.intro();
		}
		else if(game.ListOfSubscribeItems.contains(name) && game.colourRelation.containsKey(name)) {
			item.intro();
		}
		else
			;
		for(Map.Entry<String, ArrayList<String>> list : game.colourRelation.entrySet()) {
			
			String temp=list.getKey();
			
			if(temp.equalsIgnoreCase(name)) {
				for(String colour : list.getValue()) {
					game.currentColourRelation.get(colour).add(name);
				}
				
			}
			
		}
	}

	

}
