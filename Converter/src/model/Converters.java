package model;

import javax.swing.JOptionPane;

public class Converters extends Menu {
	private String programSelected;
	private String inputValue;
	private double inputDoubleValue;
	private String active;
	private boolean valor;

	public void ProgramSelector(String Selection) {
		// TODO Auto-generated method stub
		if (Selection == "CM to ---")
			this.programSelected = "Measurement";
		else if (Selection == "Currency to ---")
			this.programSelected = "Currency";
		else {
			Closed();
			System.exit(0);
		}
	}

	public String getProgramSelector() {
		// TODO Auto-generated method stub
		return programSelected;
	}

	public void InputValue() {
		do {
			this.inputValue = JOptionPane.showInputDialog("Please input a value");
			try {
				valor = inputValue.isEmpty();
			} catch (Exception e) {
				System.out.println("isEmpty never recived a value");
			}
			if (valor)
				IsEmpty();
		} while (valor);
		if (inputValue == null) {
			Closed();
			System.exit(0);
		}
		try {
			this.inputDoubleValue = Double.parseDouble(inputValue);
		} catch (NumberFormatException e) {
			System.out.println("The value was a String not a Number");
			IsEmpty();
			InputValue();
		}
	}

	public Double getInputDoubleValue() {
		return inputDoubleValue;
	}

	public void ConverterSelected(String ProgramSelected, Double InputDoubleValue) {
		if (this.inputDoubleValue != 0.0 && ProgramSelected == "Currency")
			this.active = "Currency Selected";
		else if (this.inputDoubleValue != 0.0 && ProgramSelected == "Measurement")
			this.active = "Measurement Selected";
	}

	public String getConverterSelected() {
		// TODO Auto-generated method stub
		return active;
	}
}
