package kholo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen1 frame = new Screen1();
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
	public Screen1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnFillOutSurvey = new JButton("Fill out survey");
		btnFillOutSurvey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen2 screen2 = new Screen2();
				
				screen2.setVisible(true);
			}
		});
		btnFillOutSurvey.setBounds(81, 42, 289, 62);
		contentPane.add(btnFillOutSurvey);
		
		JButton btnViewSurveyResults = new JButton("View survey results");
		btnViewSurveyResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Screen3 screen3 = new Screen3();
				
				screen3.setVisible(true);
			}
		});
		btnViewSurveyResults.setBounds(81, 134, 289, 62);
		contentPane.add(btnViewSurveyResults);
		
	}
	
}
