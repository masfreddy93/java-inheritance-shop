package generation.italy.shop;

public class Prodotto {
	
	//variabili d'istanza
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	
	//costruttore
	public Prodotto(int codice, String nome, String marca, int prezzo, int iva) {
		
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	//getter/setter
	public int getCodice() {
		
		return this.codice;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getMarca() {
		
		return this.marca;
	}
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public int getPrezzo() {
		
		return this.prezzo;
	}
	public void setPrezzo(int prezzo) {
		
		if(prezzo > 0)
			this.prezzo = prezzo;
	}
	
	public int getIva() {
		
		return this.iva;
	}
	public void setIva(int iva) {
		
		if(iva >= 0)
			this.iva = iva;
	}
	
	
	//altri metodi
	
	public float getPriceWithIva() {
		
		float priceWithIva = this.prezzo + (this.prezzo / 100f * this.iva);
				
		return priceWithIva;
	}
	
	
	//toString
	@Override
	public String toString() {
		
		return "\nCodice: " + codice +
				"\nNome: " + nome +
				"\nMarca: " + marca +
				"\nPrezzo: " + prezzo +
				"\nIva: " + iva;
	}
}
