import java.util.ArrayList;
import java.util.List;


public class Pacchetto implements Prodotto{
	private List<Prodotto> articoli;
	private String descrizione;
	private int disponibilita;
	private String codProdotto;

	public Pacchetto(String descrizione,String codProdotto){
		articoli= new ArrayList<Prodotto>();
		this.descrizione=descrizione;
		this.codProdotto=codProdotto;
	
	}
	public String getDescrizione(int profondita) {
		String result = descrizione;
		profondita++;
		for(Prodotto elem : articoli){
			result += "\n";
			for(int i=0; i<profondita;i++){
				result += " ";
			}
			result += elem.getDescrizione(profondita)+"\t"+elem.getPrezzo();
		}
		return result;
	}

	public String getSingolaDescrizione(){
		return descrizione;
	}
	
	public double getPrezzo() {
		double result = 0;
		for(Prodotto elem : articoli){
			result += elem.getPrezzo();
		}
		return result;
	}
	
	public void add(Prodotto inserimento) throws Exception {
		articoli.add(inserimento);
	}
	
	public void remove(Prodotto eliminazione) throws Exception {
		articoli.remove(eliminazione);
	}
	public int getDisponibilita(){
		return disponibilita;
	}
	
	public void setDisponibilita(int newDisponibilita){
		disponibilita = newDisponibilita;
	}
	public String getCodProdotto(){
		return codProdotto;
	}

}
