public class Main{
    public static void main(String[] args){
        RandomCharacter newChar = new RandomCharacter();
        
        int runNumber = 15;
        
        System.out.print(runNumber+"x getRandomLowerCaseLetter: ");
        for (int i=0;i<runNumber;i++){
            System.out.print(newChar.getRandomLowerCaseLetter());
        }
        System.out.println();
        
        System.out.print(runNumber+"x getRandomUpperCaseLetter: ");
        for (int i=0;i<runNumber;i++){
            System.out.print(newChar.getRandomUpperCaseLetter());
        }
        System.out.println();
        
        System.out.print(runNumber+"x getRandomDigitCharacter: ");
        for (int i=0;i<runNumber;i++){
            System.out.print(newChar.getRandomDigitCharacter());
        }
        System.out.println();
        
        System.out.print(runNumber+"x getRandomCharacter: ");
        for (int i=0;i<runNumber;i++){
            System.out.print(newChar.getRandomCharacter());
        }
        System.out.println();
        
        System.out.print(runNumber+"x getRandomPrimeDigitCharacter: ");
        for (int i=0;i<runNumber;i++){
            System.out.print(newChar.getRandomPrimeDigitCharacter());
        }
        System.out.println();

    }
}