package org.generation.italy.model;

public class Banano extends Albero {

	public Banano(String nome, int maturazione) {
		super(nome, maturazione);
	}

	//SOVRASCRIZIONE METODO 
	@Override
	public void faiFrutto() {
		System.out.println("Banana");
		
	}

	@Override
	public String toString() {
		return "Banano [nome=" + nome + ", maturazione=" + maturazione + "]";
	}
	

	
	
	
}
