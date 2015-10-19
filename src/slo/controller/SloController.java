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
			JOptionPane.showMessageDialog(null, "You're off by " + diff);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
