package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	private String corso;
	private int punti;
	private LocalDate data;
	
	public Voto(String corso, int voto, LocalDate data) {
		super();
		this.corso = corso;
		this.punti = voto;
		this.data = data;
	}
	
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int voto) {
		this.punti = voto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [corso=%s, voto=%s, data=%s]", corso, punti, data);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))
			return false;
		return true;
	}
	
	public Voto clone() {
		return new Voto(this.corso,this.punti,this.data);
	}
	
	
	
	
	
	
	
}
