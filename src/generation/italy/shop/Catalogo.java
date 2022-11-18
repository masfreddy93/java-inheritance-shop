package generation.italy.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
//		Televisore t = new Televisore(72621, "tv", "samsung", 350, 20, 250, 170, 30, true);
//		String res = t.toString();
//		System.out.println("Televisore 1: " + res);
//		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("-------------");
//		System.out.println("inserire dati per televisore");
//		Televisore t2 = new Televisore(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), true);
//		res = t2.toString();
//		System.out.println("Televisore 2: " + res);
		
//		System.out.println("-------------");
//		System.out.println("inserire dati per televisore");
//		Prodotto p = new Televisore(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), true);
//		res = p.toString();
//		System.out.println("Televisore 2: " + res);
		
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
				p = new Smartphone(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				String res = p.toString();
//				System.out.println("Smartphone: " + res);
			}else if(numScelto == 2) {
				System.out.println("Inserire dati per televisore");
				p= new Televisore(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextBoolean());
				String res = p.toString();
//				System.out.println("Smartphone: " + res);
			}else {
				System.out.println("Inserire dati per cuffie");
				p = new Cuffie(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextLine(), sc.nextBoolean());
				String res = p.toString();
//				System.out.println("Smartphone: " + res);
			}
			
			products[i] = p;
			
			
		}
		
		System.out.println(Arrays.toString(products));
		
		sc.close();
		
		
		
	}
}
