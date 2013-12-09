
public class Sconto implements Prodotto{
	private Prodotto prod;
	private int sconto;
	
	public Sconto(Prodotto p, int scon){
		prod = p;
		sconto = scon;
	}
	
	public double getPrezzo() {
		int percentuale = 100 - sconto;
		
		return ((prod.getPrezzo()/100)*percentuale);
		
	}
	
	public String getDescrizione(int profondita) {
		return prod.getDescrizione(0);
	}
	
	public String getSingolaDescrizione(){
		return prod.getSingolaDescrizione();
	}
	
	public void add(Prodotto inserimento) throws Exception {
		prod.add(inserimento);
	}
	
	public void remove(Prodotto eliminazione) throws Exception {
		prod.remove(eliminazione);
	}

	
	public void setDisponibilita(int newDisponibilita) {
		prod.setDisponibilita(newDisponibilita);
		
	}

	
	public int getDisponibilita() {
		
		return prod.getDisponibilita();
	}
	public String getCodProdotto(){
		return prod.getCodProdotto();
	}
}
