package model;

public class Selection {


	private Currency Currency = new Currency();
	private Measurement Measurement = new Measurement();
	private double answer;
	private String fS1;
	private String fS2;

	public void FinalSelection(String SelectedValue, double DoubleValue) {
		if (SelectedValue == "Currency Selected") {
			Currency.CurrencyMenu(DoubleValue);
			answer = Currency.getCurrencyMenuValue();
			fS1 = Currency.getCurrencySymbol();
			fS2 = Currency.getCurrencyinSymbol();

		} else if (SelectedValue == "Measurement Selected") {
			Measurement.MeasurementMenu(DoubleValue);
			answer = Measurement.getMeasurementMenuValue();
				fS1 = Measurement.getMeasurementSymbol();
				fS2 = Measurement.getMeasurementinSymbol();
		}
	}

	public double getFinaSelection() {
		// TODO Auto-generated method stub
		return answer;
	}

	public String getFS1() {
		return fS1;
	}

	public String getFS2() {
		return fS2;
	}

}
