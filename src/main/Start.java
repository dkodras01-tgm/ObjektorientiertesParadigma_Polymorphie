package main;

import java.util.ArrayList;

import classes.Angestellter;
import classes.Arbeiter;
import classes.Facharbeiter;
import classes.Person;
import classes.Verkaeufer;

public class Start {

	public static void main(String[] args) {
		
		//Deklarierte Typen
		Person p = new Person("Herbert", "Haas", 35);
		Arbeiter arb = new Arbeiter("Max", "Wutscher", 46, "Systemadministrator", "Netzwerktechnik");
		Facharbeiter fab = new Facharbeiter("Lisa", "Kohl", 40, "Gießerei", "Formenbau", true);
		Angestellter ang = new Angestellter("Toni", "Müller", 37, "Elektrotechniker");
		Verkaeufer vk = new Verkaeufer("Verena", "Gemüse", 35, "HTL", 10);
		
		//Deklarierte und Dynamische Typen
		ArrayList<Person> personen = new ArrayList<Person>();
		personen.add(p);
		personen.add(arb);
		personen.add(fab);
		personen.add(ang);
		personen.add(vk);
		
		for(Person pers: personen) {
			System.out.println(pers.toString());
			//zur Laufzeit wird die richtige toString() Methode aufgerufen
		}
	}
}