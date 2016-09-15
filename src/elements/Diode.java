package elements;

public class Diode {
	/**
	 * Diode transistor model parameters
	 */
	private double Bv, Cj0, Fc, Ibv, Ikf, Is, M, N, Nbv, Nr, Rs, Tnom, Vj;
	/**
	 * Diode with default parameters
	 */
	public Diode(){
		this.Bv = Double.NaN;
		this.Cj0 = 0;
		this.Fc = 0.5;
		this.Ibv = Math.pow(10, -9);
		this.Ikf = Double.NaN;
		this.Is = Math.pow(10, -13);
		this.M = 0.5;
		this.N = 1;
		this.Nbv = 1;
		this.Nr = 2;
		this.Rs = 0;
		this.Tnom = 298.15;
		this.Vj = 1.0;
	}
	/**
	 * Device temperature (K)
	 * @return
	 */
	public double getTnom() {
		return Tnom;
	}
	public void setTnom(double tnom) {
		Tnom = tnom;
	}
	/**
	 * Junction potential (V)
	 * @return
	 */
	public double getVj() {
		return Vj;
	}
	public void setVj(double vj) {
		Vj = vj;
	}
	/**
	 * Reverse breakdown voltage (V)
	 * @return
	 */
	public double getBv() {
		return Bv;
	}
	public void setBv(double bv) {
		Bv = bv;
	}
	/**
	 * Zero-bias junction capacitance (F)
	 * @return
	 */
	public double getCj0() {
		return Cj0;
	}
	public void setCj0(double cj0) {
		Cj0 = cj0;
	}
	/**
	 * Forward-bias capacitance coefficient
	 * @return
	 */
	public double getFc() {
		return Fc;
	}
	public void setFc(double fc) {
		Fc = fc;
	}
	/**
	 * Current at breakdown voltage (A)
	 * @return
	 */
	public double getIbv() {
		return Ibv;
	}
	public void setIbv(double ibv) {
		Ibv = ibv;
	}
	/**
	 * Corner for high-current roll-off (A)
	 * @return
	 */
	public double getIkf() {
		return Ikf;
	}
	public void setIkf(double ikf) {
		Ikf = ikf;
	}
	/**
	 * Saturation current (A)
	 * @return
	 */
	public double getIs() {
		return Is;
	}
	public void setIs(double is) {
		Is = is;
	}
	/**
	 * Grading coefficient
	 * @return
	 */
	public double getM() {
		return M;
	}
	public void setM(double m) {
		M = m;
	}
	/**
	 * Ideality factor
	 * @return
	 */
	public double getN() {
		return N;
	}
	public void setN(double n) {
		N = n;
	}
	/**
	 * Breakdown ideality factor
	 * @return
	 */
	public double getNbv() {
		return Nbv;
	}
	public void setNbv(double nbv) {
		Nbv = nbv;
	}
	/**
	 * Recombination ideality factor
	 * @return
	 */
	public double getNr() {
		return Nr;
	}
	public void setNr(double nr) {
		Nr = nr;
	}
	/**
	 * Series resistance (Omega)
	 * @return
	 */
	public double getRs() {
		return Rs;
	}
	public void setRs(double rs) {
		Rs = rs;
	}
}
