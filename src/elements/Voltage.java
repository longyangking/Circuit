package elements;

public class Voltage {
	private double realV, imagV;
	public Voltage(){
		this.realV = 0; this.imagV = 0;
	}
	public Voltage(double realv, double imagv){
		this.realV = realv; this.imagV = imagv;
	}
	public double getRealV() {
		return realV;
	}
	public void setRealV(double realV) {
		this.realV = realV;
	}
	public double getImagV() {
		return imagV;
	}
	public void setImagV(double imagV) {
		this.imagV = imagV;
	}
	
}
