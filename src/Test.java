import java.io.*;

public class Test {

	
	public static void main(String Args[]) throws IOException{
		Prodotto p1 = new Articolo("Mouse",10.00,5,"a01225");
		Prodotto p2 = new Articolo("Tastiera",15.00,1,"b01237");
		Prodotto p5 = new Articolo("Mouse_Wireless",25.00,3,"a01245");
		Prodotto p6 = new Articolo("Tastiera_Wireless",15.00,7,"a01226");
		Prodotto p8 = new Articolo("Stampante multifunzione",70.00,10,"a01234");
		Prodotto p9 = new Articolo("Stampante multifunzione laser b/n",100.00,10,"a01235");
		Prodotto p10 = new Articolo("Stampante multifunzione laser colori",150.00,10,"a01236");
		Prodotto p11 = new Articolo("Stampante multifunzione/fax laser colori",180.00,10,"a01237");
		Prodotto p12 = new Articolo("Unità centrale",300.00,22,"a28123");
		Prodotto p13 = new Articolo("Monitor 21'",150.00,22,"a8123");
		Prodotto p4 = new Sconto(p1, 50);
		
		Prodotto p3 = new Articolo("Cuffie",15.00,2,"c01237");
		Prodotto p7 = new Articolo("WebCam",15.00,5,"a21237");
		
		Prodotto periferiche = new Pacchetto ("Periferiche I/O","a01239");
		/*Fattura f1 = new Fattura();*/
		try{
			periferiche.add(p4);
			periferiche.add(p2);
			periferiche.add(p5);
			periferiche.add(p6);
		}catch(Exception e){
			
		}
		Prodotto periferiche2 = new Pacchetto ("Pc Desktop","k01237");
		try{
			periferiche2.add(p12);
			periferiche2.add(p2);
			periferiche2.add(p5);
			periferiche2.add(p13);
			
		}catch(Exception e){
			
		}
		
		Prodotto p14 = new Sconto(periferiche2, 35);
		
		Record r1 = new Record(periferiche);
		Record r7 = new Record(p8);
		Record r2 = new Record(p4);
		Record r3 = new Record(p5);
		Record r4 = new Record(p6);
		Record r5 = new Record(p3);
		Record r6 = new Record(p7);
		Record r8 = new Record(p9);
		Record r9 = new Record(p10);
		Record r10 = new Record(p11);
		Record r11 = new Record(p12);
		Record r12 = new Record(p14);
		
		
		Gui g = new Gui();
		
		//g.addRiga(r1);
		Record[] list = {r1,r8,r9,r10,r11,r12,r2,r3,r4,r5,r6,r7};
		
		g.addRighe(list);
		
			
		/*f1.addElemento(periferiche);
		f1.addElemento(p3);
		f1.addElemento(p7);
		f1.stampaFattura();
		f1.removeElemento(p3);
		//f1.stampaFattura();
	//System.out.println(totale.getDescrizione(0));
	
	/*File f = new File("Fattura.html");
		f.delete();
		if (f.exists()){
			
			System.out.println("Il file esiste");
		}
		
		else if(f.createNewFile()){
			
			PrintWriter contenuto = new PrintWriter(f);
			contenuto.print(f1.contenutoFatturaHtml());
			contenuto.close();
			System.out.println("Il file è stato creato");
		}*/
		
		
		
	}
}
