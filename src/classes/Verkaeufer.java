package classes;

public class Verkaeufer extends Angestellter {
	private float provision;
	
	public Verkaeufer() {
		provision = 0.0f;
	}
	
	public Verkaeufer(String vn, String nn, int al, String aus, float pro) {
		super(vn, nn, al, aus);
		provision = pro;
	}
	
	public String toString() {
		return super.toString() + ", " + provision;
	}
}