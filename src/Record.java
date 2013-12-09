import javax.swing.*;
@SuppressWarnings("serial")
public class Record extends JCheckBox{
	private Prodotto prod;
	
	public Record(Prodotto p){
		prod = p;
	}
	
	public String getCodice(){
		return prod.getCodProdotto();
	}
	
	public String getDesc(){
		return prod.getSingolaDescrizione();
	}
	
	public int getDisp(){
		return prod.getDisponibilita();
	}
	
	public double getPrezzo(){
		return prod.getPrezzo();
	}
	
	public Prodotto getProdotto(){
		return prod;
	}
}
