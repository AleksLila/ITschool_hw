package Lesson8;

public class Exercise8 {
    public static void main(String[] args) {
        String string = "Щоб стати програмістом, потрібно писати код. Щоб писати код, потрібно вчитися. Для навчання потрібне бажання.";
        String word = "Щоб";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Індекс першого символу першого слова \"" + word + "\" дорівнює " + indexFromFirstWord);
        System.out.println("Індекс першого символу останнього слова \"" + word + "\" дорівнює " + indexFromLastWord);
    }
    public static int getIndexFromFirstWord(String string, String word) {
//напишіть тут ваш код
        int indexFirst=string.indexOf(word);
        return indexFirst;
    }
    public static int getIndexFromLastWord(String string, String word) {
//напишіть тут ваш код
        int indexLast=string.lastIndexOf(word);
        return indexLast;
    }

}
