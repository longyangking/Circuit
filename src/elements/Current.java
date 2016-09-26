package elements;

public class Current {
	private double ReI, ImI;
	public Current(){
		this.ReI = 0; this.ImI = 0;
	}
	public Current(double rei, double imi){
		this.ReI = rei; this.ImI = imi;
	}
	/**
	 * Get Real Part of Current
	 * @return
	 */
	public double getReI() {
		return ReI;
	}
	/**
	 * Set Real Part of Current
	 * @param reI Real Part of Current
	 */
	public void setReI(double reI) {
		ReI = reI;
	}
	/**
	 * Get Imag Part of Current
	 * @return
	 */
	public double getImI() {
		return ImI;
	}
	/**
	 * Set Imag Part of Current
	 * @param imI
	 */
	public void setImI(double imI) {
		ImI = imI;
	}
}
