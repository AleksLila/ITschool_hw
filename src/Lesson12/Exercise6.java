package Lesson12;

public class Exercise6 {
    public static void main(String[] args) {
        String string = "Гадаю1, це2 буде3 нова4 фіча5."+ "хорошо6 хорошо";

        System.out.println("Number of letters in the line : "+ countLetter(string));
        System.out.println("Number of digits in the line " + countDigits(string));
        System.out.println("Number of space in the line : " + countSpace(string));

    }
    public static int countLetter(String string) {
        int letterCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                letterCount++;
            }
        }
        return letterCount;
    }
    public static int countDigits(String string){
        int digitCount=0;
        for (int j = 0; j < string.length(); j++) {
            if (Character.isDigit(string.charAt(j))) {
                digitCount++;
            }
        }
        return digitCount;
    }
    public static int countSpace(String string){
        int spaceCount=0;
        for (int a = 0; a < string.length(); a++) {
            if (Character.isSpaceChar(string.charAt(a))) {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}
