package items.itemFactory;


public class NormalItem implements Item{
	
	String name;
	

	public NormalItem(String name) {
		super();
		this.name = name;
	}

	@Override
	public void intro() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " Suscribed");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void unSubcribeIntro() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " UnSuscribed");
	}

	


}
