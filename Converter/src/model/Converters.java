package model;

import javax.swing.JOptionPane;

public class Converters extends Menu {
	private String ProgramSelected;
	private String InputValue;
	private double InputDoubleValue;
	private String Active;

	public void ProgramSelector(String Selection) {
		// TODO Auto-generated method stub
		if (Selection == "CM to ---")
			this.ProgramSelected = "Measurement";
		else if (Selection == "Currency to ---")
			this.ProgramSelected = "Currency";
	}

	public String getProgramSelector() {
		// TODO Auto-generated method stub
		return ProgramSelected;
	}

	public void InputValue() {
		this.InputValue = JOptionPane.showInputDialog("Please input a value");
		this.InputDoubleValue = Double.parseDouble(InputValue);
	}

	public Double getInputDoubleValue() {
		return InputDoubleValue;
	}

	public void ConverterSelected(String ProgramSelected, Double InputDoubleValue) {
		if (this.InputDoubleValue != 0.0 && this.ProgramSelected == "Currency")
			this.Active = "Currency Selected";
		else if (this.InputDoubleValue != 0.0 && this.ProgramSelected == "Measurement")
			this.Active = "Measurement Selected";
	}

	public String getConverterSelected() {
		// TODO Auto-generated method stub
		return Active;
	}
}
