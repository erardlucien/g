/**
 * Calculate the greatest common divisor(gcd) of two numbers
 * @author Lucien Erard
 * @version 0.0.2
 */
package gcd;

public class GcdComputer {
	/**
	 * Calculate gcd of var1 and var2 recursively.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return gcd of var1 and var2.
	 */
	public long gcd(int var1, int var2) {
		if(var1 < 1 || var2 < 1) {
			throw new IllegalArgumentException("var1 and var2 must be bigger than 0!");
		}
		
		if(var1 < var2) {
			return gcd(var1, var2 - var1);
		} else if(var1 > var2) {
			return gcd(var1 - var2, var2);
		}
		
		return var1;
	}
	
	/**
	 * Calculate gcd of var1 and var2 recursively.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return gcd of var1 and var2.
	 */
	public long gcd2(int var1, int var2) {
		if(var1 < 1 || var2 < 1) {
			throw new IllegalArgumentException("var1 and var2 must be bigger than 0!");
		}
		
		return gcd2Impl(var1, var2, 2);
				
	}
	
	private long gcd2Impl(int var1, int var2, int divisor) {
		boolean isNotEqualToOne = var1 != 1 || var2 != 1;
		
		if(isNotEqualToOne && var1 % divisor == 0 &&  var2 % divisor == 0) {
			return divisor * gcd2Impl(var1 / divisor, var2 / divisor, divisor);
		} else if(isNotEqualToOne && var1 % divisor == 0 ) {
			return gcd2Impl(var1 / divisor, var2, divisor);
		} else if(isNotEqualToOne && var2 % divisor == 0) {
			return gcd2Impl(var1, var2 / divisor, divisor);
		} else if(isNotEqualToOne) {
			return gcd2Impl(var1, var2, divisor + 1);
		}
		
		return 1;
	}
	
	/**
	 * Calculate gcdI of var1 and var2 iteratively.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return gcd of var1 and var2.
	 */
	public long gcdI(int var1, int var2) {
		if(var1 < 1 || var2 < 1) {
			throw new IllegalArgumentException("var1 and var2 must be bigger than 0!");
		}
		
		while(var1 != var2) {
			if(var1 < var2) {
				var2 -= var1;
			} else if(var1 > var2) {
				var1 -= var2;
			}

		}
		
		return var1;
	}
	
	/**
	 * Calculate gcdI of var1 and var2 iteratively.
	 * @param var1 first number.
	 * @param var2 second number.
	 * @return gcd of var1 and var2.
	 */
	public long gcdI2(int var1, int var2) {
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
				var1 /= divisor;
			}else if(var2 % divisor == 0) {
				var2 /= divisor;
			}else if(var1 % divisor != 0 && var2 % divisor != 0) {
				++divisor;
			}
		}
		return result;
	}
}
