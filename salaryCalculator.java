import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class salaryCalculator {

	public static void main(String[] args) 
	{
	JFrame myFrame = new JFrame();
	myFrame.setBounds(0,0,500,500);
	myFrame.setLayout(null);

	JLabel hRate = new JLabel("Hourly Rate");
	hRate.setBounds(0,0,100,25);
	myFrame.add(hRate);
	
	JLabel hpw = new JLabel("Hours per week: ");
	hpw.setBounds(50, 75, 100, 25);
	myFrame.add(hpw);
	
	JTextField hText = new JTextField();
	hText.setBounds(150, 50, 100, 25);
	myFrame.add(hText);
	
	JTextField week = new JTextField();
	week.setBounds(150, 75, 100, 25);
	myFrame.add(week);
	
	JLabel total = new JLabel();
	total.setBounds(200, 150, 200, 25);
	myFrame.add(total);
	
	JCheckBox box = new JCheckBox("Full Time");
	box.setBounds(50,100, 150, 25);
	box.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				double fullTime = Double.parseDouble(hText.getText()) * 40 * 52;
				total.setText("Full Time Wage:  $" + fullTime);;
			}
			
			}
			
			);
	
myFrame.add(box);	
myFrame.setVisible(true);	
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
