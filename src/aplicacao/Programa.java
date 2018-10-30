package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		//System.out.println("Área total: "+totalArea(minhasFormas));
		//System.out.println("Área total: "+totalArea(meusCirculos));
		
		/*
		 * Exemplo de covariância[permite somente get] e 
		 * contravariância[permite somente put] 	  
		 */
		List<Integer> meusInts = Arrays.asList(1, 2, 3, 4);
		List<Double> meusDoubs = Arrays.asList(3.14, 6.28, 7.25);
		List<Object> meusObjs = new ArrayList<Object>();
		
		copy(meusInts, meusObjs);
		printList(meusObjs);
		copy(meusDoubs, meusObjs);
		printList(meusObjs);		
	}
	
	//Irá aceitar qualquer lista que seja um tipo de Forma
	public static double totalArea(List<? extends Forma> list) {
		double soma = 0.0;
		for(Forma s : list) {
			soma += s.area();
		}
		return soma;
	}
	
	//Lista de Origem: é uma lista de qualquer tipo numérico
	//Lista de Destino: é uma genérica que recebe qualquer objeto
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for (Number numero : origem) {
			destino.add(numero);
		}
	}
	
	public static void printList(List<?> lista) {
		for(Object item : lista) {
			System.out.print(item+" ");	
		}
		System.out.println();
	}
	
	

}
