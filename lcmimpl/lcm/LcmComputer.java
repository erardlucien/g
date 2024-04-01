/**
 * Calculate the least common multiple(lcm) of two numbers
 * @author Lucien Erard
 * @version 0.0.1
 */
package lcm;
import gcd.GcdComputer;

public class LcmComputer {
	/**
	 * Calculate lcm of var1 and var2 with the help of GcdComputer from gcd.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return lcm of var1 and var2.
	 */
	public long lcm(int var1, int var2) {
		if(var1 < 1 || var2 < 1) {
			throw new IllegalArgumentException("var1 and var2 must be bigger than 0!");
		}
		
		long gcd = new GcdComputer().gcdI(var1, var2);
		return ( var1 * var2 ) / gcd;
	}
	
	/**
	 * Calculate lcm of var1 and var2 recursively.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return lcm of var1 and var2.
	 */
	public long lcm2(int var1, int var2) {
		if(var1 < 1 || var2 < 1) {
			throw new IllegalArgumentException("var1 and var2 must be bigger than 0!");
		}
		
		return lcm2Impl(var1, var2, 2);
	}
	
	private long lcm2Impl(int var1, int var2, int divisor) {
		boolean isNotEqualToOne = var1 != 1 || var2 != 1;
		long result = 1;
		
		if(isNotEqualToOne && var1 % divisor == 0 &&  var2 % divisor == 0) {
			result *= divisor * lcm2Impl(var1 / divisor, var2 / divisor, divisor);
		} else if(isNotEqualToOne && var1 % divisor == 0 ) {
			result *= divisor * lcm2Impl(var1 / divisor, var2, divisor);
		} else if(isNotEqualToOne && var2 % divisor == 0) {
			result *= divisor * lcm2Impl(var1, var2 / divisor, divisor);
		} else if(isNotEqualToOne) {
			result *= lcm2Impl(var1, var2, divisor + 1);
		}
		
		return result;
	}
	
	/**
	 * Calculate lcm of var1 and var2 iteratively.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return lcm of var1 and var2.
	 */
	public long lcmI2(int var1, int var2) {
		if(var1 < 1 || var2 < 1) {
			throw new IllegalArgumentException("var1 and var2 must be bigger than 0!");
		}
		
		long result = 1;
		int divisor = 2;
		
		while(var1 != 1 || var2 != 1) {
			if(var1 % divisor == 0 && var2 % divisor == 0) {
				result *= divisor;
				var1 /= divisor;
				var2 /= divisor;
			} else if(var1 % divisor == 0) {
				result *= divisor;
				var1 /= divisor;
			}else if(var2 % divisor == 0) {
				result *= divisor;
				var2 /= divisor;
			}else if(var1 % divisor != 0 && var2 % divisor != 0) {
				++divisor;
			}
		}
		return result;
	}
	
}
