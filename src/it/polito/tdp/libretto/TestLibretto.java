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

	}

}
