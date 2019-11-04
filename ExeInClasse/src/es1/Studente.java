package es1;

import java.util.*;
public class Studente implements Comparable{

	private String matricola;
	private String nome;
	private String cognome;
	private int eta;
	private String universita;
	
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getUniversita() {
		return universita;
	}

	public void setUniversita(String universita) {
		this.universita = universita;
	}
	public Studente() {
		
	}
	public Studente(String matricola, String universita, String nome, String cognome, int eta) {
		this.matricola = matricola;
		this.universita = universita;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj) {return true;}
		if(!(obj instanceof Studente)) {return false;}
		
		Studente st = (Studente) obj;
		// faccio questo cast per convertire l'oggetto in studente
		
		return universita == st.getUniversita() && nome.equals(st.getNome()) 
				&& matricola.equals(st.getMatricola()) && cognome.equals(st.getCognome()) && (eta == st.getEta());
		
	}


	public int compareTo(Object obj) throws ClassCastException  {
		
		// bisogna fare un confronto con ipotesi
		if (!(obj instanceof Studente))throw new
		ClassCastException("Mi aspetto uno studente");
		
		Studente st = (Studente) obj;
		
			if(!this.universita.equals(st.getUniversita())){
				// crea una nuova classe eccezione
				return -2;	
			}
		
			if(this.matricola.compareTo(st.getMatricola())< 0)
				return -1; 
		
			if(this.matricola.compareTo(st.getMatricola())> 0)
				return 1;
		
		return 0;	
	}
	
}
