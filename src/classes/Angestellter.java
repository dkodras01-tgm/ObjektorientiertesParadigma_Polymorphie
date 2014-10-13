package classes;

public class Angestellter extends Person {
	private String ausbildung;
	
	public Angestellter() {
		super();
		ausbildung = "unbekannt";
	}
	
	public Angestellter(String vn, String nn, int al, String aus) {
		super(vn, nn, al);
		ausbildung = aus;
	}
	
	public String toString() {
		return super.toString() + ", " + ausbildung;
	}
}