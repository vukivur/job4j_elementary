package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        array = SwitchArray.swapArrayString(array, index, i);
                        break;
                    }
                }
            }
        }
        return array;
    }
}
