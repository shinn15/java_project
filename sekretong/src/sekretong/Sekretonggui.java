package sekretong;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Sekretonggui extends JFrame{
	private JTextField txtkey;
	private JTextArea txtin;
	private JTextArea txtout;
	
	public String dacode( String mensahe, int susival) {
		String outputin = "";
		char susi = (char) susival;
		for (int x = 0; x < mensahe.length(); x++) {
			
			char inputin = mensahe.charAt(x);
			if (inputin >= 'A' && inputin <= 'Z')
			{
				inputin += susi;
				if (inputin > 'Z')
					inputin -= 26;
				if (inputin < 'A')
					inputin += 26;
			}
			else if (inputin >= 'a' && inputin <='z')
			{
				inputin += susi;
				if (inputin > 'z')
					inputin -= 26;
				if (inputin < 'a')
					inputin += 26;
				
				
			}
			else if (inputin >= '0' && inputin <= '9')
			{
				inputin += (susival % 10);
				if (inputin > '9')
					inputin -= 10;
				if (inputin < '0')
					inputin += 10;
					
			}
			outputin += inputin;
			
		}
		return outputin;
		
	}

	public Sekretonggui() {
		

JFrame bintana = new JFrame();
bintana.setTitle("My Secret code project");
bintana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
bintana.getContentPane().setLayout(null);
JTextArea txtout = new JTextArea();
txtout.setBounds(10, 197, 446, 121);
bintana.getContentPane().add(txtout);
JTextArea txtin = new JTextArea();

txtin.setBounds(10, 11, 446, 151);
bintana.getContentPane().add(txtin);
txtkey = new JTextField();
txtkey.setBounds(175, 173, 86, 20);
bintana.getContentPane().add(txtkey);
txtkey.setColumns(10);
JButton botones = new JButton("Enter");
botones.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		try {
		String mensahe = txtin.getText();
		int susi = Integer.parseInt(txtin.getText());
		String outputin = dacode(mensahe, susi);
		txtout.setText(outputin);
		} catch (Exception ex) {
		
	} 
		
	}
});
botones.setBounds(271, 173, 89, 23);
bintana.getContentPane().add(botones);
JLabel lblNewLabel = new JLabel("key:");
lblNewLabel.setBounds(144, 173, 29, 20);
bintana.getContentPane().add(lblNewLabel);
bintana.setSize(new java.awt.Dimension(600,400));
bintana.setVisible(true);

	}
	
	public static void main(String[] args) {
		 Sekretonggui angsek = new  Sekretonggui();
		 angsek.setVisible(true);
	}
}
