package model;

import java.util.HashMap;

public class Measurement extends Menu {
	private double result;
	private String val = null;
	private String val2 = null;
	private String[] division = { "CM to Mt", "CM to Km", "CM to Dm", "CM to Inch", "CM to Foot", "Mm to CM" };
	private String[] multiplication = { "CM to Mm", "Mt to CM", "Km to CM", "Dm to CM", "Inch to Cm", "Foot to CM" };
	private int totalLenght = division.length + multiplication.length;
	private String[] measurements = new String[totalLenght];
	private String s1;
	private String s2;

	public void MeasurementMenu(double doubleValue) {

		MenuMeasurement();
		if (getMenuMeasurement() == null) {
			Closed();
			System.exit(0);
		}

		for (int i = 0; i < division.length; i++)
			measurements[i] = division[i];

		for (int i = 0; i < multiplication.length; i++)
			measurements[division.length + i] = multiplication[i];

		double[] data = { 100.0, 100000.0, 10.0, 2.54, 30.48, 10.0, 10.0, 100.0, 100000.0, 10.0, 2.54, 30.48 };

//		String[] fS1 = { "CM", "CM", "CM", "CM", "CM", "CM", "Mt", "Km", "Dm", "Mm", "Inch", "Foot" };
//		String[] fS2 = { "Mt", "Km", "Dm", "Mm", "Inch", "Foot", "CM", "CM", "CM", "CM", "CM", "CM" };

		HashMap<String, Double> measurement = new HashMap<>();
		// double tiemmpo = System.nanoTime();
		int x = 0;
		for (var Metric : measurements) {
			measurement.put(Metric, data[x++]);
		}

		String option = getMenuMeasurement();
		double value = measurement.get(option);

//		for(int v = 0;v < fS1.length;v++)
		
		for (int z = 0, y = 0; z < division.length; z++, y++) {
			val = division[z];
			val2 = multiplication[y];
			if (val == option)
				// division
				result = doubleValue / value;
			else if (val2 == option)
				// multi
				result = doubleValue * value;
		}

	}

	public double getMeasurementMenuValue() {
		// TODO Auto-generated method stub
		return result;
	}
	public String getMeasurementSymbol() {
		// TODO Auto-generated method stub
		return s1;
	}

	public String getMeasurementinSymbol() {
		// TODO Auto-generated method stub
		return s2;
	}

}
