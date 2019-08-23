package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();		
	}
	
//	public void add(int voto, String corso, LocalDate data) {
//		
//	}
	
	
	//Meglio questo perche se si vuole modificare qualcosa non bisogna modificare tutto il metodo
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
}
