package model;

public class Currency extends Menu {

	private String currencyCon;
	private double convertedvalue;
	private String symbol;
	private String inSymbol;

	public void CurrencyMenu(double DoubleValue) {
		MenuCurrency();
		if (getMenuCurrency() == null) {
			Closed();
			System.exit(0);
		}
		currencyCon = getMenuCurrency();

		if (currencyCon == null) {
			currencyCon = "null";
		}

		switch (currencyCon) {
		case "MXN to USD":
			convertedvalue = DoubleValue * .059;
			inSymbol = "  $ ";
			symbol = " $";
			break;
		case "MXN to JP YEN":
			convertedvalue = DoubleValue * 8.34;
			inSymbol = "  ¥ ";
			symbol = " $";
			break;
		case "MXN to EUR":
			convertedvalue = DoubleValue * .053;
			inSymbol = "  € ";
			symbol = " $ ";
			break;
		case "MXN to POUNDS":
			convertedvalue = DoubleValue * .046;
			inSymbol = "  £ ";
			symbol = " $";
			break;
		case "MXN to WONS":
			convertedvalue = DoubleValue * 75.63;
			inSymbol = "  ₩ ";
			symbol = " $";
			break;
		case "USD to MXN":
			convertedvalue = DoubleValue / .059;
			symbol = "  $";
			inSymbol = " $ ";
			break;
		case "JP YEN to MXN":
			convertedvalue = DoubleValue / 8.34;
			symbol = "  ¥";
			inSymbol = " $ ";
			break;
		case "EUR to MXN":
			convertedvalue = DoubleValue / .053;
			symbol = "  €";
			inSymbol = " $ ";
			break;
		case "POUNDS to MXN":
			convertedvalue = DoubleValue / .046;
			symbol = "  £";
			inSymbol = " $ ";
			break;
		case "WONS to MXN":
			convertedvalue = DoubleValue / 75.63;
			symbol = "  ₩";
			inSymbol = " $ ";
			break;
		default:
			convertedvalue = DoubleValue;
			break;
		}

	}

	public double getCurrencyMenuValue() {
		// TODO Auto-generated method stub
		return convertedvalue;
	}

	public String getCurrencySymbol() {
		// TODO Auto-generated method stub
		return symbol;
	}

	public String getCurrencyinSymbol() {
		// TODO Auto-generated method stub
		return inSymbol;
	}
}
