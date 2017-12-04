package com.yuri.schmidt;

import java.util.ArrayList;
import java.util.List;

/**
 * This class searches prime numbers of an integer.
 * A prime number (or a prime) is a natural number
 * greater than 1 that has no positive divisors other than 1 and itself.
 * @author Yuri Schmidt
 *
 */
public class PrimesClazz {
//the parameter a is get from the main method
	public static List<Integer> searchPrimes(String a) {
		int num = Integer.parseInt(a);
		List<Integer> primesList = new ArrayList<>();
		// filling in the ArrayList with numbers
		for (int i = 2; i < num; i++) {
			primesList.add(Integer.valueOf(i));
		}

		Double squareRoot = Math.sqrt(Double.parseDouble(a));
		int sqareRootInt = squareRoot.intValue();
		int j = 0;
		int divider = 0;
		while (divider <= sqareRootInt) {
			divider = primesList.get(j++);

			for (int z = 1; z < primesList.size(); z++) {
				if (primesList.get(z) % divider == 0 && primesList.get(z) / divider > 1) {
					primesList.remove(primesList.get(z));
				} // end of if
			} // end of for
			

		} // end of while
		// System.out.println(primesList.toString());
		return primesList;

	}
}
