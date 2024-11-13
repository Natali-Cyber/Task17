import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    // Метод для удаления дубликатов из списка строк
    public static List<String> removeDuplicates(List<String> list) {
        // Используем стрим для обработки списка
        return list.stream() // Создаем стрим из списка
                .distinct() // Убираем дубликаты
                .collect(Collectors.toList()); // Собираем обратно в список
    }
}