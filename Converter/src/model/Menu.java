package model;

import javax.swing.JOptionPane;

public class Menu {

	private Object[] possibleValues = { "Currency", "Measurements" };
	private Object[] possibleValuesCurrency = { "MXN to USD", "MXN to JP YEN", "MXN to EUR", "MXN to POUNDS",
			"MXN to WONS", "USD to MXN", "JP YEN to MXN", "EUR to MXN", "POUNDS to MXN", "WONS to MXN" };
	private Object[] possibleValuesMeasurement = { "CM to Mt", "CM to Km", "CM to Dm", "CM to Mm", "CM to Inch",
			"CM to Foot", "Mt to CM", "Km to CM", "Dm to CM", "Mm to CM", "Inch to Cm", "Foot to CM" };

	private String optionSelected;
	private String optionSelectedCurrency;
	private String optionSelectedMeasurement;

	private boolean rS;

	public void MenuStart() {
		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
				null, possibleValues, possibleValues[0]);
		this.optionSelected = (String) selectedValue;
	}

	public String getMenuStart() {
		// TODO Auto-generated method stub
		return optionSelected;
	}

	public void MenuCurrency() {
		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
				null, possibleValuesCurrency, possibleValuesCurrency[0]);
		this.optionSelectedCurrency = (String) selectedValue;
	}

	public String getMenuCurrency() {
		// TODO Auto-generated method stub
		return optionSelectedCurrency;
	}

	public void MenuMeasurement() {
		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
				null, possibleValuesMeasurement, possibleValuesMeasurement[0]);
		this.optionSelectedMeasurement = (String) selectedValue;
	}

	public String getMenuMeasurement() {
		// TODO Auto-generated method stub
		return optionSelectedMeasurement;
	}

	public void result(double result, double OValue, String FS1, String FS2) {
		JOptionPane.showInternalMessageDialog(null, "The Result is: " + OValue + FS1 + " to " + result + FS2,
				"information", JOptionPane.INFORMATION_MESSAGE);
	}

	public void IsEmpty() {
		// TODO Auto-generated method stub
		JOptionPane.showInternalMessageDialog(null, "Is empty or not a number", "information",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void Closed() {
		// TODO Auto-generated method stub
		JOptionPane.showInternalMessageDialog(null, "You have closed the program bye!", "information",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean Anewprogram() {
		int Reset = JOptionPane.showConfirmDialog(null, "Do you want to Start a new program?", "choose one", JOptionPane.YES_NO_OPTION);
		if (Reset == JOptionPane.YES_OPTION)
			rS = true;
		else if (Reset == JOptionPane.NO_OPTION)
			rS = false;
		return rS;
	}
}
