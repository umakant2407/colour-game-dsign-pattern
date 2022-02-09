package commonds;

import java.util.ArrayList;
import java.util.Map;

import colourGame.ColourGame;
import items.itemFactory.Item;
import items.itemFactory.ItemFactory;
import items.itemFactory.ItemType;

public class UnsubcribeCommond implements Commond {
	
	String name;
	Item item;
	ItemFactory itemFactory = new ItemType();
	
	public UnsubcribeCommond(String name) {
		super();
		this.name = name;
	}

	@Override
	public void executeOn(ColourGame game) {
		// TODO Auto-generated method stub
		
		item=itemFactory.createItem(this.name);
		
		
		if(game.ListOfSubscribeItems.contains(name)) {
			game.ListOfSubscribeItems.remove(name);
			item.unSubcribeIntro();
		}
		
		ArrayList<String> temp= new ArrayList<>();
		for(Map.Entry<String, ArrayList<String>> list : game.currentColourRelation.entrySet()) {
			
			temp=list.getValue();
			for(int i=0;i<temp.size();i++) {
				if(temp.get(i).equalsIgnoreCase(name))
					temp.remove(i);
			}
		}
		
	}

}
