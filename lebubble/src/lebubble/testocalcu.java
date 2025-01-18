package lebubble;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testocalcu {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField ansField;
	private JButton mulbtn;
	private JButton divibtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testocalcu window = new testocalcu();
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
	public testocalcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(33, 21, 167, 47);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(210, 21, 167, 47);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton addbttn = new JButton("ADD");
		addbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					ans = num1 + num2;
					ansField.setText(Integer.toString(ans));
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid");
				}
				
				
				
			}
		});
		addbttn.setBounds(210, 107, 89, 23);
		frame.getContentPane().add(addbttn);
		
		JButton minubttn = new JButton("Minus");
		minubttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					ans = num1 - num2;
					ansField.setText(Integer.toString(ans));
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid");
				}
			}
		});
		minubttn.setBounds(96, 107, 89, 23);
		frame.getContentPane().add(minubttn);
		
		JLabel anslabl = new JLabel("Answer:");
		anslabl.setBackground(Color.WHITE);
		anslabl.setForeground(Color.BLACK);
		anslabl.setBounds(125, 212, 60, 38);
		frame.getContentPane().add(anslabl);
		
		ansField = new JTextField();
		ansField.setBounds(198, 212, 123, 38);
		frame.getContentPane().add(ansField);
		ansField.setColumns(10);
		
		mulbtn = new JButton("Multiple");
		mulbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					ans = num1 * num2;
					ansField.setText(Integer.toString(ans));
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid");
				}
				
				
			}
		});
		mulbtn.setBounds(96, 141, 89, 23);
		frame.getContentPane().add(mulbtn);
		
		divibtn = new JButton("Division");
		divibtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					ans = num1 / num2;
					ansField.setText(Integer.toString(ans));
					
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid");
				}
				
			}
		});
		divibtn.setBounds(210, 141, 89, 23);
		frame.getContentPane().add(divibtn);
	}
}
