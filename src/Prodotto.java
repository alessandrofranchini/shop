
public interface Prodotto {
	public double getPrezzo();
	public String getDescrizione(int profondita);
	public String getSingolaDescrizione();
	public void add(Prodotto inserimento)throws Exception;
	public void remove(Prodotto eliminazione)throws Exception;
	public void setDisponibilita(int newDisponibilita);
	public int getDisponibilita();
	public String getCodProdotto();
	
}
