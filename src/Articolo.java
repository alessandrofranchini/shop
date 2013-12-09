
public class Articolo implements Prodotto {
	private String descrizione;
	private double prezzo;
	private int disponibilita;
	private String codProdotto;
	
	
	
	public String getDescrizione(int profondita) {
		return descrizione;
	}
	
	public String getSingolaDescrizione(){
		return descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public Articolo (String descrizione, double prezzo,int disponibilita,String codProdotto){
		this.prezzo=prezzo;
		this.descrizione=descrizione;
		this.disponibilita=disponibilita;
		this.codProdotto=codProdotto;
		
	}
	
	public String getCodProdotto(){
		return codProdotto;
	}
	
	public int getDisponibilita(){
		return disponibilita;
	}
	
	public void setDisponibilita(int newDisponibilita){
		disponibilita = newDisponibilita;
	}

	public void add(Prodotto inserimento) throws Exception{
		throw new Exception ("Impossibile aggiungere un prodotto");
		
	}
	
	public void remove(Prodotto eliminazione)throws Exception{
		throw new Exception ("Impossibile rimuovere il prodotto");
		
	}
	
}
