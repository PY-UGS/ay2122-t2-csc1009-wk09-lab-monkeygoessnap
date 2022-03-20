import java.util.Random;

public class RandomCharacter {
    public RandomCharacter(){
        //
    }

    public char getRandomLowerCaseLetter(){
        Random r = new Random();
        int lowerBound = 97; //Inclusive
        int upperBound = 123; //Exclusive
        return (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    }

    public char getRandomUpperCaseLetter(){
        Random r = new Random();
        int lowerBound = 65; //Inclusive
        int upperBound = 91; //Exclusive
        return (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    }

    public char getRandomDigitCharacter(){
        Random r = new Random();
        int lowerBound = 48; //Inclusive
        int upperBound = 58; //Exclusive
        return (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    }

    public char getRandomCharacter(){
        Random r = new Random();
        int choice = r.nextInt(3);
        switch(choice){
            case 0:
            return this.getRandomLowerCaseLetter();
            case 1:
            return this.getRandomUpperCaseLetter();
            case 2:
            return this.getRandomDigitCharacter();
            default:
            return '\0';
        }
    }
    
    public char getRandomPrimeDigitCharacter() {
    	Random r = new Random();
    	int lowerBound = 48;
    	int upperBound = 58;
    	char retChar;
    	do {
    		retChar = (char)(r.nextInt(upperBound - lowerBound) + lowerBound);
    	} while (!isPrime(retChar - lowerBound));
    	return retChar;
    }
    
    static boolean isPrime(int n) {
    	if (n <= 1) {
    		return false;
    	} else if (n == 2) {
    		return true;
    	} else if (n % 2 == 0) {
    		return false;
    	}
    	for (int i = 3; i <= Math.sqrt(n); i+= 2) {
    		if (n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
