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
	}
}
