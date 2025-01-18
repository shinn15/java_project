package lebubble;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class testo1 {

	private JFrame frame;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testo1 window = new testo1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testo1() {
		initialize();
	}

	
	public void awit() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println(i);
		}
	}
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Hello worldo");
				
				//lblNewLabel.setText("helllo Mundo");
			
			}
		});
		btnNewButton.setBounds(168, 132, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		lblNewLabel = new JLabel("Hello");
		lblNewLabel.setBounds(156, 56, 89, 47);
		frame.getContentPane().add(lblNewLabel);
	}
}
