package Lesson12_2;

public class Exercise6 {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." + "Тільки нікому не кажіть, що вона виникла випадково.";
        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));

    }
    public static int countDigits(String string) {
        int countDigits=0;
           for(int i=0; i<string.length(); i++){
              if(Character.isDigit(string.charAt(i))){
                  countDigits++;
               }
           }
           return countDigits;
    }
    public static int countLetters(String string) {
        int countLetters=0;
           for(int i=0; i<string.length(); i++){
               if(Character.isLetter(string.charAt(i))){
                   countLetters++;
               }
           }
           return countLetters;
    }
    public static int countSpaces(String string) {
          int countSpaces=0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isSpaceChar(string.charAt(i))){
                countSpaces++;
            }
        }
        return countSpaces;
    }

}
