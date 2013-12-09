import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AscoltatoreTasto extends AscoltatoreGenerico implements ActionListener{
	
	public AscoltatoreTasto(Gui g){
		super(g);
	}

	public void actionPerformed(ActionEvent e) {
		FinestraSalvataggio finestra = new FinestraSalvataggio();
		
		finestra.setAcceptAllFileFilterUsed(false);
		finestra.addChoosableFileFilter(new FiltroFile());
		
		int resp = finestra.showDialog(gui, "Salva");
		
		if(resp == JFileChooser.APPROVE_OPTION){
			File file = finestra.getSelectedFile();
			
			String ext = FiltroFile.getExt(file);
			if(!ext.equals("html")){
				String oldpath = file.getAbsolutePath();
				file = new File(oldpath+".html");
			}
			
			PrintWriter contenuto;
			try {
				contenuto = new PrintWriter(file);
				contenuto.print(gui.getFattura());
				contenuto.close();
				System.out.println("Il file è stato creato");
			} catch (FileNotFoundException e1) {
				System.out.println("Il file non è stato creato");
			}
		}
	}

}
