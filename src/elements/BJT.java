package elements;

public class BJT {
	/**
	 * Bipolar transistor model parameters
	 */
	private double Bf, Br, Cjc, Cje, Fc, Ikf, Ikr, Is, Isc, Ise, Mjc, Mje, Nc, Ne, Nf, Nr, Rb;
	private double Rbm, Rc, Re, Tnom, Vaf, Var, Vjc, Vje;
	/**
	 * Bipolar junction transistor with default parameters
	 */
	public BJT(){
		this.Bf = 100;
		this.Br = 1;
		this.Cjc = 0;
		this.Cje = 0;
		this.Fc = 0.5;
		this.Ikf = Double.NaN;
		this.Ikr = Double.NaN;
		this.Is = Math.pow(10, -15);
		this.Isc = 0;
		this.Ise = 0;
		this.Mjc = 1.0/3;
		this.Mje = 1.0/3;
		this.Nc = 2;
		this.Ne = 1.4;
		this.Nf = 1;
		this.Nr = 1;
		this.Rb = 0;
		this.Rbm = 0;
		this.Rc = 0;
		this.Re = 0;
		this.Tnom = 298.15;
		this.Vaf = Double.NaN;
		this.Var = Double.NaN;
		this.Vjc = 0.71;
		this.Vje = 0.71;
	}
	/**
	 * Ideal forward current gain
	 * @return
	 */
	public double getBf() {
		return Bf;
	}
	public void setBf(double bf) {
		Bf = bf;
	}
	/**
	 * Ideal reverse current gain
	 * @return
	 */
	public double getBr() {
		return Br;
	}
	public void setBr(double br) {
		Br = br;
	}
	/**
	 * Base-collector zero-bias depletion capacitance
	 * @return
	 */
	public double getCjc() {
		return Cjc;
	}
	public void setCjc(double cjc) {
		Cjc = cjc;
	}
	/**
	 * Base-emitter zero-bias depletion capacitance
	 * @return
	 */
	public double getCje() {
		return Cje;
	}
	public void setCje(double cje) {
		Cje = cje;
	}
	/**
	 * Breakdown current
	 * @return
	 */
	public double getFc() {
		return Fc;
	}
	public void setFc(double fc) {
		Fc = fc;
	}
	/**
	 * Corner for forward high-current roll-off
	 * @return
	 */
	public double getIkf() {
		return Ikf;
	}
	public void setIkf(double ikf) {
		Ikf = ikf;
	}
	/**
	 * Corner for reverse high-current roll-off
	 * @return
	 */
	public double getIkr() {
		return Ikr;
	}
	public void setIkr(double ikr) {
		Ikr = ikr;
	}
	/**
	 * Saturation current
	 * @return
	 */
	public double getIs() {
		return Is;
	}
	public void setIs(double is) {
		Is = is;
	}
	/**
	 * Base-collector leakage saturation current
	 * @return
	 */
	public double getIsc() {
		return Isc;
	}
	public void setIsc(double isc) {
		Isc = isc;
	}
	/**
	 * Base-emitter leakage saturation current
	 * @return
	 */
	public double getIse() {
		return Ise;
	}
	public void setIse(double ise) {
		Ise = ise;
	}
	/**
	 * Base-collector grading coefficient
	 * @return
	 */
	public double getMjc() {
		return Mjc;
	}
	public void setMjc(double mjc) {
		Mjc = mjc;
	}
	/**
	 * Base-emitter grading coefficient
	 * @return
	 */
	public double getMje() {
		return Mje;
	}
	public void setMje(double mje) {
		Mje = mje;
	}
	/**
	 * Base-collector ideality factor
	 * @return
	 */
	public double getNc() {
		return Nc;
	}
	public void setNc(double nc) {
		Nc = nc;
	}
	/**
	 * Base-emitter ideality factor
	 * @return
	 */
	public double getNe() {
		return Ne;
	}
	public void setNe(double ne) {
		Ne = ne;
	}
	/**
	 * Forward ideality factor
	 * @return
	 */
	public double getNf() {
		return Nf;
	}
	public void setNf(double nf) {
		Nf = nf;
	}
	/**
	 * Reverse ideality factor
	 * @return
	 */
	public double getNr() {
		return Nr;
	}
	public void setNr(double nr) {
		Nr = nr;
	}
	/**
	 * Base resistance
	 * @return
	 */
	public double getRb() {
		return Rb;
	}
	public void setRb(double rb) {
		Rb = rb;
	}
	/**
	 * Minimum base resistance
	 * @return
	 */
	public double getRbm() {
		return Rbm;
	}
	public void setRbm(double rbm) {
		Rbm = rbm;
	}
	/**
	 * Collector resistance
	 * @return
	 */
	public double getRc() {
		return Rc;
	}
	public void setRc(double rc) {
		Rc = rc;
	}
	/**
	 * Emitter resistance
	 * @return
	 */
	public double getRe() {
		return Re;
	}
	public void setRe(double re) {
		Re = re;
	}
	/**
	 * Device temperature
	 * @return
	 */
	public double getTnom() {
		return Tnom;
	}
	public void setTnom(double tnom) {
		Tnom = tnom;
	}
	/**
	 * Forward Early voltage
	 * @return
	 */
	public double getVaf() {
		return Vaf;
	}
	public void setVaf(double vaf) {
		Vaf = vaf;
	}
	/**
	 * Reverse Early voltage
	 * @return
	 */
	public double getVar() {
		return Var;
	}
	public void setVar(double var) {
		Var = var;
	}
	/**
	 * Base-collector built-in potential
	 * @return
	 */
	public double getVjc() {
		return Vjc;
	}
	public void setVjc(double vjc) {
		Vjc = vjc;
	}
	/**
	 * Base-emitter built-in potential
	 * @return
	 */
	public double getVje() {
		return Vje;
	}
	public void setVje(double vje) {
		Vje = vje;
	}
}
