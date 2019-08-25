package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		
		libr.add( new Voto("Analisi I", 30, LocalDate.of(2017, 1, 15)));
		libr.add( new Voto("Analisi II", 21, LocalDate.of(2018, 1, 25)));
		libr.add( new Voto("Fisica I", 25, LocalDate.of(2017, 6, 10)));
		libr.add( new Voto("Fisica II", 28, LocalDate.of(2018, 9, 3)));
		libr.add( new Voto("Geometria", 18, LocalDate.of(2017, 9, 1)));
		libr.add( new Voto("Economia", 20, LocalDate.of(2018, 1, 28)));
		libr.add( new Voto("Ricerca Operativa", 25, LocalDate.of(2018, 6, 5)));
		libr.add( new Voto("Complementi di Economia", 24, LocalDate.of(2018, 2, 15)));
		libr.add( new Voto("Logistica", 25, LocalDate.of(2019, 2, 1)));
		libr.add( new Voto("Programmazione a Oggetti", 27, LocalDate.of(2019, 1, 25)));

		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);
		
		Voto a1 = libr.cercaEsame("Analisi I");
		Voto a3 = libr.cercaEsame("Analisi III");
		System.out.println(a1);
		System.out.println(a3);
		
		Voto giusto = new Voto("Geometria", 18, LocalDate.now());
		Voto sbagliato = new Voto("Geometria", 28, LocalDate.now());
		Voto mancante = new Voto("Merendine", 30, LocalDate.now());
		
		System.out.format("Il voto %s e' %s\n",
				giusto.toString(), libr.esisteGiaVoto(giusto));
		System.out.format("Il voto %s e' %s\n",
				sbagliato.toString(), libr.esisteGiaVoto(sbagliato));
		System.out.format("Il voto %s e' %s\n",
				mancante.toString(), libr.esisteGiaVoto(mancante));
		
		System.out.format("\nIl voto %s e' in conflitto %s\n",
				giusto.toString(), libr.votoConflitto(giusto));
		System.out.format("Il voto %s e' in conflitto %s\n",
				sbagliato.toString(), libr.votoConflitto(sbagliato));
		System.out.format("Il voto %s e' in conflitto %s\n\n",
				mancante.toString(), libr.votoConflitto(mancante));
		
		libr.add(giusto);
		libr.add(sbagliato);
		libr.add(mancante);
		
		System.out.println(libr.toString());
		
		
		System.out.println("\n*** Migliora il libretto ***");
		
		Libretto migliore = libr.librettoMigliorato();
		System.out.println(libr.toString());
		System.out.println(migliore.toString());
		
		
		

	}

}
