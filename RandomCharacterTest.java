import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomCharacterTest {
	static final int testNum = 15;
	static final RandomCharacter newChar = new RandomCharacter();
	

	
	@Test
	final void testGetRandomLowerCaseLetter() {
		int lowerBound = 97;
		int upperBound = 123;
		for (int i = 0;i < testNum;i++) {
			int testChar = newChar.getRandomLowerCaseLetter();
			assertTrue(testChar >= lowerBound && testChar < upperBound);
			assertFalse(testChar < lowerBound);
			assertFalse(testChar >= upperBound);	
		}
	}

	@Test
	final void testGetRandomUpperCaseLetter() {
		int lowerBound = 65;
		int upperBound = 91;
		for (int i = 0;i < testNum;i++) {
			int testChar = newChar.getRandomUpperCaseLetter();
			assertTrue(testChar >= lowerBound && testChar < upperBound);
			assertFalse(testChar < lowerBound);
			assertFalse(testChar >= upperBound);	
		}
	}

	@Test
	final void testGetRandomDigitCharacter() {
		int lowerBound = 48;
		int upperBound = 58;
		for (int i = 0;i < testNum;i++) {
			int testChar = newChar.getRandomDigitCharacter();
			assertTrue(testChar >= lowerBound && testChar < upperBound);
			assertFalse(testChar < lowerBound);
			assertFalse(testChar >= upperBound);	
		}	
	}

	@Test
	final void testGetRandomCharacter() {
		int lowerBound1 = 97;
		int upperBound1 = 123;
		int lowerBound2 = 48;
		int upperBound2 = 58;
		int lowerBound3 = 48;
		int upperBound3 = 58;
		for (int i = 0;i < testNum;i++) {
			int testChar = newChar.getRandomDigitCharacter();
			assertTrue(
					(testChar >= lowerBound1 && testChar < upperBound1) ||
					(testChar >= lowerBound2 && testChar < upperBound2) ||
					(testChar >= lowerBound3 && testChar < upperBound3)
					);
			assertFalse(
					testChar < Math.min(lowerBound1, Math.min(lowerBound2, lowerBound3))
					);
			assertFalse(
					testChar >= Math.max(upperBound1, Math.max(upperBound2, upperBound3))
					);	
		}	
	}
	
	@Test
	final void testIsPrime() {
		assertFalse("0",RandomCharacter.isPrime(0));
		assertFalse("1",RandomCharacter.isPrime(1));
		assertTrue("2",RandomCharacter.isPrime(2));
		assertTrue("3",RandomCharacter.isPrime(3));
		assertFalse("4",RandomCharacter.isPrime(4));
		assertTrue("5",RandomCharacter.isPrime(5));
		assertFalse("6",RandomCharacter.isPrime(6));
		assertTrue("7",RandomCharacter.isPrime(7));
		assertFalse("8",RandomCharacter.isPrime(8));
		assertFalse("9",RandomCharacter.isPrime(9));
	}
	
	@Test
	final void testGetRandomPrimeDigitCharacter() {
		int lowerBound = 48;
		int upperBound = 58;
		for (int i = 0; i < testNum;i++) {
			int testChar = newChar.getRandomPrimeDigitCharacter();
			assertTrue(testChar >= lowerBound && testChar < upperBound);
			assertNotEquals(0, testChar - lowerBound);
			assertNotEquals(1, testChar - lowerBound);
			assertNotEquals(4, testChar - lowerBound);
			assertNotEquals(6, testChar - lowerBound);
			assertNotEquals(8, testChar - lowerBound);
			assertNotEquals(9, testChar - lowerBound);
		}

	
	}
	


}
