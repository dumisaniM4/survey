package kholo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Screen2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSurname;
	private JTextField txtFirstName;
	private JTextField txtContactNumber;
	private JTextField txtAge;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen2 frame = new Screen2();
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
	public Screen2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Take our Survey");
		lblNewLabel.setBounds(10, 11, 111, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details:");
		lblPersonalDetails.setBounds(10, 47, 111, 25);
		contentPane.add(lblPersonalDetails);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(31, 75, 111, 19);
		contentPane.add(lblSurname);
		
		JLabel lblFirstNames = new JLabel("First Names");
		lblFirstNames.setBounds(31, 105, 111, 19);
		contentPane.add(lblFirstNames);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(31, 135, 111, 19);
		contentPane.add(lblContactNumber);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(31, 165, 111, 19);
		contentPane.add(lblDate);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(31, 195, 111, 19);
		contentPane.add(lblAge);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(127, 74, 170, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(127, 104, 170, 20);
		contentPane.add(txtFirstName);
		
		txtContactNumber = new JTextField();
		txtContactNumber.setColumns(10);
		txtContactNumber.setBounds(127, 134, 170, 20);
		contentPane.add(txtContactNumber);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(127, 194, 170, 20);
		contentPane.add(txtAge);
		
		JLabel lblNewLabel_1 = new JLabel("What is your favourite food? (You can choose more than 1 answer)");
		lblNewLabel_1.setBounds(10, 237, 411, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox cboPizza = new JCheckBox("Pizza");
		cboPizza.setBounds(10, 256, 97, 23);
		contentPane.add(cboPizza);
		
		JCheckBox cboPasta = new JCheckBox("Pasta");
		cboPasta.setBounds(10, 282, 97, 23);
		contentPane.add(cboPasta);
		
		JCheckBox cboPapnWors = new JCheckBox("Pap and Wors");
		cboPapnWors.setBounds(10, 308, 97, 23);
		contentPane.add(cboPapnWors);
		
		JCheckBox cboChickenStirFry = new JCheckBox("Chicken stir fry");
		cboChickenStirFry.setBounds(10, 334, 97, 23);
		contentPane.add(cboChickenStirFry);
		
		JCheckBox cboBeefStirFry = new JCheckBox("Beef stir fry");
		cboBeefStirFry.setBounds(10, 360, 97, 23);
		contentPane.add(cboBeefStirFry);
		
		JCheckBox cboOther = new JCheckBox("Other");
		cboOther.setBounds(10, 386, 97, 23);
		contentPane.add(cboOther);
		
		JLabel lblNewLabel_2 = new JLabel("On a scale of 1 to 5 indicate whether you strongly agree to strongly disagree");
		lblNewLabel_2.setBounds(10, 429, 476, 14);
		contentPane.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(127, 165, 170, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_3 = new JLabel("Strongly Agree (1)");
		lblNewLabel_3.setBounds(167, 454, 111, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Agree (2)");
		lblNewLabel_3_1.setBounds(326, 454, 66, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Neutral (3)");
		lblNewLabel_3_2.setBounds(438, 454, 73, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Disagree (4)");
		lblNewLabel_3_3.setBounds(535, 454, 73, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Strongly disagree (5)");
		lblNewLabel_3_4.setBounds(639, 454, 121, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("I like to eat out");
		lblNewLabel_3_5.setBounds(10, 476, 82, 14);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("I like to watch movies");
		lblNewLabel_3_6.setBounds(10, 498, 111, 14);
		contentPane.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("I like to watch TV");
		lblNewLabel_3_7.setBounds(10, 522, 97, 14);
		contentPane.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("I like to listen to the radio");
		lblNewLabel_3_8.setBounds(10, 546, 132, 14);
		contentPane.add(lblNewLabel_3_8);
		
		JRadioButton radEatOut1 = new JRadioButton("");
		radEatOut1.setBounds(204, 475, 35, 23);
		contentPane.add(radEatOut1);
		
		JRadioButton radEatOut2 = new JRadioButton("");
		radEatOut2.setBounds(332, 472, 35, 23);
		contentPane.add(radEatOut2);
		
		JRadioButton radEatOut3 = new JRadioButton("");
		radEatOut3.setBounds(451, 475, 35, 23);
		contentPane.add(radEatOut3);
		
		JRadioButton radEatOut4 = new JRadioButton("");
		radEatOut4.setBounds(545, 475, 35, 23);
		contentPane.add(radEatOut4);
		
		JRadioButton radEatOut5 = new JRadioButton("");
		radEatOut5.setBounds(672, 472, 35, 23);
		contentPane.add(radEatOut5);
		
		JRadioButton radWatchMovies1 = new JRadioButton("");
		radWatchMovies1.setBounds(204, 494, 35, 23);
		contentPane.add(radWatchMovies1);
		
		JRadioButton radWatchMovies2 = new JRadioButton("");
		radWatchMovies2.setBounds(332, 494, 35, 23);
		contentPane.add(radWatchMovies2);
		
		JRadioButton radWatchMovies3 = new JRadioButton("");
		radWatchMovies3.setBounds(451, 494, 35, 23);
		contentPane.add(radWatchMovies3);
		
		JRadioButton radWatchMovies4 = new JRadioButton("");
		radWatchMovies4.setBounds(545, 494, 35, 23);
		contentPane.add(radWatchMovies4);
		
		JRadioButton radWatchMovies5 = new JRadioButton("");
		radWatchMovies5.setBounds(672, 494, 35, 23);
		contentPane.add(radWatchMovies5);
		
		JRadioButton radWatchTV1 = new JRadioButton("");
		radWatchTV1.setBounds(204, 518, 35, 23);
		contentPane.add(radWatchTV1);
		
		JRadioButton radWatchTV2 = new JRadioButton("");
		radWatchTV2.setBounds(332, 518, 35, 23);
		contentPane.add(radWatchTV2);
		
		JRadioButton radWatchTV3 = new JRadioButton("");
		radWatchTV3.setBounds(451, 518, 35, 23);
		contentPane.add(radWatchTV3);
		
		JRadioButton radWatchTV4 = new JRadioButton("");
		radWatchTV4.setBounds(545, 518, 35, 23);
		contentPane.add(radWatchTV4);
		
		JRadioButton radWatchTV5 = new JRadioButton("");
		radWatchTV5.setBounds(672, 518, 35, 23);
		contentPane.add(radWatchTV5);
		
		JRadioButton radListenToRadio1 = new JRadioButton("");
		radListenToRadio1.setBounds(204, 542, 35, 23);
		contentPane.add(radListenToRadio1);
		
		JRadioButton radListenToRadio2 = new JRadioButton("");
		radListenToRadio2.setBounds(332, 538, 35, 23);
		contentPane.add(radListenToRadio2);
		
		JRadioButton radListenToRadio3 = new JRadioButton("");
		radListenToRadio3.setBounds(451, 542, 35, 23);
		contentPane.add(radListenToRadio3);
		
		JRadioButton radListenToRadio4 = new JRadioButton("");
		radListenToRadio4.setBounds(545, 542, 35, 23);
		contentPane.add(radListenToRadio4);
		
		JRadioButton radListenToRadio5 = new JRadioButton("");
		radListenToRadio5.setBounds(672, 542, 35, 23);
		contentPane.add(radListenToRadio5);
		
		ButtonGroup eatOutGroup = new ButtonGroup();
		ButtonGroup watchMoviesGroup = new ButtonGroup();
		ButtonGroup watchTVGroup = new ButtonGroup();
		ButtonGroup listenToRadioGroup = new ButtonGroup();
		
		eatOutGroup.add(radEatOut1);
		eatOutGroup.add(radEatOut2);
		eatOutGroup.add(radEatOut3);
		eatOutGroup.add(radEatOut4);
		eatOutGroup.add(radEatOut5);
		
		watchMoviesGroup.add(radWatchMovies1);
		watchMoviesGroup.add(radWatchMovies2);
		watchMoviesGroup.add(radWatchMovies3);
		watchMoviesGroup.add(radWatchMovies4);
		watchMoviesGroup.add(radWatchMovies5);
		
		watchTVGroup.add(radWatchTV1);
		watchTVGroup.add(radWatchTV2);
		watchTVGroup.add(radWatchTV3);
		watchTVGroup.add(radWatchTV4);
		watchTVGroup.add(radWatchTV5);
		
		listenToRadioGroup.add(radListenToRadio1);
		listenToRadioGroup.add(radListenToRadio2);
		listenToRadioGroup.add(radListenToRadio3);
		listenToRadioGroup.add(radListenToRadio4);
		listenToRadioGroup.add(radListenToRadio5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			/**
			 *
			 */
			public void actionPerformed(ActionEvent e) {
				
				Connection connection;
				String url, username, password, insertStatement;
				int eatingOut = 0, watchingMovie = 0, listeningToRadio = 0, watchingTV = 0;
				String pizza = "NO", pasta = "NO", papNWors = "NO", beefStirFry = "NO", chickenStirFry = "NO", other = "NO";
				PreparedStatement sqlStatement;
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Screen1 screen1 = new Screen1();
				
				url = "jdbc:mysql://localhost/Survey";
				username = "root";
				password = "1234";
				insertStatement = "insert into People values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
				if (cboPizza.isSelected()){
					pizza = "YES";
				}
				if (cboPasta.isSelected()){
					pasta = "YES";
				}
				if (cboPapnWors.isSelected()){
					papNWors = "YES";
				}
				if (cboBeefStirFry.isSelected()){
					beefStirFry = "YES";
				}
				if (cboChickenStirFry.isSelected()){
					chickenStirFry = "YES";
				}
				if (cboOther.isSelected()){
					other = "YES";
				}
				
				if (radEatOut1.isSelected()){
					eatingOut = 1;
				} else if (radEatOut2.isSelected()) {
					eatingOut = 2;
				} else if (radEatOut3.isSelected()) {
					eatingOut = 3;
				} else if (radEatOut4.isSelected()) {
					eatingOut = 4;
				}else if (radEatOut5.isSelected()) {
					eatingOut = 5;
				}
				
				if (radWatchMovies1.isSelected()) {
					watchingMovie = 1;
				}else if (radWatchMovies2.isSelected()) {
					watchingMovie = 2;
				}else if (radWatchMovies3.isSelected()) {
					watchingMovie = 3;
				}else if (radWatchMovies4.isSelected()) {
					watchingMovie = 4;
				}else if (radWatchMovies5.isSelected()) {
					watchingMovie = 5;
				}
				
				if (radWatchTV1.isSelected()) {
					watchingTV = 1;
				}else if (radWatchTV2.isSelected()) {
					watchingTV = 2;
				}else if (radWatchTV3.isSelected()) {
					watchingTV = 3;
				}else if (radWatchTV4.isSelected()) {
					watchingTV = 4;
				}else if (radWatchTV5.isSelected()) {
					watchingTV = 5;
				}
				
				if (radListenToRadio1.isSelected()) {
					listeningToRadio = 1;
				}else if (radListenToRadio2.isSelected()) {
					listeningToRadio = 2;
				}else if (radListenToRadio3.isSelected()) {
					listeningToRadio = 3;
				}else if (radListenToRadio4.isSelected()) {
					listeningToRadio = 4;
				}else if (radListenToRadio5.isSelected()) {
					listeningToRadio = 5;
				}
				
				try {
					connection = DriverManager.getConnection(url, username, password);
					sqlStatement = connection.prepareStatement(insertStatement);
					sqlStatement.setString(1, txtSurname.getText());
					sqlStatement.setString(2, txtFirstName.getText());
					sqlStatement.setString(3, txtContactNumber.getText());
					sqlStatement.setString(4, dateFormat.format(dateChooser.getDate()));
					sqlStatement.setString(5, txtAge.getText());
					sqlStatement.setInt(6, eatingOut);
					sqlStatement.setInt(7, watchingMovie);
					sqlStatement.setInt(8, watchingTV);
					sqlStatement.setInt(9, listeningToRadio);
					sqlStatement.setString(10, pizza);
					sqlStatement.setString(11, pasta);
					sqlStatement.setString(12, papNWors);
					sqlStatement.setString(13, beefStirFry);
					sqlStatement.setString(14, chickenStirFry);
					sqlStatement.setString(15, other);
					
					sqlStatement.execute();
					connection.close();
				} catch(SQLException exception) {
					JOptionPane.showMessageDialog(new Screen2(), exception.getMessage());
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(new Screen2(), ex.getMessage());
				}
				
				Screen2 screen2 = new Screen2();
				
				screen2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				screen1.setVisible(true);
			}
		});
		btnSubmit.setBounds(332, 568, 89, 23);
		contentPane.add(btnSubmit);
		
		
	}
}
