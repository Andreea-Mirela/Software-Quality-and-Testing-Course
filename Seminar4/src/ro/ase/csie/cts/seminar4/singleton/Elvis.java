package ro.ase.csie.cts.seminar4.singleton;

public class Elvis {
	
	public static Elvis theTrueElvis;
	
	private Elvis() {
		
	}
	
	public static Elvis getInstance() {
		if(theTrueElvis == null) {
			theTrueElvis = new Elvis();
		}
		return theTrueElvis;
	}
	
	public void sing() {
		System.out.println("Elvis is singing");
	}

}
