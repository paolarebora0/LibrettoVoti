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
	
//	public void StampaVoti(int voto) { //Stampa a video
//		
//	}
//	
//	public String StampaVoti2(int voto) { //Stampa a stringa
//		
//	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti punteggio da ricercare
	 * @return lista di {@link Voto } aventi quel punteggio (eventualmente vuota)
	 */
	//METODO MIGLIORE
	public List<Voto> cercaVoti (int punti){ //Stampa in una lista
		
		List<Voto> result = new ArrayList<Voto>();
		
		for(Voto v: this.voti) {
			if(v.getPunti()==punti) //dato un voto restituisce un oggetto Voto con quel voto
				result.add(v);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
