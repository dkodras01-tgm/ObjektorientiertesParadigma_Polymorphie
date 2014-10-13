package classes;

public class Person {
	private String vname, nname;
	private int alter;
	
	public Person() {
		vname = "Max";
		nname = "Mustermann";
		alter = 0;
	}
	
	public Person(String v, String n, int a) {
		vname = v;
		nname = n;
		alter = a;
	}
	
	public String toString() {
		return "Person: " + vname + ", " + nname + ", " + alter;
	}
}