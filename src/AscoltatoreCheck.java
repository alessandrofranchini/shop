import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AscoltatoreCheck extends AscoltatoreGenerico implements ActionListener{
	public AscoltatoreCheck(Gui g){
		super(g);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		gui.updateFattura();
	}

}
