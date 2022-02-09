package items.itemFactory;

public class ItemType implements ItemFactory{

	@Override
	public Item createItem(String item) {
		if(!(item.equalsIgnoreCase("apple") || item.equalsIgnoreCase("book") || item.equalsIgnoreCase("ink") ||
				item.equalsIgnoreCase("sky") || item.equalsIgnoreCase("banana") || item.equalsIgnoreCase("salt") || item.equalsIgnoreCase("frog")))
			return new NormalItem("");
		
		else return new NormalItem(item);
	}

}
