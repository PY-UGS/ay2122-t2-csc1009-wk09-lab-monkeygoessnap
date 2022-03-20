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
}
