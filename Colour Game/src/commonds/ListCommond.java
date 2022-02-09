package commonds;

import colourGame.ColourGame;

public class ListCommond implements Commond {

	@Override
	public void executeOn(ColourGame game) {
		// TODO Auto-generated method stub
		System.out.println("ListCommond");
		
		System.out.println(game.ListOfSubscribeItems);
	}

}
