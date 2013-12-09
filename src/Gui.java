import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.*;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Gui extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextPane fatt;
	private List<Record> righe;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Gui() {
		setResizable(false);
		setTitle("Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodprodotto = new JLabel("Cod.Prodotto");
		lblCodprodotto.setBounds(6, 19, 89, 16);
		contentPane.add(lblCodprodotto);
		
		JLabel lblNomeProdotto = new JLabel("Nome Prodotto");
		lblNomeProdotto.setBounds(165, 19, 100, 16);
		contentPane.add(lblNomeProdotto);
		
		JLabel lblPrezzo = new JLabel("Prezzo");
		lblPrezzo.setBounds(437, 19, 49, 16);
		contentPane.add(lblPrezzo);
		
		JLabel lblDisponibilit = new JLabel("Disponibilit\u00E0");
		lblDisponibilit.setBounds(291, 19, 81, 16);
		contentPane.add(lblDisponibilit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 49, 573, 280);
		contentPane.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnStampaFattura = new JButton("Stampa Fattura");
		btnStampaFattura.addActionListener(new AscoltatoreTasto(this));
		btnStampaFattura.setBounds(437, 341, 142, 29);
		contentPane.add(btnStampaFattura);
		
		fatt = new JTextPane();
		fatt.setEditable(false);
		fatt.setContentType("text/html");
		fatt.setBounds(609, 49, 535, 280);
		contentPane.add(fatt);
		
		JLabel lblAnteprimaFattura = new JLabel("Anteprima Fattura");
		lblAnteprimaFattura.setBounds(821, 19, 124, 16);
		contentPane.add(lblAnteprimaFattura);
		
		righe= new ArrayList<Record>();
		
		
		
//		JLabel lblNewLabel = new JLabel(r.getCodice());
//		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
//		gbc_lblNewLabel.weightx = 5.0;
//		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
//		gbc_lblNewLabel.gridx = 0;
//		gbc_lblNewLabel.gridy = 0;
//		panel.add(lblNewLabel, gbc_lblNewLabel);
//		
//		JLabel label = new JLabel(r.getDesc());
//		GridBagConstraints gbc_label = new GridBagConstraints();
//		gbc_label.weightx = 5.0;
//		gbc_label.insets = new Insets(0, 0, 0, 5);
//		gbc_label.gridx = 3;
//		gbc_label.gridy = 0;
//		panel.add(label, gbc_label);
//		
//		JLabel label_1 = new JLabel(""+r.getDisp());
//		GridBagConstraints gbc_label_1 = new GridBagConstraints();
//		gbc_label_1.weightx = 4.0;
//		gbc_label_1.insets = new Insets(0, 0, 0, 5);
//		gbc_label_1.gridx = 6;
//		gbc_label_1.gridy = 0;
//		panel.add(label_1, gbc_label_1);
//		
//		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
//		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 0, 5);
//		gbc_chckbxNewCheckBox.gridx = 12;
//		gbc_chckbxNewCheckBox.gridy = 0;
//		panel.add(r, gbc_chckbxNewCheckBox);
//		
//		JLabel label_2 = new JLabel(""+r.getPrezzo());
//		GridBagConstraints gbc_label_2 = new GridBagConstraints();
//		gbc_label_2.weightx = 5.0;
//		gbc_label_2.insets = new Insets(0, 0, 0, 5);
//		gbc_label_2.gridx = 10;
//		gbc_label_2.gridy = 0;
//		panel.add(label_2, gbc_label_2);
		
		
		setVisible(true);
	}
	
	public void addRighe(Record[] list){
		int y = 0;
		for(Record r : list){
			JLabel lblNewLabel = new JLabel(r.getCodice());
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.weightx = 5.0;
			gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = y;
			panel.add(lblNewLabel, gbc_lblNewLabel);
			
			JLabel label = new JLabel(r.getDesc());
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.weightx = 5.0;
			gbc_label.insets = new Insets(0, 0, 0, 5);
			gbc_label.gridx = 3;
			gbc_label.gridy = y;
			panel.add(label, gbc_label);
			
			JLabel label_1 = new JLabel(""+r.getDisp());
			GridBagConstraints gbc_label_1 = new GridBagConstraints();
			gbc_label_1.weightx = 4.0;
			gbc_label_1.insets = new Insets(0, 0, 0, 5);
			gbc_label_1.gridx = 6;
			gbc_label_1.gridy = y;
			panel.add(label_1, gbc_label_1);
			
			GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
			gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 0, 5);
			gbc_chckbxNewCheckBox.gridx = 12;
			gbc_chckbxNewCheckBox.gridy = y;
			panel.add(r, gbc_chckbxNewCheckBox);
			
			JLabel label_2 = new JLabel(""+r.getPrezzo());
			GridBagConstraints gbc_label_2 = new GridBagConstraints();
			gbc_label_2.weightx = 5.0;
			gbc_label_2.insets = new Insets(0, 0, 0, 5);
			gbc_label_2.gridx = 10;
			gbc_label_2.gridy = y;
			panel.add(label_2, gbc_label_2);
			
			y += 3;
			AscoltatoreCheck temp = new AscoltatoreCheck(this);
			r.addActionListener(temp);
			righe.add(r);
			
		}
		
	}
	
	public String getFattura(){
		return fatt.getText();
	}
	
	public void updateFattura(){
		Fattura tempFattura = new Fattura();
		
		for(Record rec : righe){
			if(rec.isSelected()){
				tempFattura.addElemento(rec.getProdotto());
			}
		}
		
		fatt.setText(tempFattura.contenutoFatturaHtml());
	}
}
