package model;

public class FinalProgram {

	private Currency Currency = new Currency();
	private Measurement Measurement = new Measurement();
	private double Result;
	private String FS1;
	private String FS2;

	public void FinalSelection(String SelectedValue, double DoubleValue) {
		if (SelectedValue == "Currency Selected") {
			Currency.CurrencyMenu(DoubleValue);
			Result = Currency.getCurrencyMenuValue();
			FS1 = Currency.getCurrencySymbol();
			FS2 = Currency.getCurrencyinSymbol();

		} else {
			Measurement.MeasurementMenu(DoubleValue);
			Result = Measurement.getMeasurementMenuValue();

		}
	}

	public double getFinaSelection() {
		// TODO Auto-generated method stub
		return Result;
	}
	 public String getFS1() {
		return FS1;
	}
	 public String getFS2() {
		return FS2;
	}
}
