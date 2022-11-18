package generation.italy.shop;

public class Smartphone extends Prodotto{
	
	private int codiceIMEI;
	private int memoria;
	
	public Smartphone(int codice, String nome, String marca, int prezzo, int iva, int codiceIMEI, int memoria) {
		
		super(codice, nome, marca, prezzo, iva);
		
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
	}

	public int getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + 
				"\nCodice IMEI: " + codiceIMEI +
				"\nQuantità memoria: " + memoria;
	}
	
}
