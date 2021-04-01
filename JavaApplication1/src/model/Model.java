package model;

import java.util.ArrayList;
import java.util.List;

import entity.Desenho;
import entity.Ponto;

public class Model {
	
	static List<Ponto> pontos = new ArrayList<>();
	{
            int i = 4;
            
            if(i == 4){
                pontos.add(new Ponto(250, 250));
		pontos.add(new Ponto(350, 250));
		pontos.add(new Ponto(350, 350));
		pontos.add(new Ponto(250, 350));
            }
            if(i == 6){
            
            for(int x = 0;x<6;x++){
                pontos.add(new Ponto(250, 250));
                for(int o = 0;o<6;o++){
                    pontos.add(new Ponto(350, 250));
                }
            }
            
            
            }
            

	};
	
	Desenho desenho = new Desenho(pontos);
	
	public Model() {
	}
	
	public void makeTransformacoes(
			Ponto t,  // valor da transformação de translação
			double a  // valor do angulo de rotação
			) {
		desenho.reset();
		desenho.makeTransladar(t.x, t.y);
		desenho.makeRotacao(a);
	}
	
	public Desenho getDesenho() {
		return desenho;
	}
	
	
	

}