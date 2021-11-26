package br.senai.arrayListMedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	
	Scanner sc;
	ArrayList<Double> arrNota = new ArrayList<Double>();
	
	double soma;
	double media;
	int numNotas = 0;
	
	public Media() {
		
		sc = new Scanner(System.in);
		
		/*arrNota.add(10.0);
		arrNota.add(5.5);
		arrNota.add(8.0);
		arrNota.add(2.5);*/
		
	}
	
	public void vidaaa() {
		
		System.out.print("DIGITE UMA NOTA OU -1 PARA ENCERRAR: ");
		
		double nota = sc.nextDouble();
		
		while(nota >= 0) {
			arrNota.add(nota);
			System.out.print("DIGITE UMA NOTA OU -1 PARA ENCERRAR: ");
			nota = sc.nextDouble();
			numNotas++;
			
		}
		System.out.println();
	}
	
	/*public void definirQntdNotas() {
		
		System.out.print("Digite a quantidade de notas desejadas: ");
		numNotas = sc.nextInt();
		System.out.println();
	}
	
	public void receberNotas() {
		
		int cont = 1;
		while (cont <= numNotas) {
			
			System.out.print("DIGITE A " + cont + "° NOTA: " );
			arrNota.add(sc.nextDouble());
			cont++;
		}
		System.out.println();
	}*/
	
	public double calcularMedia() {
		
		arrNota.forEach(nota->{
			soma += nota;
		});
		
		media = soma/numNotas;
		return media;
		
	}
	
	public void exibirNotas() {
		for (int i = 0; i < arrNota.size(); i++) {
			System.out.println("NOTA " + (i + 1) +" " + arrNota.get(i));
		}
	}

}
