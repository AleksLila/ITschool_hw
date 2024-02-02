package Lesson10;

import java.util.Arrays;

public class Memory12 {


    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null,
                            "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
    public static void executeDefragmentation(String[] array) {

        int writeIndex = 0;

        for (String element : array) {
            if (element != null) {
                array[writeIndex++] = element;
            }
        }

        // Заповнюємо залишковий простір "дірками"
        while (writeIndex < array.length) {
            array[writeIndex++] = null;
        }
    }

}
