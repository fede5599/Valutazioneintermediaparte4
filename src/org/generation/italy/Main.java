package org.generation.italy;

import java.util.ArrayList;
import org.generation.italy.model.Albero;
import org.generation.italy.model.Banano;
import org.generation.italy.model.Melo;
import org.generation.italy.model.Pesco;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fai un esempio di classe astratta e di una sua sottoclasse (possibilmente non
		 * uno di quelli visti a lezione 😉); fai un esempio di polimorfismo in cui
		 * vengono utilizzate tali classi
		 */
		
		Banano b=new Banano("Rocco", 60);
		System.out.println(b.toString());
		b.faiFrutto();			//è definito nella sottoclasse		
		b.matura();
		
		System.out.println("\n");
		Pesco p=new Pesco("JLo",54);	
		System.out.println(p.toString());
		p.faiFrutto();
		p.matura();
		
		System.out.println("\n");
		Melo m=new Melo("Ciccina",72);	
		System.out.println(m.toString());
		m.faiFrutto();
		m.matura();
		
		ArrayList<Albero> elencoAlberi =new ArrayList<Albero>();
		elencoAlberi.add(b);
		elencoAlberi.add(p);
		elencoAlberi.add(m);

		elencoAlberi.add(new Banano("Max", 30));
		elencoAlberi.add(new Pesco("Mia", 31));
		elencoAlberi.add(new Melo("Dieltta", 35));

		
		System.out.println("\n\nFRUTTI DEGLI ALBERI NELL'ELENCO ");
		for(Albero anim:elencoAlberi) {
			anim.faiFrutto();
			anim.matura();  		
			System.out.println();
		}
	}
	
}
