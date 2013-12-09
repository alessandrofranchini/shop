import java.io.File;
import javax.swing.filechooser.*;


public class FiltroFile extends FileFilter {
	
	public boolean accept(File f) {
		if(f.isDirectory()){
			return true;
		}
		
		String estensione = getExt(f);
		
		if(!estensione.equals("") && (estensione.equals("html") || estensione.equals("htm") )){
			return true;
		}
		
		return false;
	}
	
	public String getDescription() {
		return "Pagine HTML";
	}
	
	public static String getExt(File file){
		String nome = file.getName();
		String ext = "";
		int pos = nome.lastIndexOf(".");
		
		if(pos>0 && pos<(nome.length()-1)){
			ext = nome.substring((pos + 1)).toLowerCase();
		}
		
		return ext;
	}

}
