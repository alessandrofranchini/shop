import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class FinestraSalvataggio extends JFileChooser{
	@Override
	public void approveSelection(){
        File f = getSelectedFile();
        if(f.exists()){
            int result = JOptionPane.showConfirmDialog(this,"Il file esiste, vuoi sovrascriverlo?","Il file esiste",JOptionPane.YES_NO_OPTION);
            switch(result){
                case JOptionPane.YES_OPTION:
                    
                    return;
                case JOptionPane.NO_OPTION:
                    return;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
        super.approveSelection();
    }
    
}
