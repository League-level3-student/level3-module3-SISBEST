package _01_AnimalFarm;

public class Human extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Hello!");
	}

	@Override
	public void eat() {
		System.out.println("Burger");
	}

}
