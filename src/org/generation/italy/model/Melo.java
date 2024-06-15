package org.generation.italy.model;

public class Melo extends Albero {

	public Melo(String nome, int maturazione) {
		super(nome, maturazione);
	}

	@Override
	public void faiFrutto() {
		System.out.println("Mela");
	}

	@Override
	public String toString() {
		return "Melo [nome=" + nome + ", maturazione=" + maturazione + "]";
	}
}
