package naresh;

import java.util.Scanner;

public class Bank {
//private static final Object Deposit = null;

public static void main(String args []) {
	int Balance=100000;
	Scanner s=new Scanner(System.in);
	System.out.println("Select operation  deposit  withdrawn");
	String op=s.nextLine();
	if(op.equals("Deposit")) {
		Scanner dp=new Scanner(System.in);
		System.out.println("Enter Deposite Amount:::");
		int deposit=dp.nextInt();
		Balance=Balance+deposit;
		
		System.out.println("deposit amount " + Balance);
		
	}
	else if(op.equals("withdrawn")) {
		Scanner wd=new Scanner(System.in);
		System.out.println("Enter withdraw amount :::::");
		int withdrawn=wd.nextInt();
		if(Balance>=withdrawn)
		{
		Balance=Balance-withdrawn;
	    System.out.println("collect your cash");
	    System.out.println("Remaining amount :::" + Balance);
		}
		else {
			System.out.println("Insufficient fund");
			System.out.println("your amount is " + Balance);
		}
		System.out.println(" ");
		
	}
	else if(op.equals("Balance")) {
		Scanner bl=new Scanner(System.in);
		int amount3;
		System.out.println("Balance amount :::::");
		int amount1=bl.nextInt();
		System.out.println("withdraw amount :::" + amount1);
		int amount2=bl.nextInt();
		System.out.println("withdraw amount :::" + amount2);
		amount3 =amount1-amount2;
		System.out.println( "remaining balnace :::"+ amount3);
		
	}
}

}
