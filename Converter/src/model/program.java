package model;

public class program {
	private Menu m = new Menu();
	private Converters c = new Converters();
	private Selection f = new Selection();
	private boolean reset = true;

	public void Firstprogram() {

		do {
			m.MenuStart();
			c.ProgramSelector(m.getMenuStart());
			c.InputValue();
			c.ConverterSelected(c.getProgramSelector(), c.getInputDoubleValue());
			f.FinalSelection(c.getConverterSelected(), c.getInputDoubleValue());
			m.result(f.getFinaSelection(), c.getInputDoubleValue(), f.getFS1(), f.getFS2());
			reset = m.Anewprogram();
		} while (reset);
		if (reset==false)
			m.Closed();
	}
}
