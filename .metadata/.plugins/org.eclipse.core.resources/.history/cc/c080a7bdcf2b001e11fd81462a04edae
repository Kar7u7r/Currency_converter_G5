package model;

public class test extends Converters {
	public static void main(String[] args) {
		Menu m = new Menu();
		Converters c = new Converters();
		FinalProgram f = new FinalProgram();
		m.MenuStart();
		c.ProgramSelector(m.getMenuStart());
		c.InputValue();
		c.ConverterSelected(c.getProgramSelector(), c.getInputDoubleValue());
		f.FinalSelection(c.getConverterSelected(), c.getInputDoubleValue());
		m.result(f.getFinaSelection(), c.getInputDoubleValue(), f.getFS1(), f.getFS2());
	}
}
