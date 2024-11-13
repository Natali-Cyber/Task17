import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Создание списка строк с использованием метода Arrays.asList().
        // Метод принимает массив значений и возвращает список, содержащий эти значения.
        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        // Удаление дубликатов из списка строк
        // Результат сохраняется в переменной uniqueList
        List<String> uniqueList = RemoveDuplicates.removeDuplicates(stringList);
        System.out.println("Уникальные элементы: " + uniqueList); // Выводим уникальные элементы на консоль.

        // Подсчет строк, начинающихся с буквы 'b'
        // Результат сохраняется в переменной count.
        long count = CountStartingWith.countStringsStartingWith(stringList, 'b');
        System.out.println("Количество строк, начинающихся с 'b': " + count); // Выводим результат подсчета на консоль.

        // Создание списка целых чисел с использованием Arrays.asList().
        List<Integer> intList = Arrays.asList(10, 20, 30, 20, 10, 40, 50, 50);

        // Поиск второго по величине элемента
        // Результат возвращается в виде объекта Optional<Integer>, который может содержать значение или быть пустым.
        Optional<Integer> secondLargest = FindSecondLargest.findSecondLargest(intList);
        // Используем ifPresentOrElse для обработки результата
        // Метод ifPresentOrElse проверяет, есть ли значение в объекте Optional.
            // Если значение присутствует (value), оно выводится на консоль как "Второй по величине элемент: [значение]".
            // Если значение отсутствует, выводится сообщение "Второго по величине элемента нет."
        secondLargest.ifPresentOrElse(
                value -> System.out.println("Второй по величине элемент: " + value),
                () -> System.out.println("Второго по величине элемента нет.")
        );
    }
}
