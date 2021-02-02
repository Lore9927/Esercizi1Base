package main;

import java.util.Scanner;

public class Esercizio3 
{

	public static void main(String[] args) 
	{
		//Realizzare un programma java che chieda all'utente di scrivere una frase e che utilizzi 
		//i metodi indexOf() e substring() della classe String per stampare a video la prima parola 
		//inserita nella frase. Per "prima parola" si intende la prima parola che precede uno spazio  " ".
		
		String frase = "";
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci una frase:");
		frase = tastiera.nextLine();
		System.out.println(frase.substring(0,frase.indexOf(" ")));
		tastiera.close();


	}

}
