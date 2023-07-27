package model;

public class program {
	private Menu m = new Menu();
	private Converters c = new Converters();
	private Selection f = new Selection();

	public void ResetProgram(boolean Rs) {
		if (Rs == true) {
			m.MenuStart();
			c.ProgramSelector(m.getMenuStart());
			c.InputValue();
			c.ConverterSelected(c.getProgramSelector(), c.getInputDoubleValue());
			f.FinalSelection(c.getConverterSelected(), c.getInputDoubleValue());
			m.result(f.getFinaSelection(), c.getInputDoubleValue(), f.getFS1(), f.getFS2());
			ResetProgram(m.Anewprogram());
		} else {
			m.Closed();
			System.exit(0);
			Rs = false;
			System.out.println("Hello World!!!!!!!");
		}
	}

}
