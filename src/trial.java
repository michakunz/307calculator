import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class trial extends JFrame {

	private JPanel contentPane;
	private JTextField number_1_tf;
	private JTextField operator_tf;
	private JTextField number_2_tf;
	private JTextField answer_tf;
	private JButton mult_btn;
	private JButton minus_btn;
	private JButton div_btn;
	private JButton equals_btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trial frame = new trial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		number_1_tf = new JTextField();
		number_1_tf.setBounds(46, 121, 86, 20);
		contentPane.add(number_1_tf);
		number_1_tf.setColumns(10);
		
		operator_tf = new JTextField();
		operator_tf.setBounds(142, 121, 86, 20);
		contentPane.add(operator_tf);
		operator_tf.setColumns(10);
		
		number_2_tf = new JTextField();
		number_2_tf.setBounds(237, 121, 86, 20);
		contentPane.add(number_2_tf);
		number_2_tf.setColumns(10);
		
		answer_tf = new JTextField();
		answer_tf.setBounds(46, 29, 294, 66);
		contentPane.add(answer_tf);
		answer_tf.setColumns(10);
		
		JLabel lblNumber = new JLabel("number1");
		lblNumber.setBounds(46, 106, 46, 14);
		contentPane.add(lblNumber);
		
		JLabel lblOperator = new JLabel("operator");
		lblOperator.setBounds(142, 106, 46, 14);
		contentPane.add(lblOperator);
		
		JLabel lblNumber_1 = new JLabel("number 2");
		lblNumber_1.setBounds(237, 106, 46, 14);
		contentPane.add(lblNumber_1);
		
		JButton plus_btn = new JButton("+");
		plus_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operator_tf.setText("+");
			}
		});
		plus_btn.setBounds(46, 156, 53, 43);
		contentPane.add(plus_btn);
		
		mult_btn = new JButton("*");
		mult_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator_tf.setText("*");
			}
		});
		mult_btn.setBounds(46, 207, 53, 43);
		contentPane.add(mult_btn);
		
		minus_btn = new JButton("-");
		minus_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator_tf.setText("-");
			}
		});
		minus_btn.setBounds(108, 156, 53, 43);
		contentPane.add(minus_btn);
		
		div_btn = new JButton("/");
		div_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator_tf.setText("/");
			}
		});
		div_btn.setBounds(108, 207, 53, 43);
		contentPane.add(div_btn);
		
		equals_btn = new JButton("=");
		equals_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String op = operator_tf.getText();
				double n1 = Double.parseDouble( number_1_tf.getText());
				double n2 = Double.parseDouble( number_2_tf.getText());
				
				if(op.equals("/")){
					answer_tf.setText(Double.toString(n1/n2));
				}
				if(op.equals("*")){
					answer_tf.setText(Double.toString(n1*n2));
				}
				if(op.equals("+")){
					answer_tf.setText(Double.toString(n1+n2));
				}
				if(op.equals("-")){
					answer_tf.setText(Double.toString(n1-n2));
				}
				
			}
		});
		equals_btn.setBounds(171, 160, 122, 90);
		contentPane.add(equals_btn);
	}

}
