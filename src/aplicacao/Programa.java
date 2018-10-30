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
	
		List<Circulo> meusCirculos = new ArrayList<>();
		meusCirculos.add(new Circulo(1.5));
		meusCirculos.add(new Circulo(2.5));
		meusCirculos.add(new Circulo(3.0));
		
		System.out.println("Área total: "+totalArea(minhasFormas));
		System.out.println("Área total: "+totalArea(meusCirculos));
	}
	
	//Irá aceitar qualquer lista que seja um tipo de Forma
	public static double totalArea(List<? extends Forma> list) {
		double soma = 0.0;
		for(Forma s : list) {
			soma += s.area();
		}
		return soma;
	}

}
