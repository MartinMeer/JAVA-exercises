import java.util.Arrays;

/*Алгоритм состоит из повторяющихся проходов по сортируемому массиву.
За каждый проход элементы последовательно сравниваются попарно
и, если порядок в паре неверный, выполняется обмен элементов.
Проходы по массиву повторяются N-1 раз
или до тех пор,пока на очередном проходе не окажется, что обмены больше не нужны, что означает — массив отсортирован.
При каждом проходе алгоритма по внутреннему циклу,
очередной наибольший элемент массива ставится на свое место в конце массива рядом с предыдущим «наибольшим элементом»,
а наименьший элемент перемещается на одну позицию к началу массива («всплывает» до нужной позиции, как пузырек в воде. Отсюда и название алгоритма).*/
public class App {
    public static void main(String[] args) {
        int[] numbers = {5, 8 ,2, 4, 7, 1, 6, 9, 3};
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }

    public static int[] bubbleSort(int[] numbers) {
        int[] sortedNumbers = new int[numbers.length];
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    sortedNumbers[i] = numbers[i + 1];
                    sortedNumbers[i + 1] = numbers[i];
                } else {
                    sortedNumbers[i] = numbers[i];
                    sortedNumbers[i + 1] = numbers[i + 1];
                }
            }
        return sortedNumbers;
    }
}
