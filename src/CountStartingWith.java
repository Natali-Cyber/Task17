import java.util.List;

public class CountStartingWith {
    // Метод для подсчета строк, начинающихся на заданную букву
    // long: Метод возвращает значение типа long, которое представляет собой количество строк, начинающихся с заданной буквы.
    // Метод принимает два параметра:
    // List<String> list: список строк, в котором будет производиться поиск.
    // char letter: буква, с которой должны начинаться строки.
    public static long countStringsStartingWith(List<String> list, char letter) {
        // Используем стрим и фильтруем строки
        return list.stream() // Создаем стрим из списка
                // s -> !s.isEmpty() && s.charAt(0) == letter: Это лямбда-выражение, которое выполняет две проверки:
                // !s.isEmpty(): Проверяет, что строка не пустая. Это важно, чтобы избежать ошибок при попытке получить первый символ пустой строки.
                // s.charAt(0) == letter: Проверяет, что первый символ строки равен заданной букве letter.
                .filter(s -> !s.isEmpty() && s.charAt(0) == letter) // Проверяем на пустые строки и соответствие первой буквы
                .count(); // Считаем количество строк, прошедших фильтрацию
    }
}
