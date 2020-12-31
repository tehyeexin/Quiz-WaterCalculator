import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class WaterCalculator {

	private JFrame frame;
	private JTextField textFieldWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
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
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldWeight.setBounds(215, 103, 146, 26);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("How much water should I drink?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(86, 49, 263, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("My weight (kg):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(71, 106, 129, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int weight;
				double water = 0;
				
				try {
					weight = Integer.parseInt(textFieldWeight.getText());
					water = weight * 0.033;
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + "L of water a day!");
					
				} catch(Exception e3) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(152, 163, 115, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
