import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class BMICalculator {

	private JFrame frame;
	private JTextField name;
	private JTextField height;
	private JTextField weight;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalculator window = new BMICalculator();
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
	public BMICalculator() {
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
		
		name = new JTextField();
		name.setBounds(165, 6, 130, 26);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		height = new JTextField();
		height.setBounds(165, 95, 130, 26);
		frame.getContentPane().add(height);
		height.setColumns(10);
		
		weight = new JTextField();
		weight.setBounds(165, 133, 130, 26);
		frame.getContentPane().add(weight);
		weight.setColumns(10);
		

		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(101, 11, 61, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(92, 100, 61, 16);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(92, 138, 61, 16);
		frame.getContentPane().add(lblWeight);
		
		JRadioButton rdbtnMetric = new JRadioButton("Metric");
		buttonGroup.add(rdbtnMetric);
		rdbtnMetric.setBounds(77, 60, 141, 23);
		frame.getContentPane().add(rdbtnMetric);
		
		JRadioButton rdbtnImperial = new JRadioButton("Imperial");
		buttonGroup.add(rdbtnImperial);
		rdbtnImperial.setBounds(275, 60, 141, 23);
		frame.getContentPane().add(rdbtnImperial);
		
		JLabel lblAnswerhere = new JLabel("Answerhere");
		lblAnswerhere.setBounds(73, 204, 80, 16);
		frame.getContentPane().add(lblAnswerhere);
		
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
			}
		});
		textFieldAnswer.setBounds(165, 199, 130, 26);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		JButton btnCalculate_1 = new JButton("Calculate!");
		btnCalculate_1.setBounds(165, 232, 117, 29);
		frame.getContentPane().add(btnCalculate_1);
		btnCalculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				int height;
				int weight;
				int answer;
				try {
					weight = Integer.parseInt(lblWeight.getText());
					height = Integer.parseInt(lblHeight.getText());
					
					answer = weight / (height * height);
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch(Exception e1){
					
					JOptionPane.showMessageDialog(frame, "Please enter valid number");
				}
			}
		});
		
		

	}
}
