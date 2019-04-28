package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double npop = population + (population*1.5);
		double taxes = (npop*growthRate);
		return taxes;
	}

}
