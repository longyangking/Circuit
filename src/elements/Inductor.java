package elements;

public class Inductor {
	private double inductance;

	public Inductor(double inductance){
		this.setInductance(inductance);
	}
	
	public double getInductance() {
		return inductance;
	}

	public void setInductance(double inductance) {
		this.inductance = inductance;
	}
}
