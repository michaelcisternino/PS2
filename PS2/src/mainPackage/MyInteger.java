/* Michael Cisternino
 * PS#2
 * September 16, 2015
 */

package mainPackage;

// class MyInteger contains all methods, objects, and constructors for MyInteger
public class MyInteger {

	public static void main(String[] args) {
		// created this class to test MyInteger class and methods

		char[] numbers = { '1', '2', '3', '4', '9' };
		MyInteger newInt = new MyInteger(6);
		System.out.println(newInt.isEven());
		System.out.println(newInt.isOdd());
		System.out.println(newInt.equals(9));
		System.out.println(newInt.isPrime());
		System.out.println(parseInt("1234"));
		System.out.println(parseInt(numbers));

	}

	// an int data field named value that stores the int value represented by
	// this object
	private int value;

	// a constructor that creates a MyInteger object for specified int value
	public MyInteger(int num) {
		value = num;
	}

	// getMyInteger returns int value
	public int getMyInteger() {
		return value;
	}

	// isEven returns true if given value is even
	public boolean isEven() {
		if (this.getMyInteger() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// isOdd returns true if given value is odd
	public boolean isOdd() {
		if (this.getMyInteger() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// is prime returns true if given value is prime
	public boolean isPrime() {
		int num = 0;
		for (num = 2; num <= Math.sqrt(value); num++) {
			if (value % num == 0) {
				return false;
			}
		}
		{
			return true;
		}
	}

	// returns true if specified value is even
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// returns true if specified value is odd
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// returns true if specified value is prime
	public static boolean isPrime(int value) {
		int num;
		for (num = 0; num <= Math.sqrt(value); num++) {
			if (value % 2 == 0) {
				return false;
			}
		}
		{
			return true;
		}
	}

	// returns true if specified value is even
	public static boolean isEven(MyInteger myInt) {
		if (myInt.getMyInteger() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// returns true if specified value is odd
	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getMyInteger() % 2 != 0) {
			return true;
		}
		else
		{
			return false;
		}
	}

	// returns true if specified value is prime
	public static boolean isPrime(MyInteger myInt) {
		int num;
		for (num = 0; num <= Math.sqrt(myInt.getMyInteger()); num++) {
			if (myInt.getMyInteger() % 2 == 0) {
				return false;
			}
		}
		{
			return true;
		}
	}


	// returns true if value in the object is equal to specified value
	public boolean equals(int aValue) {
		if (value == aValue) {
			return true;
		} else {
			return false;
		}
	}

	// returns true if value in the object is equal to specified value
	public boolean equals(MyInteger myInt, int someValue) {
		if (someValue == myInt.getMyInteger()) {
			return true;
		} else {
			return false;
		}
	}

	// parseInt converts a string into an int value
	public static int parseInt(String x) {
		int i;
		int sum = 0;
		for (i = 0; i <= x.length(); i++) {
			sum += i;
		}
		return sum;
	}

	// uses parseInt to convert an array of numeric characters into an int value
	public static int parseInt(char[] anArray) {
		int i;
		int sum = 0;
		for (i = 0; i <= anArray.length; i++) {
			sum += i;
		}
		return sum;
	}

}
