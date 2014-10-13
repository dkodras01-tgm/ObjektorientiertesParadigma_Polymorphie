package classes;

public class Arbeiter extends Person {
	private String beruf, abteilung;
	
	public Arbeiter() {
		super();
		beruf = "ungelernt";
		abteilung = "unbekannt";
	}
	
	public Arbeiter(String vn, String nn, int al, String be, String ab) {
		super(vn, nn, al);
		beruf = be;
		abteilung = ab;
	}
	
	public String toString() {
		return super.toString() + ", " + beruf + ", " + abteilung;
	}
}