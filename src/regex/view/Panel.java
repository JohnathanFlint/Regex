package regex.view;
import javax.swing.*;
import javax.swing.JPanel;
import regex.controller.Controller;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel extends JPanel
{
	private Controller baseController;
	private SpringLayout baseLayout;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField phoneNumber;
	private JTextField email;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	private JButton submitButton;
	
	public Panel(Controller baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		firstName = new JTextField(25);
		lastName = new JTextField(25);
		phoneNumber = new JTextField(25);
		email = new JTextField(25);
		
		firstNameLabel = new JLabel("Type your first name here");
		lastNameLabel  = new JLabel("Type your last name here");
		phoneNumberLabel = new JLabel("Enter your phone number here");
		emailLabel = new JLabel("type your email address here");
		
		submitButton = new JButton("Submit");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(firstName);
		this.add(lastName);
		this.add(phoneNumber);
		this.add(email);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneNumberLabel);
		this.add(emailLabel);
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						
					}
				});
		
		firstName.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent enter)
			{
				
			}
		});
		
		lastName.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent enter)
			{
				
			}
		});
		
		phoneNumber.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent enter)
			{
				
			}
		});
		
		email.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent enter)
			{
				
			}
		});
	}
}
