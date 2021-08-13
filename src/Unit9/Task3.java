package Unit9;

//Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
// Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию, оценку и название
// предмета в качестве параметров. Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.

public class Task3 {

    static void info(String surname, int score, String discipline) {
        String scoreStr = String.valueOf(score);

        if (surname.length() > 14) {
            surname = surname.substring(0, 15);
        }
        if (scoreStr.length() > 2) {
            scoreStr = scoreStr.substring(0, 3);
        }
        if (discipline.length() > 9) {
            discipline = discipline.substring(0, 10);
        }
        System.out.printf("студент %s получил %s по предмету %s", surname, scoreStr, discipline);
    }

}
