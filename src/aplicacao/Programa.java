package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;

public class Programa {

	//bounded wildcards
	public static void main(String[] args) {
		
		List<Forma> minhasFormas = new ArrayList<>();
		minhasFormas.add(new Retangulo(3.0,2.0));
		minhasFormas.add(new Circulo(2.0));
			
		System.out.println("Área total: "+totalArea(minhasFormas));
		
	}
	
	public static double totalArea(List<Forma> list) {
		double soma = 0.0;
		for(Forma s : list) {
			soma += s.area();
		}
		return soma;
	}

}
