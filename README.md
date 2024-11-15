# Удаление дубликатов, подсчет строк и поиск второго по величине элемента

Этот проект демонстрирует использование функционального программирования на Java с использованием стримов для работы со списками строк и целых чисел. Он состоит из нескольких классов, каждый из которых выполняет отдельную задачу.

## Структура проекта

### 1. `RemoveDuplicates`
- **Метод**: `removeDuplicates(List<String> list)`
- **Описание**:
    - Принимает список строк и возвращает новый список, содержащий только уникальные строки.
    - Использует методы стрима: `stream()`, `distinct()` и `collect(Collectors.toList())`.

### 2. `CountStartingWith`
- **Метод**: `countStringsStartingWith(List<String> list, char letter)`
- **Описание**:
    - Принимает список строк и букву, возвращает количество строк, начинающихся с указанной буквы.
    - Использует `filter()` для фильтрации строк и `count()` для подсчета.

### 3. `FindSecondLargest`
- **Метод**: `findSecondLargest(List<Integer> list)`
- **Описание**:
    - Принимает список целых чисел и находит второй по величине уникальный элемент.
    - Удаляет дубликаты, сортирует по убыванию и использует `skip(1)` для пропуска максимального значения.

### 4. `Main`
- **Класс**: `Main`
- **Описание**:
    - Содержит метод `main`, который демонстрирует использование классов `RemoveDuplicates`, `CountStartingWith` и `FindSecondLargest`.
    - Примеры создания списков, вызов методов и вывод результатов на консоль.