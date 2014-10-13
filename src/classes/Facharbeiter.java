package classes;

public class Facharbeiter extends Arbeiter {
	private boolean meister;
	
	public Facharbeiter() {
		super();
		meister = false;
	}
	
	public Facharbeiter(String vn, String nn, int al, String be, String ab, boolean m) {
		super(vn, nn, al, be, ab);
		meister = m;
	}
	
	public String toString() {
		return super.toString() + ", " + meister;
	}
}