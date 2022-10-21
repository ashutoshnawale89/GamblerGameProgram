package com.program;

public class GamblingGame {
	
	public void gamble() {
		System.out.println("Start The Game");
		int gambleAmt=100;
		int winingAmt=0;
		int looseAmt=0;
		
		while(winingAmt <= 50 && looseAmt >= -50)  {
			double bet=Math.random();
		if (bet >= 0.50) {
			gambleAmt=gambleAmt+1;
			winingAmt=winingAmt+1;
			System.out.println("The Bet is Win & Total Amount is  "+gambleAmt);
		}
		else  {
			gambleAmt=gambleAmt-1;
			looseAmt=looseAmt-1;
			System.out.println("The Bet is loose & Total Amount is  "+gambleAmt);	
		}
		}
		}
	public static void main(String [] args) {
		GamblingGame bet_Obj=new GamblingGame();
		bet_Obj.gamble();		
	}
}