package view;

import java.awt.Color;

public enum Cores {
	
	VERMELHO(Color.BLACK),
	LARANJA(Color.BLACK), 
	AMARELO(Color.BLACK), 
	VERDE(Color.BLACK), 
	AZUL(Color.BLACK), 
	INDIGO(Color.BLACK), 
	VIOLETA(Color.BLACK);
	
	Color cor;
	private Cores(Color cor) {
		this.cor = cor;
	}
	
	public Color getCor() {
		return cor;
	}
	
	public Cores next() {
		return values()[ (ordinal()+1) % values().length ];
	}
	

}