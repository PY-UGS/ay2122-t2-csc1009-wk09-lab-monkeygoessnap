public class Main{
    public static void main(String[] args){
        RandomCharacter newChar = new RandomCharacter();

        for (int i=0;i<15;i++){
            System.out.print(newChar.getRandomCharacter());
            System.out.print(newChar.getRandomDigitCharacter());
            System.out.print(newChar.getRandomLowerCaseLetter());
            System.out.print(newChar.getRandomUpperCaseLetter());
        }

    }
}