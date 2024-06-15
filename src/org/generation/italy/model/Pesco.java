package org.generation.italy.model;

public class Pesco extends Albero{

	public Pesco(String nome, int maturazione) {
		super(nome, maturazione);
	}

	@Override
	public void faiFrutto() {
		System.out.println("Pesca");
	}

	@Override
	public String toString() {
		return "Pesco [nome=" + nome + ", maturazione=" + maturazione + "]";
	}

}
