import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtBillV;
	private JTextField txtPersonV;
	private JTextField txtTipV;
	private JTextField txtTPPV;
	private JTextField txtTotPPV;
	private JTextField txtTotbillV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 534);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txttipcalculator = new JLabel("Tip Calculator");
		txttipcalculator.setFont(new Font("Symbola", Font.BOLD | Font.ITALIC, 14));
		txttipcalculator.setBounds(222, 13, 132, 25);
		contentPane.add(txttipcalculator);
		
		JLabel txtBill = new JLabel("Bill Amount");
		txtBill.setBounds(54, 54, 88, 16);
		contentPane.add(txtBill);
		
		txtBillV = new JTextField();
		txtBillV.setBounds(275, 51, 116, 22);
		contentPane.add(txtBillV);
		txtBillV.setColumns(10);
		
		JLabel txtPerson = new JLabel("No of people");
		txtPerson.setBounds(54, 96, 116, 16);
		contentPane.add(txtPerson);
		
		txtPersonV = new JTextField();
		txtPersonV.setBounds(275, 93, 116, 22);
		contentPane.add(txtPersonV);
		txtPersonV.setColumns(10);
		
		JRadioButton rbPoor = new JRadioButton("10% Poor");
		rbPoor.setBounds(43, 140, 127, 25);
		contentPane.add(rbPoor);
		
		JRadioButton rbGood = new JRadioButton("20% Good");
		rbGood.setBounds(235, 140, 127, 25);
		contentPane.add(rbGood);
		
		JRadioButton rbExcellent = new JRadioButton("30% Excellent");
		rbExcellent.setBounds(402, 140, 127, 25);
		contentPane.add(rbExcellent);
		
		JButton btnCal = new JButton("Calculate");
		btnCal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double tip;
				double tip_per_person;
				double tot_per_person;
				double tot_amount;
				double bill;
				double no_person;
				bill=Double.parseDouble(txtBillV.getText());
				no_person=Double.parseDouble(txtPersonV.getText());
				
			
					if ( rbPoor.isSelected()==true) {
						
						 tip=bill*0.10;
							txtTipV.setText(String.format("%.2f",tip));
							tip_per_person=tip/no_person;
							txtTPPV.setText(String.format("%.2f",tip_per_person));
							tot_per_person=tip_per_person+bill/no_person;
							txtTotPPV.setText(String.format("%.2f",tot_per_person));
							tot_amount=tip+bill;
							txtTotbillV.setText(String.format("%.2f",tot_amount));
							
						
					
					}
	              else if( rbGood.isSelected()==true) {
						
	            	  tip=bill*0.20;
	            	  txtTipV.setText(String.format("%.2f",tip));
						tip_per_person=tip/no_person;
						txtTPPV.setText(String.format("%.2f",tip_per_person));
						tot_per_person=tip_per_person+bill/no_person;
						txtTotPPV.setText(String.format("%.2f",tot_per_person));
						tot_amount=tip+bill;
						txtTotbillV.setText(String.format("%.2f",tot_amount));
					}
	              else if( rbExcellent.isSelected()==true) {
						
						tip=bill*0.30;
						txtTipV.setText(String.format("%.2f",tip));
						tip_per_person=tip/no_person;
						txtTPPV.setText(String.format("%.2f",tip_per_person));
						tot_per_person=tip_per_person+bill/no_person;
						txtTotPPV.setText(String.format("%.2f",tot_per_person));
						tot_amount=tip+bill;
						txtTotbillV.setText(String.format("%.2f",tot_amount));
						
					}
			}
		});
		btnCal.setBackground(Color.GREEN);
		btnCal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnCal.setBounds(280, 194, 97, 25);
		contentPane.add(btnCal);
		
		JLabel txtTip = new JLabel("Total Tip");
		txtTip.setBounds(54, 240, 56, 16);
		contentPane.add(txtTip);
		
		txtTipV = new JTextField();
		txtTipV.setBounds(275, 237, 116, 22);
		contentPane.add(txtTipV);
		txtTipV.setColumns(10);
		
		JLabel txtTPP = new JLabel("Tip per person");
		txtTPP.setBounds(54, 281, 116, 16);
		contentPane.add(txtTPP);
		
		txtTPPV = new JTextField();
		txtTPPV.setBounds(275, 278, 116, 22);
		contentPane.add(txtTPPV);
		txtTPPV.setColumns(10);
		
		JLabel txtTotPP = new JLabel("Total per person");
		txtTotPP.setBounds(54, 336, 116, 16);
		contentPane.add(txtTotPP);
		
		txtTotPPV = new JTextField();
		txtTotPPV.setBounds(275, 333, 116, 22);
		contentPane.add(txtTotPPV);
		txtTotPPV.setColumns(10);
		
		JLabel txtTotbill = new JLabel("Total Bill");
		txtTotbill.setBounds(54, 385, 56, 16);
		contentPane.add(txtTotbill);
		
		txtTotbillV = new JTextField();
		txtTotbillV.setBounds(275, 382, 116, 22);
		contentPane.add(txtTotbillV);
		txtTotbillV.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtBillV.setText(" ");
				txtPersonV.setText(" ");
				txtTipV.setText(" ");
				txtTPPV.setText(" ");
				txtTotPPV.setText(" ");
				txtTotbillV.setText(" ");
				rbGood.setSelected(false);
				rbPoor.setSelected(false);
				rbExcellent .setSelected(false);
			}
		});
		btnClear.setBackground(Color.ORANGE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnClear.setBounds(280, 436, 97, 25);
		contentPane.add(btnClear);
	}
}
