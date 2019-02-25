import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JBankAccount extends JFrame
{
	
	ArrayList<BankAccount> accounts; 
	public JBankAccount()
	{
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		setTitle("Bank Account");
		setBounds(100,100,400,400);
		setLayout(null);
		
		JLabel name = new JLabel("Name:");
		name.setBounds(0,0,100,25);
		add(name);
		
		JTextField name1 = new JTextField(" ");
		name1.setBounds(40, 0, 100, 30);
		add(name1);
		
		JLabel accType = new JLabel("Account Type:");
		accType.setBounds(0,10,100,100);
		add(accType);
		
		String type[] = {"    ", "Checking Account", "Savings Account"};
		JComboBox accType1 = new JComboBox(type);
		accType1.setBounds(95, 10, 100, 100);
		add(accType1);
		
		JLabel iBalance = new JLabel("Initial Balance:");
		iBalance.setBounds(0, 90, 100, 100);
		add(iBalance);
		
		JTextField iBalance1 = new JTextField(" ");
		iBalance1.setBounds(95, 125, 100, 30);
		add(iBalance1);
		
		JButton createAccount = new JButton("Create Account");
		createAccount.setBounds(0,300,150,50);
		add(createAccount);
		createAccount.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		if (accType1.getSelectedItem() == "Savings Account")
		{
			accounts.add(new SavingsAccount(name1.getText(), Double.parseDouble(iBalance1.getText()),0,0,0));
		}
		if (accType1.getSelectedItem() == "Checking Account")
		{
			accounts.add(new CheckingAccount(name1.getText(), Double.parseDouble(iBalance1.getText()),0,0,0));
		}
		name1.setText("");
		iBalance1.setText("");
		accType1.setSelectedIndex(0);
	}
		});
		
		JButton displayAccounts = new JButton("Display All Accounts");
		displayAccounts.setBounds(200,300,150,50);
		add(displayAccounts);
		displayAccounts.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		for(BankAccount b: accounts)
		{
			System.out.println(b);
		}
		
	}
		});
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args)
	{
		new JBankAccount();
	}
}
