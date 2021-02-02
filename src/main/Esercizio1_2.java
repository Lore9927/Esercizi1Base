package main;

import java.util.Scanner;

public class Esercizio1_2 
{

	public static void main(String[] args) 
	{
		//Realizzare un semplice programma che legga due numeri da tastiera e stampi a video la somma.
		//Realizzare una versione migliorata del programma del punto 1. che, una volta stampata la somma, 
		//chieda se si vuole procedere con una nuova operazione, e che termini l'esecuzione del programma 
		//solo quando l'utente risponde con la lettera "N".
		
		Scanner tastiera = new Scanner(System.in);
		int numero = 0;
		int somma;
		int cont;
		String risposta = "";
		do
		{
			cont = 0;
			somma = 0;
			do
			{
				System.out.println("Inserisci un numero");
				numero = Integer.parseInt(tastiera.nextLine());
				somma += numero;
				cont++;
			}
			while(cont < 2);
		
			System.out.println("Somma = " + somma + "\nVuole fare altro?\ns/n");
			risposta = tastiera.nextLine();
		}
		while(!risposta.equalsIgnoreCase("n"));
		tastiera.close();
	}

}
