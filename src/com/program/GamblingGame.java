package com.program;

public class GamblingGame {
	
	public void gamble() {
		System.out.println("Start The Game");
		int gambleAmt=100;
		int winingAmt=0;
		int looseAmt=0;
		int days=20;
		while(days >= 1) {    //    this loop is to try 20 days gambling
		days--; 
		winingAmt=0;  looseAmt=0;
		while(winingAmt <= 50 && looseAmt >= -50)  {
			double bet=Math.random();
		if (bet >= 0.50) {            //  for above 50% it will get the bet is Win
			gambleAmt=gambleAmt+1;
			winingAmt=winingAmt+1;
		}
		else  {                    //  for below 50% it will get the bet is loose
			gambleAmt=gambleAmt-1;
			looseAmt=looseAmt-1;
		}
		}
		System.out.println("The Bet of day the & Total Amount is  "+gambleAmt);
		}
	}
	public static void main(String [] args) {
		GamblingGame bet_Obj=new GamblingGame();
		bet_Obj.gamble();		
	}
}