import java.util.List;
import java.util.Optional;

public class FindSecondLargest {
    // Метод для поиска второго по величине уникального числа в списке
    public static Optional<Integer> findSecondLargest(List<Integer> list) {
        return list.stream() // Создаем поток из списка
                .distinct() // Убираем дубликаты, чтобы не учитывать их при поиске
                .sorted((a, b) -> b - a) // Сортируем по убыванию. Лямбда-выражение (a, b) -> b - a определяет порядок сортировки: если b больше a, результат будет положительным, что означает, что b будет стоять перед a в отсортированном порядке.
                .skip(1) // Пропускаем первый (максимальный) элемент
                .findFirst(); // Возвращаем следующий элемент (второй по величине)
    }
}