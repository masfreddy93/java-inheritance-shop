package generation.italy.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Prodotto[] products= new Prodotto[3];
		
		
		System.out.println("Catalogo prodotti");
		
		
		for(int i = 0; i < products.length; i++) {
			
			System.out.println("Cosa stai inserendo? Digita 1 per 'Smartphone', digita 2 per 'Televisore' o digita 3 per 'Cuffie'");
			int numScelto = sc.nextInt();
			System.out.println("Numero digitato: " + numScelto);
			
			if(numScelto == 1 || numScelto == 2 || numScelto == 3) {
				System.out.println("Numero valido");
			} else {
				System.out.println("Hai inserito un numero non valido");
			}
			
			
			System.out.println("-------------");
			
			
			Prodotto p = null;

			if(numScelto == 1) {
				System.out.println("Inserire dati per smartphone");
				System.out.println("Codice: ");
				int codice = sc.nextInt();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Marca: ");
				String marca = sc.nextLine();
				System.out.println("Prezzo: ");
				int prezzo = sc.nextInt();
				System.out.println("Iva: ");
				int iva = sc.nextInt();
				System.out.println("Codice IMEI: ");
				int codiceImei = sc.nextInt();
				System.out.println("Memoria: ");
				int memoria = sc.nextInt();
				p = new Smartphone(codice, nome, marca, prezzo, iva, codiceImei, memoria);
				
			}else if(numScelto == 2) {
				System.out.println("Inserire dati per televisore");
				System.out.println("Codice: ");
				int codice = sc.nextInt();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Marca: ");
				String marca = sc.nextLine();
				System.out.println("Prezzo: ");
				int prezzo = sc.nextInt();
				System.out.println("Iva: ");
				int iva = sc.nextInt();
				System.out.println("Larghezza: ");
				int larghezza = sc.nextInt();
				System.out.println("Altezza: ");
				int altezza = sc.nextInt();
				System.out.println("Profondità: ");
				int profondita = sc.nextInt();
				System.out.println("è smart(true / false): ");
				boolean smart = sc.nextBoolean();
				p = new Televisore(codice, nome, marca, prezzo, iva, larghezza, altezza, profondita, smart);
			}else {
				System.out.println("Inserire dati per cuffie");
				System.out.println("Codice: ");
				int codice = sc.nextInt();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Marca: ");
				String marca = sc.nextLine();
				System.out.println("Prezzo: ");
				int prezzo = sc.nextInt();
				System.out.println("Iva: ");
				int iva = sc.nextInt();
				System.out.println("Colore: ");
				String colore = sc.nextLine();
				System.out.println("è wireless(true / false): ");
				boolean wireless = sc.nextBoolean();
				p = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);
			}
			
			products[i] = p;
			
			System.out.println("-------------");
		}
		
		System.out.println(Arrays.toString(products));
		
		sc.close();
		
		
		
	}
}
