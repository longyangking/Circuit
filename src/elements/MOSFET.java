package elements;

public class MOSFET {
	/**
	 * MOSFET transistor model parameters
	 */
	private double Cbd, Cgdo, Cgso, Fc, Is, Kp, L, Mj, N, Pb, Rb, Rd, Rds, Rg, Rs, Tnom;
	private double Vto, W, GAMMA, PHI, LAMBDA;
	/**
	 * MOSFET with default parameters
	 */
	public MOSFET(){
		this.Cbd = 0;
		this.Cgdo = 0;
		this.Cgso = 0;
		this.Fc = 0.5;
		this.Is = Math.pow(10,-13);
		this.Kp = 2*Math.pow(10, -5);
		this.L = 50*Math.pow(10, -6);
		this.Mj = 0.5;
		this.N = 1;
		this.Pb = 0.75;
		this.Rb = 0;
		this.Rd = 0;
		this.Rds = Double.NaN;
		this.Rg = 0;
		this.Rs = 0;
		this.Tnom = 298.15;
		this.Vto = 0;
		this.W = 50*Math.pow(10, -6);
		this.GAMMA = 0;
		this.PHI = 0.5;
		this.LAMBDA = 0;
	}
	/**
	 * Bulk-drain zero-bias capacitance (F/m)
	 * @return
	 */
	public double getCbd() {
		return Cbd;
	}
	public void setCbd(double cbd) {
		Cbd = cbd;
	}
	/**
	 * Gate-drain overlap capacitance (F/m)
	 * @return
	 */
	public double getCgdo() {
		return Cgdo;
	}
	public void setCgdo(double cgdo) {
		Cgdo = cgdo;
	}
	/**
	 * Gate-source overlap capacitance (F/m)
	 * @return
	 */
	public double getCgso() {
		return Cgso;
	}
	public void setCgso(double cgso) {
		Cgso = cgso;
	}
	/**
	 * Capacitance factor
	 * @return
	 */
	public double getFc() {
		return Fc;
	}
	public void setFc(double fc) {
		Fc = fc;
	}
	/**
	 * Bulk junction saturation current (A)
	 * @return
	 */
	public double getIs() {
		return Is;
	}
	public void setIs(double is) {
		Is = is;
	}
	/**
	 * Trans-conductance parameter (A/V^2)
	 * @return
	 */
	public double getKp() {
		return Kp;
	}
	public void setKp(double kp) {
		Kp = kp;
	}
	/**
	 * Gate length (m)
	 * @return
	 */
	public double getL() {
		return L;
	}
	public void setL(double l) {
		L = l;
	}
	/**
	 * Bulk junction grading coefficient
	 * @return
	 */
	public double getMj() {
		return Mj;
	}
	public void setMj(double mj) {
		Mj = mj;
	}
	/**
	 * Bulk junction ideality factor
	 * @return
	 */
	public double getN() {
		return N;
	}
	public void setN(double n) {
		N = n;
	}
	/**
	 * Bulk junction potential (V)
	 * @return
	 */
	public double getPb() {
		return Pb;
	}
	public void setPb(double pb) {
		Pb = pb;
	}
	/**
	 * Bulk resistance (omega)
	 * @return
	 */
	public double getRb() {
		return Rb;
	}
	public void setRb(double rb) {
		Rb = rb;
	}
	/**
	 * Drain resistance (omega)
	 * @return
	 */
	public double getRd() {
		return Rd;
	}
	public void setRd(double rd) {
		Rd = rd;
	}
	/**
	 * Drain-source resistance (omega)
	 * @return
	 */
	public double getRds() {
		return Rds;
	}
	public void setRds(double rds) {
		Rds = rds;
	}
	/**
	 * Gate resistance (omega)
	 * @return
	 */
	public double getRg() {
		return Rg;
	}
	public void setRg(double rg) {
		Rg = rg;
	}
	/**
	 * Source resistance (omega)
	 * @return
	 */
	public double getRs() {
		return Rs;
	}
	public void setRs(double rs) {
		Rs = rs;
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
	 * Zero-bias threshold voltage (V)
	 * @return
	 */
	public double getVto() {
		return Vto;
	}
	public void setVto(double vto) {
		Vto = vto;
	}
	/**
	 * Gate width (m)
	 * @return
	 */
	public double getW() {
		return W;
	}
	public void setW(double w) {
		W = w;
	}
	/**
	 * Bulk threshold parameter (V^0.5)
	 * @return
	 */
	public double getGAMMA() {
		return GAMMA;
	}
	public void setGAMMA(double gAMMA) {
		GAMMA = gAMMA;
	}
	/**
	 * Surface potential (V)
	 * @return
	 */
	public double getPHI() {
		return PHI;
	}
	public void setPHI(double pHI) {
		PHI = pHI;
	}
	/**
	 * Channel-length modulation (1/V)
	 * @return
	 */
	public double getLAMBDA() {
		return LAMBDA;
	}
	public void setLAMBDA(double lAMBDA) {
		LAMBDA = lAMBDA;
	}
}
