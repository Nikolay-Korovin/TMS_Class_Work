package Unit9;
//Напишите функцию capitalize(str), которая возвращает строку, в которой каждое слово начинается с заглавной буквы.

public class Task7 {
    String capitalize(String str) {
        str.trim();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(str.charAt(0)).toUpperCase());

        for (int i = 1; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(String.valueOf(str.charAt(i + 1)).toUpperCase());
                i++;
            } else {
                stringBuilder.append(str.charAt(i));
            }

        }
        return String.valueOf(stringBuilder);
    }
}
