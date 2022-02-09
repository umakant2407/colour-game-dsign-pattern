package colourGame;

import java.util.Scanner;

import commonds.Commond;
import commonds.CommondFactory;
import commonds.commondType;

public class ColourGameRunner {
	
	public static void run(String [] args) throws Exception{
	
		Scanner scanner = new Scanner(System.in);
		
		ColourGame game = new ColourGame();
		game.additemIncolourRelation();
		game.additemIncurrentColourRelation();
		
		System.out.println("What's the commond ?");
		
		while (true) {
			
			String commondStr = scanner.next();
			commondStr = commondStr.toLowerCase();
			
			CommondFactory Factory = new commondType();
			
			Commond commond = Factory.getCommond(commondStr);
			
			commond.executeOn(game);
			
			System.out.println();
		}
	}
	
	public static void main(String [] args) throws Exception{
		run(args);
	}
}
