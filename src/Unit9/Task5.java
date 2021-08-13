package Unit9;
//Напишите функцию insert_dash(str), которая принимает строку str в качестве аргумента и вставляет тире (-) между
//словами. При этом все символы строки необходимо перевести в верхний регистр.

public class Task5 {
    String insert_dash(String str){
        return str.toUpperCase().replace(' ','-');
    }
}
