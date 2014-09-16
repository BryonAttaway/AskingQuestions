package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;
	private int numberOFQuestions;
	
	public Questions()
	{
		questionScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		//askQuestions();
		askQuestionsGUI();
	}
	private void askQuestionsGUI()
	{
		
		String answerGUI = JOptionPane.showInputDialog("What is your name?");
		answerGUI = JOptionPane.showInputDialog("Why, hello there " + answerGUI + ". How are you today");
		JOptionPane.showMessageDialog(null, "Oh");
		answerGUI = JOptionPane.showInputDialog("How old are you");
		answerGUI = JOptionPane.showInputDialog("So you are " + answerGUI + ". That is a nice age to be. Do you like Pizza?");
		answerGUI = JOptionPane.showInputDialog("I have always wanted to try Pizza. How many siblings do you have?");
		answerGUI = JOptionPane.showInputDialog("you have " + answerGUI + " siblings. do you like it?");
		JOptionPane.showMessageDialog(null, "Yeah, moving on");
		answerGUI = JOptionPane.showInputDialog("What year were you born in?");
		if (answerGUI.equalsIgnoreCase("1997"))
		{
			JOptionPane.showMessageDialog(null, "lol i was born in 1997 as well :D");
		}
			else if (answerGUI.equalsIgnoreCase("1998"))
			{
				JOptionPane.showMessageDialog(null, "HAHAHA I was born in the year before you!!");
			}
				else
				{
					JOptionPane.showMessageDialog(null, "oh, I was born in november of 1997");
				}
		
	}
	
	private void askQuestions()
	{
		System.out.println("Hello");
		System.out.println("What is your name?");
		String answer = questionScanner.nextLine();
		System.out.println("Why, hello there " + answer + ". How are you today");
		answer = questionScanner.nextLine();
		System.out.println("Oh, i guess that's good");
		System.out.println("How old are you?");
		answer = questionScanner.nextLine();
		System.out.println("So you are " + answer + ". That is a nice age to be. Do you like Pizza?");
		answer = questionScanner.nextLine();
		System.out.println("I have always wanted to try Pizza. How many siblings do you have?");
		answer = questionScanner.nextLine();
		System.out.println("you have " + answer + " siblings. do you like it?");
		answer = questionScanner.nextLine();
		System.out.println("Yeah, moving on");
		System.out.println("What year were you born in?");
		answer = questionScanner.nextLine();
			if (answer.equalsIgnoreCase("1997"))
			{
				 System.out.println("lol i was born in 1997 as well :D");
			}
				else if (answer.equalsIgnoreCase("1998"))
				{
					System.out.println("HAHAHA I was born in the year before you!!");
				}
					else
					{
						System.out.println("oh, I was born in november of 1997");
					}
	}
}