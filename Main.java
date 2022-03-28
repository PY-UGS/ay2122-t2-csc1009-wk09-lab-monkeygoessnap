//main program class
public class Main{
    //main program entry
    public static void main(String[] args){
        //create new character object
        RandomCharacter newChar = new RandomCharacter();
        //number of test runs
        int runNumber = 15;
        //prints number of test runs
        System.out.print(runNumber+"x getRandomLowerCaseLetter: ");
        //runs the random lower case letter generator x runnumber
        for (int i=0;i<runNumber;i++){
            //prints the generated character
            System.out.print(newChar.getRandomLowerCaseLetter());
        }
        //prints extra line
        System.out.println();
        //prints number of test runs      
        System.out.print(runNumber+"x getRandomUpperCaseLetter: ");
        //runs the random upper case letter generator x runnumber          
        for (int i=0;i<runNumber;i++){
            //prints the generated character
            System.out.print(newChar.getRandomUpperCaseLetter());
        }
        //prints extra line
        System.out.println();
        //prints number of test runs
        System.out.print(runNumber+"x getRandomDigitCharacter: ");
        //runs the random digit character x runnumber
        for (int i=0;i<runNumber;i++){
            //prints the generated character
            System.out.print(newChar.getRandomDigitCharacter());
        }
        //prints extra line
        System.out.println();
        //prints number of test runs
        System.out.print(runNumber+"x getRandomCharacter: ");
        //runs the random character x runnumber
        for (int i=0;i<runNumber;i++){
            //prints the generated character
            System.out.print(newChar.getRandomCharacter());
        }
        //prints extra line
        System.out.println();
        //prints number of test runs
        System.out.print(runNumber+"x getRandomPrimeDigitCharacter: ");
        for (int i=0;i<runNumber;i++){
            //prints the generated character
            System.out.print(newChar.getRandomPrimeDigitCharacter());
        }
        //prints extra line
        System.out.println();
        //end main program
    }
}