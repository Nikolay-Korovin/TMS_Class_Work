package Unit9;

//Напишите функцию, которая принимает строку в качестве аргумента и
//преобразует регистр первого символа строки из нижнего регистра в верхний.

import java.util.Locale;

public class Task6 {
    String firstCharToUpperCase(String str) {
        str = str.trim();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                stringBuilder.append(String.valueOf(str.charAt(i)).toUpperCase());
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return String.valueOf(stringBuilder);
    }
}
