package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bgro = growthRate*2;
		double bgr = bgro+growthRate;
		double taxes = (population*bgr);
		return taxes;
	}

}
