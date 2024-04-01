package lcm.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import lcm.*;

class LcmCpmputerTest {
	LcmComputer testee;
	
	public LcmCpmputerTest() {
		testee = new LcmComputer();
	}
	
	/**
	 * Test the function lcm from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testLcmWithRandomValues() {
		int[] values1 = {24, 1367, 36, 354};
		int[] values2 = {27, 678, 24, 27};
		int[] expected = {216, 926826, 72, 3186};
		
		assertEquals(expected[0], testee.lcm(values1[0], values2[0]));
		assertEquals(expected[1], testee.lcm(values1[1], values2[1]));
		assertEquals(expected[2], testee.lcm(values1[2], values2[2]));
		assertEquals(expected[3], testee.lcm(values1[3], values2[3]));
	}
	
	@Test
	void testLcmWhenVar1andVar2EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm(0, 0);
				}
				);
	}
	
	@Test
	void testLcmWhenVar1EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm(0, 36);
				}
				);
	}
	
	@Test
	void testLcmWhenVar2EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm(12, 0);
				}
				);
	}
	
	@Test
	void testLcmWhenVar1andVar2SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm(-1, -3);
				}
				);
	}
	
	@Test
	void testLcmWhenVar1SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm(-1, 67);
				}
				);
	}
	
	@Test
	void testLcmWhenVar2SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm(56, -3);
				}
				);
	}
	
	/**
	 * Test the function lcm2 from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testLcm2WithRandomValues() {
		int[] values1 = {24, 1367, 36, 354};
		int[] values2 = {27, 678, 24, 27};
		int[] expected = {216, 926826, 72, 3186};
		
		assertEquals(expected[0], testee.lcm2(values1[0], values2[0]));
		assertEquals(expected[1], testee.lcm2(values1[1], values2[1]));
		assertEquals(expected[2], testee.lcm2(values1[2], values2[2]));
		assertEquals(expected[3], testee.lcm2(values1[3], values2[3]));
	}
	
	@Test
	void testLcm2WhenVar1andVar2EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm2(0, 0);
				}
				);
	}
	
	@Test
	void testLcm2WhenVar1EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm2(0, 36);
				}
				);
	}
	
	@Test
	void testLcm2WhenVar2EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm2(12, 0);
				}
				);
	}
	
	@Test
	void testLcm2WhenVar1andVar2SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm2(-1, -3);
				}
				);
	}
	
	@Test
	void testLcm2WhenVar1SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm2(-1, 67);
				}
				);
	}
	
	@Test
	void testLcm2WhenVar2SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcm2(56, -3);
				}
				);
	}
	
	/**
	 * Test the function lcmI2 from GcdComputer
	 * with some selected random values.
	 */
	@Test
	void testLcmI2WithRandomValues() {
		int[] values1 = {24, 1367, 36, 354};
		int[] values2 = {27, 678, 24, 27};
		int[] expected = {216, 926826, 72, 3186};
		
		assertEquals(expected[0], testee.lcmI2(values1[0], values2[0]));
		assertEquals(expected[1], testee.lcmI2(values1[1], values2[1]));
		assertEquals(expected[2], testee.lcmI2(values1[2], values2[2]));
		assertEquals(expected[3], testee.lcmI2(values1[3], values2[3]));
	}
	
	@Test
	void testLcmI2WhenVar1andVar2EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcmI2(0, 0);
				}
				);
	}
	
	@Test
	void testLcmI2WhenVar1EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcmI2(0, 36);
				}
				);
	}
	
	@Test
	void testLcmI2WhenVar2EqualsZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcmI2(12, 0);
				}
				);
	}
	
	@Test
	void testLcmI2WhenVar1andVar2SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcmI2(-1, -3);
				}
				);
	}
	
	@Test
	void testLcmI2WhenVar1SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcmI2(-1, 67);
				}
				);
	}
	
	@Test
	void testLcmI2WhenVar2SmallerThanZero() {
		assertThrows(
				IllegalArgumentException.class,
				() -> {
					testee.lcmI2(56, -3);
				}
				);
	}

}
