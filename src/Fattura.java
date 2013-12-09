import java.util.*;


public class Fattura {
	
	private List<Prodotto> elementi;
	
	public Fattura(){
		elementi= new ArrayList<Prodotto>();
	}
	
	public void addElemento(Prodotto elemento){
		elementi.add(elemento);
		
	}
	
	public void removeElemento(Prodotto elemento){
		elementi.remove(elemento);
		
	}

	public void stampaFattura(){
		double totale=0;
		for(Prodotto elem : elementi){
			System.out.println(elem.getDescrizione(0));
			totale+=elem.getPrezzo();
		}
		System.out.println("\nTotale\t"+totale);
	}
	public String contenutoFatturaHtml(){
		String pagina= "<html><head><title>Fattura</title></head><body><table align=\"center\" border=\"1px\"><tr><th width=\"150px\">Cod.Prodotto</th>"
				+ "<th width=\"150px\">Nome Prodotto</th><th width=\"150px\">Prezzo</th></tr>";
		double totale=0;
		for(Prodotto elem : elementi){
			pagina+= "<tr>";
			pagina+= "<td width=\"150px\" align=\"center\">";
			pagina+= elem.getCodProdotto();
			pagina+="</td>";
			pagina+= "<td width=\"150px\"  align=\"center\">";
			pagina+= elem.getSingolaDescrizione();
			pagina+="</td>";
			pagina+= "<td width=\"150px\" align=\"center\">";
			pagina+= elem.getPrezzo();
			pagina+= "</td>";
			totale+= elem.getPrezzo();
			pagina+= "</tr>";
			
		}
		pagina+= "<tr></tr>";
		pagina+= "<tr><td colspan=2 ><b> Prezzo Totale</b></td><td align=\"center\"><b>";
		pagina+= totale;
		pagina+= "</b></td></tr></table></body></html>";
		return pagina;
		
		
	}
	
	
		
	
}
