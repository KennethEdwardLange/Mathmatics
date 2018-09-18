package main;

import java.util.ArrayList;
/**
 * Large prime number calculator
 * @author Kenneth Lange
 *
 */
public class LargePrimeNumber {
	
	static ArrayList<Integer> PrimeDataBase = new ArrayList<Integer>();
	static int cd = 9;
	
	public static void main(String[] args){
		PrimeDataBase.add(2);
		System.out.println(2 + " is prime");
		PrimeDataBase.add(3);
		System.out.println(3 + " is prime");
		PrimeDataBase.add(5);
		System.out.println(5 + " is prime");
		PrimeDataBase.add(7);
		System.out.println(7 + " is prime");
		iterative(PrimeDataBase.size()-1);
	}
	
	public static void recursion(int dbsize){ //recursion == bad when doing a lot of them ;P

		boolean prime = true;
		
		for(int i = 0; i<dbsize; i++){
			int j = PrimeDataBase.get(i);
			if(cd % j == 0){
				prime = false;
				break;
			}
			else if((Math.sqrt(cd) < j)){
				break;
			}
		}
		if(cd<10000){ //Changing this number provides the program with a larger max number to check up to for prime numbers
		if (prime == true){
			PrimeDataBase.add(cd);
			System.out.println(cd + " is prime");
			cd+=2;
			recursion(PrimeDataBase.size()-1);
		}else{
			cd+=2;
			recursion(PrimeDataBase.size()-1);
		}}
	}
	
	public static void iterative(int dbsize){ //iterative doesn't make too many more lines of code, but unlike recursive, it does not cause a stack overflow when doing large amounts of calculations
		while(true){
			dbsize = PrimeDataBase.size() - 1;
			boolean prime = true;
			
			for(int i = 0; i<dbsize; i++){
				int j = PrimeDataBase.get(i);
				if(cd % j == 0){
					prime = false;
					break;
				}
				else if((Math.sqrt(cd) < j)){
					break;
				}
			}
			if(cd<100){ //Changing this number provides the program with a larger max number to check up to for prime numbers
			if (prime == true){
				PrimeDataBase.add(cd);
				System.out.println(cd + " is prime");
				cd+=2;
			}else{
				cd+=2;
			}}
		}	
	}
}
