package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p = new Prodotto(23782, "Pallina", "Nike", 12, 10);
		p.setIva(20);
		
		
		int priceBase = p.getPrezzo();
		System.out.println("Prezzo base: " + priceBase); //restituisce int prezzo
		
		float priceWithIva = p.getPriceWithIva();
		System.out.printf("Prezzo con iva: %.2f", priceWithIva);
		
		String res = p.toString();
		System.out.println("\n------");
		System.out.println("\nProdotto" + res); //restituisce oggetto
		
		
		Smartphone s = new Smartphone(27362, "Cellulare", "Motorola", 200, 20, 283763, 256);
		res = s.toString();
		System.out.println("\n------");
		System.out.println("\nSmartphone" + res); //restituisce oggetto
		
		
		Televisore t = new Televisore(27368, "Televisore", "LG", 400, 20, 200, 150, 10, true);
		res = t.toString();
		System.out.println("\n------");
		System.out.println("\nTelevisore" + res); 
		
		
		Cuffie c = new Cuffie(78275, "Cuffie", "Sony", 120, 20, "Verdi", true);
		c.setWireless(false);
		res = c.toString();
		System.out.println("\n------");
		System.out.println("\nCuffie" + res); 
	}
}
