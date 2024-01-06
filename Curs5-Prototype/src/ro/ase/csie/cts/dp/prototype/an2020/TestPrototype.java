package ro.ase.csie.cts.dp.prototype.an2020;

public class TestPrototype {
	public static void main(String[] args) {
		
		//fara Prototype
/*		Asteroid a1 = new Asteroid();
		Asteroid a2 = new Asteroid();
		Asteroid a3 = new Asteroid();*/
		
		//Prototype
		Asteroid prototipAsteroid = new Asteroid("Asteroid");
		Asteroid a1 = (Asteroid) prototipAsteroid.clone();
		Asteroid a2 = (Asteroid) prototipAsteroid.clone();
		Asteroid a3 = (Asteroid) prototipAsteroid.clone();
	}
	
}
