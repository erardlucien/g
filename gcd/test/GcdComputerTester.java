package gcd.test;

/**
 * Test GcdComputer
 * @author Lucien Erard
 * @version 0.0.1
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gcd.GcdComputer;

class GcdComputerTester {
	GcdComputer testee;
	
	/**
	 * Initials testee
	 */
	public GcdComputerTester() {
		testee = new GcdComputer();
	}

	/**
	 * Test the function gcd from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testgcdWithRandomValues() {
		int[] expected = {3, 2, 1, 12, 9, 6};
		int[] values = { 6, 9, 6, 8, 17, 13, 24, 12, 423, 81, 24, 174 };
		
		assertEquals(expected[0], testee.gcd(values[0], values[1]));
		assertEquals(expected[1], testee.gcd(values[2], values[3]));
		assertEquals(expected[2], testee.gcd(values[4], values[5]));
		assertEquals(expected[3], testee.gcd(values[6], values[7]));
		assertEquals(expected[4], testee.gcd(values[8], values[9]));
		assertEquals(expected[5], testee.gcd(values[10], values[11]));
	}
	
	@Test
	void testIllegalArgumentIngcdWhenVar1andVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd(0, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdWhenVar1EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd(0, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdWhenVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd(9, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdWhenVar1SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd(-1, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdWhenVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd(3, -12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdWhenVar1andVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd(-13, -12);
				}
		);
	}
	
	/**
	 * Test the function gcdI2 from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testgcdI2WithRandomValues() {
		int[] expected = {3, 2, 1, 12, 9, 6};
		int[] values = { 6, 9, 6, 8, 17, 13, 24, 12, 423, 81, 24, 174 };;
		
		assertEquals(expected[0], testee.gcdI2(values[0], values[1]));
		assertEquals(expected[1], testee.gcdI2(values[2], values[3]));
		assertEquals(expected[2], testee.gcdI2(values[4], values[5]));
		assertEquals(expected[3], testee.gcdI2(values[6], values[7]));
		assertEquals(expected[4], testee.gcdI2(values[8], values[9]));
		assertEquals(expected[5], testee.gcdI2(values[10], values[11]));
	}
	
	@Test
	void testIllegalArgumentIngcdI2WhenVar1andVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI2(0, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdI2WhenVar1EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI2(0, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdI2WhenVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI2(9, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdI2WhenVar1SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI2(-1, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdI2WhenVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI2(3, -12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdI2WhenVar1andVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI2(-13, -12);
				}
		);
	}

	/**
	 * Test the function gcd2 from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testgcd2WithRandomValues() {
		int[] expected = {3, 2, 1, 12, 9, 6};
		int[] values = { 6, 9, 6, 8, 17, 13, 24, 12, 423, 81, 24, 174 };
		
		assertEquals(expected[0], testee.gcd2(values[0], values[1]));
		assertEquals(expected[1], testee.gcd2(values[2], values[3]));
		assertEquals(expected[2], testee.gcd2(values[4], values[5]));
		assertEquals(expected[3], testee.gcd2(values[6], values[7]));
		assertEquals(expected[4], testee.gcd2(values[8], values[9]));
		assertEquals(expected[5], testee.gcd2(values[10], values[11]));
	}
	
	@Test
	void testIllegalArgumentIngcd2WhenVar1andVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd2(0, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcd2WhenVar1EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd2(0, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcd2WhenVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd2(9, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcd2WhenVar1SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd2(-1, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcd2WhenVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd2(3, -12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcd2WhenVar1andVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcd2(-13, -12);
				}
		);
	}
	
	/**
	 * Test the function gcdI from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testgcdIWithRandomValues() {
		int[] expected = {3, 2, 1, 12, 9, 6};
		int[] values = { 6, 9, 6, 8, 17, 13, 24, 12, 423, 81, 24, 174 };;
		
		assertEquals(expected[0], testee.gcdI(values[0], values[1]));
		assertEquals(expected[1], testee.gcdI(values[2], values[3]));
		assertEquals(expected[2], testee.gcdI(values[4], values[5]));
		assertEquals(expected[3], testee.gcdI(values[6], values[7]));
		assertEquals(expected[4], testee.gcdI(values[8], values[9]));
		assertEquals(expected[5], testee.gcdI(values[10], values[11]));
	}
	
	@Test
	void testIllegalArgumentIngcdIWhenVar1andVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI(0, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdIWhenVar1EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI(0, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdIWhenVar2EqualsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI(9, 0);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdIWhenVar1SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI(-1, 12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdIWhenVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI(3, -12);
				}
		);
	}
	
	@Test
	void testIllegalArgumentIngcdIWhenVar1andVar2SmallerThanZero() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					testee.gcdI(-13, -12);
				}
		);
	}

}
