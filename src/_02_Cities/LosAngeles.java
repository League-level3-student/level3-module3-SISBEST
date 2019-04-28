package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double bgro = growthRate/2;
		double bgr = bgro+growthRate;
		double taxes = (population*bgr);
		return taxes;
	}
	
}
