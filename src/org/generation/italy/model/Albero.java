package org.generation.italy.model;

public abstract class Albero {
	protected String nome;
	protected int maturazione;

	// GENERO GETTER DI NOME E MATURAZIONE
	public String getNome() {
		return nome;
	}

	public int getMaturazione() {
		return maturazione;
	}

	// CREO IL COSTRUTTORE
	public Albero(String nome, int maturazione) {
		super();
		this.nome = nome;
		this.maturazione = maturazione;
	}

	public void matura() {
		System.out.println("Il frutto è maturato");
	}

	@Override
	public String toString() {
		return "Albero [nome=" + nome + ", maturazione=" + maturazione + "]";
	}

	// OGNI ALBERO GENERA UN FRUTTO, ma il modo con cui lo fa dipende dal tipo di
	// animale (sottoclasse)
	// metodo astratto: non è presente la definizione del blocco di codice da
	// eseguire
	// Saranno le sottoclassi di Animale a implementare il metodo
	// Quando si definisce un metodo astratto, si obbligano le sottoclassi a fornire
	// l'implementazione del metodo
	public abstract void faiFrutto();

}
