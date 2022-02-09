package commonds;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import colourGame.ColourGame;
import items.itemFactory.Item;
import items.itemFactory.ItemFactory;
import items.itemFactory.ItemType;

public class DisplayCommond implements Commond {
	
	String colour;
	Item item;
	ItemFactory itemFactory = new ItemType();
	public DisplayCommond(String name) {
		super();
		this.colour = name;
	}

	@Override
	public void executeOn(ColourGame game) {
		// TODO Auto-generated method stub
		
		if(game.currentColourRelation.containsKey(colour)) {
			ArrayList<String> itemList = game.currentColourRelation.get(colour);
			for(String item :itemList) {
				
				if(item.equalsIgnoreCase("frog"))
					System.out.println("I am "+ item + "! I am "+colour + " today! \n");
				if(!item.equalsIgnoreCase("frog"))
					System.out.println("I am "+ item + "! I am sometimes "+ colour + "\n");
			}
		}
	}
	
}
