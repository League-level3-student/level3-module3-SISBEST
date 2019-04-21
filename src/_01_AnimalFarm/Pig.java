package _01_AnimalFarm;

import java.io.IOException;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("OINK!");
	}

	@Override
	public void eat() {
		System.out.println("idk...");
		String url = "https://www.google.com/search?q=what+do+pigs+eat&oq=what+do+pig&aqs=chrome.1.69i57j0l5.3668j1j9&sourceid=chrome&ie=UTF-8";
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
