//Vedant Barpande

package userlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN PAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(67, 82, 472, -25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER LOGIN ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel_1.setBounds(186, 32, 430, 57);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USER NAME");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(67, 152, 158, 74);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(66, 250, 141, 43);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(251, 176, 288, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(251, 262, 288, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
				if(password.contains("vedant") && username.contains("hello"))
				{
					textField.setText(null);
					passwordField.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "     INVALID LOGIN        ","ERROR",JOptionPane.ERROR_MESSAGE);
					
					textField.setText(null);
					passwordField.setText(null);
				
					
				}
					studentmarks.main(null);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(114, 353, 111, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(330, 353, 111, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(543, 353, 96, 57);
		frame.getContentPane().add(btnNewButton_2);
	}
}
