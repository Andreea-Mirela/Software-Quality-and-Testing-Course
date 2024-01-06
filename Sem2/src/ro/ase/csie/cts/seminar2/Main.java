package ro.ase.csie.cts.seminar2;

import java.math.BigDecimal;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;
import ro.ase.csie.cts.seminar2.solid.InsuficientFundException;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CalendarUtil cu = new CalendarUtil();
//		
//		//double nu are o precizie ff buna
//		//ex:
//		double d1=1.02;
//		double d2=0.43;
//		System.out.println(d1-d2);//va avea o zecimala in plus in coada
//		
//		//mai bine cu BigDecimal
//		BigDecimal bg1 = new BigDecimal("1.02");
//		BigDecimal bg2 = new BigDecimal("0.43");
//		System.out.println(bg1.subtract(bg2));
//		
//		try {
//			System.out.println(cu.weekDay(1));
//			System.out.println(cu.weekDay2(1));
//			System.out.println(cu.weekDay3(1));
//			//System.out.println(cu.weekDay3(9));
//			System.out.println(cu.weekDay4(1));
//		} catch (IncorectDayException e) {
//			System.out.println(e.getMessage());
//		}
		
		Person p = new Person("Mirela");
		BankAccount account = new BankAccount("INGB123456789",p);
		System.out.println(account.toString());
		
		account.deposit(100);
		try {
			account.withdraw(50);
			account.withdraw(70);
		} catch (InsuficientFundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(account.getBalance());
		
		//FeeBankAccount fb = new FeeBankAccount("ING12345789", p);
		account = new FeeBankAccount("ING12345789", p);

		account.deposit(500);
		try {
			account.withdraw(100);
		} catch (InsuficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.getBalance());
	}
	//SHORTCUTS
	
			//syso(+ctrl si spacebar + enter) -> shortcut pt System.out.println
			//sau ctrl+1 pt altele
			//ctrl+o gasire mai rapida metoda
			//ctrl+shift+t sa gasim clasa/exceptia etc in pachete
	//seminar 3
}
