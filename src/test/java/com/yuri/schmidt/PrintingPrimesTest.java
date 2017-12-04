package com.yuri.schmidt;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrintingPrimesTest {

	@Test
	public void testOfSearchPrimes() {
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
		List<Integer> fact = PrimesClazz.searchPrimes("100");
		
		assertEquals(expected, fact);
	}

}
