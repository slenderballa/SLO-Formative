package slo.view;

import javax.swing.JOptionPane;


public class SloView {

	
	
	
	public void showResponse(String wordsFromSomewhere) {
	
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
		
	}
	
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, stuff);
		return answer;
	}
	
	
	
	
	
	
	
	
	
}
