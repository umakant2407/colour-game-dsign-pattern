package commonds;

public class commondType implements CommondFactory {

	@Override
	public Commond createCommond(String Commond) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commond getCommond(String CommondStr) {
		// TODO Auto-generated method stub
		
		if(CommondStr.charAt(0) == '+') {
			return new SubscribeCommond(CommondStr.substring(1));
		}
		
		if(CommondStr.charAt(0) == '-') {
			return new UnsubcribeCommond(CommondStr.substring(1));
		}
		
		if(CommondStr.equalsIgnoreCase("list")) {
			return new ListCommond();
		}
		
		if(CommondStr.equalsIgnoreCase("exit")) {
			return new ExitCommond();
		}
		
		else return new DisplayCommond(CommondStr);
	}

}
