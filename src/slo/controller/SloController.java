package slo.controller;

import javax.swing.JOptionPane;
import slo.view.SloView;

public class SloController {

	private SloView myPopups;
	
	public SloController()
	{
		myPopups = new SloView();
	}
	
	
	
	public void start()
	{
		String temp = myPopups.grabAnswer("Type in a number less than 10");
		
		
		int myGuess = Integer.parseInt(temp);
		
		int diff = 10 - myGuess;
		
		if( myGuess < 10)
		{
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You're trash, you're off by " + diff);
		}
		
		double myWeight = 200.5;
		
		
		String temp1 = myPopups.grabAnswer("Type in your exact weight");
		double userWeight = Double.parseDouble(temp1);
		
		if ( userWeight > myWeight)
			{
				double wdiff = userWeight - myWeight;
				myPopups.showResponse("You are " + wdiff + " pounds more than me");
				
			}
		else if ( userWeight < myWeight)
		{
			double wdiff = myWeight - userWeight;
			myPopups.showResponse("You are " + wdiff + " less than me");
		}
		else 
		{
			myPopups.showResponse("We are the same weight");
		}
		
		
				
	}
	
	
	
	
	
	
	
	
	
	
}
