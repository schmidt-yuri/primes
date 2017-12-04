package com.yuri.schmidt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Primes {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Please insert one integer");
			return;
		}

System.out.println(PrimesClazz.searchPrimes(args[0]));
	
	}//end of main
}//end of class
