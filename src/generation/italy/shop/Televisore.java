package generation.italy.shop;

public class Televisore extends Prodotto {
	
	private int larghezza;
	private int altezza;
	private int profondita;
	private boolean smart;
	
	
	public Televisore(int codice, String nome, String marca, int prezzo, int iva, int larghezza, int altezza, int profondita, boolean smart) {
		
		super(codice, nome, marca, prezzo, iva);
		
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondita = profondita;
		this.smart = smart;
	}


	public int getLarghezza() {
		return larghezza;
	}


	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}


	public int getAltezza() {
		return altezza;
	}


	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}


	public int getProfondita() {
		return profondita;
	}


	public void setProfondita(int profondita) {
		this.profondita = profondita;
	}


	public boolean isSmart() {
		return smart;
	}


	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + 
				"\nLarghezza: " + larghezza +
				"\nAltezza: " + altezza +
				"\nProfondità: " + profondita +
				"\nSmartTV: " + smart;
	}
}
