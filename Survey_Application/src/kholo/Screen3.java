package kholo;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.Statement;

public class Screen3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen3 frame = new Screen3();
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
	public Screen3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Total number of Surveys:");
		lblNewLabel.setBounds(10, 11, 183, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblAverageAge = new JLabel("Average age:");
		lblAverageAge.setBounds(10, 36, 183, 23);
		contentPane.add(lblAverageAge);
		
		JLabel lblOldestPersonWho = new JLabel("Oldest person who participated in survey:");
		lblOldestPersonWho.setBounds(10, 57, 215, 23);
		contentPane.add(lblOldestPersonWho);
		
		JLabel lblYoungestPersonWho = new JLabel("Youngest person who participated in survey:");
		lblYoungestPersonWho.setBounds(10, 81, 215, 23);
		contentPane.add(lblYoungestPersonWho);
		
		JLabel lblPercentageOfPeople = new JLabel("Percentage of people who like Pizza:");
		lblPercentageOfPeople.setBounds(10, 133, 215, 23);
		contentPane.add(lblPercentageOfPeople);
		
		JLabel lblPercentageOfPeople_1 = new JLabel("Percentage of people who like Pasta:");
		lblPercentageOfPeople_1.setBounds(10, 157, 215, 23);
		contentPane.add(lblPercentageOfPeople_1);
		
		JLabel lblPercentageOfPeople_2 = new JLabel("Percentage of people who like Pap and Wors:");
		lblPercentageOfPeople_2.setBounds(10, 181, 241, 23);
		contentPane.add(lblPercentageOfPeople_2);
		
		JLabel lblPeopleLikeTo = new JLabel("People like to eat out:");
		lblPeopleLikeTo.setBounds(10, 233, 215, 23);
		contentPane.add(lblPeopleLikeTo);
		
		JLabel lblPeopleLikeTo_1 = new JLabel("People like to watch movies:");
		lblPeopleLikeTo_1.setBounds(10, 256, 215, 23);
		contentPane.add(lblPeopleLikeTo_1);
		
		JLabel lblPeopleLikeTo_2 = new JLabel("People like to watch TV:");
		lblPeopleLikeTo_2.setBounds(10, 280, 215, 23);
		contentPane.add(lblPeopleLikeTo_2);
		
		JLabel lblPeopleLikeTo_3 = new JLabel("People like to listen to the radio:");
		lblPeopleLikeTo_3.setBounds(10, 301, 215, 23);
		contentPane.add(lblPeopleLikeTo_3);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Screen1 screen1 = new Screen1();
				
				screen1.setVisible(true);
			}
		});
		btnOK.setBounds(193, 384, 89, 23);
		contentPane.add(btnOK);
		
		JLabel lblTotSurvey = new JLabel();
		lblTotSurvey.setLabelFor(lblNewLabel);
		lblTotSurvey.setBackground(Color.LIGHT_GRAY);
		lblTotSurvey.setBounds(257, 15, 54, 19);
		lblTotSurvey.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblTotSurvey);
		
		JLabel lblAgeAverage = new JLabel();
		lblAgeAverage.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblAgeAverage.setBackground(Color.LIGHT_GRAY);
		lblAgeAverage.setBounds(257, 40, 54, 19);
		contentPane.add(lblAgeAverage);
		
		JLabel lblOldest = new JLabel("");
		lblOldest.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOldest.setBackground(Color.LIGHT_GRAY);
		lblOldest.setBounds(257, 61, 54, 19);
		contentPane.add(lblOldest);
		
		JLabel lblYoungest = new JLabel("");
		lblYoungest.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblYoungest.setBackground(Color.LIGHT_GRAY);
		lblYoungest.setBounds(257, 85, 54, 19);
		contentPane.add(lblYoungest);
		
		JLabel lblPizzaPerc = new JLabel("");
		lblPizzaPerc.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPizzaPerc.setBackground(Color.LIGHT_GRAY);
		lblPizzaPerc.setBounds(257, 137, 54, 19);
		contentPane.add(lblPizzaPerc);
		
		JLabel lblPastaPerc = new JLabel("");
		lblPastaPerc.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPastaPerc.setBackground(Color.LIGHT_GRAY);
		lblPastaPerc.setBounds(257, 161, 54, 19);
		contentPane.add(lblPastaPerc);
		
		JLabel lblPapnWorsPerc = new JLabel("");
		lblPapnWorsPerc.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPapnWorsPerc.setBackground(Color.LIGHT_GRAY);
		lblPapnWorsPerc.setBounds(257, 185, 54, 19);
		contentPane.add(lblPapnWorsPerc);
		
		JLabel lblEatOut = new JLabel("");
		lblEatOut.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblEatOut.setBackground(Color.LIGHT_GRAY);
		lblEatOut.setBounds(257, 237, 54, 19);
		contentPane.add(lblEatOut);
		
		JLabel lblWatchMovies = new JLabel("");
		lblWatchMovies.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblWatchMovies.setBackground(Color.LIGHT_GRAY);
		lblWatchMovies.setBounds(257, 260, 54, 19);
		contentPane.add(lblWatchMovies);
		
		JLabel lblWatchTV = new JLabel("");
		lblWatchTV.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblWatchTV.setBackground(Color.LIGHT_GRAY);
		lblWatchTV.setBounds(257, 284, 54, 19);
		contentPane.add(lblWatchTV);
		
		JLabel lblListenRadio = new JLabel("");
		lblListenRadio.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblListenRadio.setBackground(Color.LIGHT_GRAY);
		lblListenRadio.setBounds(257, 305, 54, 19);
		contentPane.add(lblListenRadio);
		
		
		Connection connection;
		String url, username, password;
		Statement statement;
		ResultSet totalSurveys, averageAge, oldestPerson, youngestPerson;
		ResultSet pizza, pasta, papAndWors;
		float percPizza, percPasta, percPapAndWors;
		ResultSet avgEatOut, avgWatchMovies, avgWatchTV, avgListenToRadio;
		int totSurvey;
		
		url = "jdbc:mysql://localhost/Survey";
		username = "root";
		password = "";
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			
			totalSurveys = statement.executeQuery("Select count(Surname) from people;");
			totalSurveys.next();
			totSurvey = totalSurveys.getInt(1);
			lblTotSurvey.setText(String.valueOf(totSurvey));
			
			averageAge = statement.executeQuery("Select avg(Age) from people;");
			averageAge.next();
			lblAgeAverage.setText(String.valueOf(Math.ceil(averageAge.getFloat(1))));
			
			oldestPerson = statement.executeQuery("Select max(Age) from people;");
			oldestPerson.next();
			lblOldest.setText(String.valueOf(oldestPerson.getInt(1)));
			
			youngestPerson = statement.executeQuery("Select min(Age) from people;");
			youngestPerson.next();
			lblYoungest.setText(String.valueOf(youngestPerson.getInt(1)));
			
			pizza = statement.executeQuery("select count(Surname) from people where Pizza = 'YES';");
			pizza.next();
			percPizza = ((pizza.getFloat(1) / totSurvey) * 100);
			lblPizzaPerc.setText(String.format("%.1f", percPizza));
			
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(new Screen3(), ex.getMessage());
		}
	}
}
