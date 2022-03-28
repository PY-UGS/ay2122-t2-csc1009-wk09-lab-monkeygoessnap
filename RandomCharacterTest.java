//import the java test libraries
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//random charactertest 
class RandomCharacterTest {
	//initialize test number to 15
	static final int testNum = 15;
	//initialize new random character object
	static final RandomCharacter newChar = new RandomCharacter();
	
	//test get random lower case letter
	@Test
	final void testGetRandomLowerCaseLetter() {
		//initialize lower bound of ASCII lower case letter a = 97
		int lowerBound = 97;
		//initialize upper bound of ASCII lower case letter z = 123
		int upperBound = 123;
		//runs the test case, testNum of times
		for (int i = 0;i < testNum;i++) {
			//get random lower case letter with method
			int testChar = newChar.getRandomLowerCaseLetter();
			//assert true if testchar generated falls between the bounds, inclusive of lower bound and exclusive of upper bound
			assertTrue("Test within bounds", testChar >= lowerBound && testChar < upperBound);
			//assert false if testchar falls below lowerbounds
			assertFalse("Test boundary: lowerbound", testChar < lowerBound);
			//assert false if testchar is equal or above upperbounds
			assertFalse("Test boundary: upperbound", testChar >= upperBound);	
		}
	}
	//test get random upper case letter
	@Test
	final void testGetRandomUpperCaseLetter() {
		//initialize lower bound of ASCII upper case letter A = 65
		int lowerBound = 65;
		//initialize upper bound of ASCII upper case letter Z = 91
		int upperBound = 91;
		//runs the test case, testNum of times
		for (int i = 0;i < testNum;i++) {
			//get random upper case letter with method
			int testChar = newChar.getRandomUpperCaseLetter();
			//assert true if testchar generated falls between the bounds, inclusive of lower bound and exclusive of upper bound
			assertTrue("Test within bounds", testChar >= lowerBound && testChar < upperBound);
			//assert false if testchar falls below lowerbounds
			assertFalse("Test boundary: lowerbound", testChar < lowerBound);
			//assert false if testchar is equal or above upperbounds
			assertFalse("Test boundary: upperbound", testChar >= upperBound);	
		}
	}
	//test get random digit character
	@Test
	final void testGetRandomDigitCharacter() {
		//initialize lower bound of ASCII digit 0 = 48
		int lowerBound = 48;
		//initialize upper bound of ASCII digit 9 = 58
		int upperBound = 58;
		//runs the test case, testNum of times
		for (int i = 0;i < testNum;i++) {
			//get random digit character with method
			int testChar = newChar.getRandomDigitCharacter();
			//assert true if testchar generated falls between the bounds, inclusive of lower bound and exclusive of upper bound
			assertTrue("Test within bounds", testChar >= lowerBound && testChar < upperBound);
			//assert false if testchar falls below lowerbounds
			assertFalse("Test boundary: lowerbound", testChar < lowerBound);
			//assert false if testchar is equal or above upperbounds
			assertFalse("Test boundary: upperbound", testChar >= upperBound);	
		}	
	}
	//test get random character
	@Test
	final void testGetRandomCharacter() {
		//initialize lower bound of ASCII lower case letter a = 97
		int lowerBound1 = 97;
		//initialize upper bound of ASCII lower case letter z = 123
		int upperBound1 = 123;
		//initialize lower bound of ASCII digit 0 = 48
		int lowerBound2 = 48;
		//initialize upper bound of ASCII digit 9 = 58
		int upperBound2 = 58;
		//initialize lower bound of ASCII upper case letter A = 65
		int lowerBound3 = 65;
		//initialize lower bound of ASCII upper case letter Z = 91
		int upperBound3 = 91;
		//runs the test case, testNum of times
		for (int i = 0;i < testNum;i++) {
			//get random character with method
			int testChar = newChar.getRandomDigitCharacter();
			//assert true case
			assertTrue(
					//within bounds set
					"Test within bounds", 
					(testChar >= lowerBound1 && testChar < upperBound1) ||
					(testChar >= lowerBound2 && testChar < upperBound2) ||
					(testChar >= lowerBound3 && testChar < upperBound3)
					);
			//assert false case
			assertFalse(
					//out of lower bounds
					"Test boundary: lower bounds",
					testChar < Math.min(lowerBound1, Math.min(lowerBound2, lowerBound3))
					);
			//assert false case		
			assertFalse(
					//out of upper bounds
					"Test boundary: upper bounds",
					testChar >= Math.max(upperBound1, Math.max(upperBound2, upperBound3))
					);	
		}	
	}
	
	//test prime static method
	@Test
	final void testIsPrime() {
		//test 0 to 9 and assert whether it is true or false depending on whether the digit is prime
		assertFalse("Test 0",RandomCharacter.isPrime(0));
		assertFalse("Test 1",RandomCharacter.isPrime(1));
		assertTrue("Test 2",RandomCharacter.isPrime(2));
		assertTrue("Test 3",RandomCharacter.isPrime(3));
		assertFalse("Test 4",RandomCharacter.isPrime(4));
		assertTrue("Test 5",RandomCharacter.isPrime(5));
		assertFalse("Test 6",RandomCharacter.isPrime(6));
		assertTrue("Test 7",RandomCharacter.isPrime(7));
		assertFalse("Test 8",RandomCharacter.isPrime(8));
		assertFalse("Test 9",RandomCharacter.isPrime(9));
	}

	//test get random prime digit character
	@Test
	final void testGetRandomPrimeDigitCharacter() {
		//initialize lower bound of ASCII digit 0 = 48
		int lowerBound = 48;
		//initialize lower bound of ASCII digit 9 = 48
		int upperBound = 58;
		//runs the test case, testNum of times
		for (int i = 0; i < testNum;i++) {
			//get new random prime digit character with method
			int testChar = newChar.getRandomPrimeDigitCharacter();
			//assert true case
			assertTrue(
					//test within the bounds given
					"Test within bounds",
					testChar >= lowerBound && 
					testChar < upperBound);
			//assert not equals to digits that are not prime
			assertNotEquals(0, testChar - lowerBound);
			assertNotEquals(1, testChar - lowerBound);
			assertNotEquals(4, testChar - lowerBound);
			assertNotEquals(6, testChar - lowerBound);
			assertNotEquals(8, testChar - lowerBound);
			assertNotEquals(9, testChar - lowerBound);
		}
	}
}
