//import java random library
import java.util.Random;

//random character object class
public class RandomCharacter {
    //default constructor
    public RandomCharacter(){
        //empty constructor
    }
    //method to get random lower case letter
    public char getRandomLowerCaseLetter(){
        //create new random object
        Random r = new Random();
        //lower bound of ASCII lower case letter, a=97
        int lowerBound = 97; //Inclusive
        //upper bound of ASCII upper case letter, z=123
        int upperBound = 123; //Exclusive
        //random the int between the 2 bounds, cast the int, and return the character
        return (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    }
    //method to get random upper case letter
    public char getRandomUpperCaseLetter(){
        //create new random object
        Random r = new Random();
        //lower bound of ASCII upper case letter, A=65
        int lowerBound = 65; //Inclusive
        //higher bound of ASCII upper case letter, Z=91
        int upperBound = 91; //Exclusive
        //random the int between the 2 bounds, cast the int, and return the character
        return (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    }
    //method to get random digit character
    public char getRandomDigitCharacter(){
        //create new random object
        Random r = new Random();
        //lower bound of ASCII digit is 48, number 0
        int lowerBound = 48; //Inclusive
        //upper bound of ASCII digit is 48, number 9
        int upperBound = 58; //Exclusive
        //random the int between the 2 bounds, cast the int, and return the character
        return (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    }
    //method to get random character
    public char getRandomCharacter(){
        //create new random object
        Random r = new Random();
        //randomize the choice to 0, 1 and 2
        int choice = r.nextInt(3);
        //assign the function to each choice
        switch(choice){
            //if random 0, return random lower case letter
            case 0:
            return this.getRandomLowerCaseLetter();
            //if random 1, return random upper case letter
            case 1:
            return this.getRandomUpperCaseLetter();
            //if random 2, return random digit character
            case 2:
            return this.getRandomDigitCharacter();
            //default returns terminating character
            default:
            return '\0';
        }
    }
    //method to get random prime digit character
    public char getRandomPrimeDigitCharacter() {
        //create new random object
    	Random r = new Random();
        //lower bound of ASCII digit 0 is 48
    	int lowerBound = 48;
        //higher bound of ASCII digit 9 is 48
    	int upperBound = 58;
        //declar char variable
    	char retChar;
        //loop to get prime digit
    	do {
            //random the int between the 2 bounds, cast the int, and return the character
    		retChar = (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
            //if random digit is prime, exit loop, if not loop until random digit is prime
    	} while (!isPrime(retChar - lowerBound));
        //return the random prime digit character
    	return retChar;
    }
    //static method to check whether number isPrime number
    static boolean isPrime(int n) {
        //return false if number is one or less
    	if (n <= 1) {
    		return false;
        //return true if number is 2
    	} else if (n == 2) {
    		return true;
        //return false if number can be divided by 2
    	} else if (n % 2 == 0) {
    		return false;
    	}
        //runs thru loop and evaluate prime conditions
    	for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            //if number can be divided by i, return false
    		if (n % i == 0) {
    			return false;
    		}
    	}
        //else return true that number if prime
    	return true;
    }
}
