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
	
	
	/**
	 * Ricerca un {@link Voto} relativo al corso di cui e' specificato il nome
	 *
	 * @param nomeEsame nome del corso da ricercare
	 * @return il{@link Voto} corrispondete, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame(String nomeEsame) {
		
		Voto voto = new Voto(nomeEsame, 0, null);
		int pos = this.voti.indexOf(voto);
		if(pos==-1)
			return null;
		else	
			return this.voti.get(pos);
	}
	
	
	/**
	 * Dato un {@link Voto}, determina se esiste gia' un voto con uguale
	 * corso ed uguale punteggio.
	 * 
	 * @param v
	 * @return  {@code true} se ha trovato un corso e punteggio uguali,
	 * 			{@code false} se non ha trovato il corso, oppure con
	 * 			voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else 
			return (v.getPunti()==this.voti.get(pos).getPunti());
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
