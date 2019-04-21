package _01_AnimalFarm;

public class Farm {

	public static void main(String[] args) {
		Pig piglet = new Pig();
		Ant youtube = new Ant();
		Human bob = new Human();
		Panda whee = new Panda();
		piglet.eat();
		youtube.eat();
		bob.eat();
		whee.eat();
		piglet.makeNoise();
		youtube.makeNoise();
		bob.makeNoise();
		whee.makeNoise();
	}

}
