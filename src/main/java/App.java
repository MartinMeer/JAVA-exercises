import java.util.Arrays;

/*Название метода bubbleSort не отражает его функциональность. Рекомендуется использовать более информативное название, например sortNumbers.
Переменная stepsCount можно объявить внутри цикла do-while, так как она используется только внутри этого цикла.
Вместо использования do-while цикла, можно использовать обычный while цикл, так как условие выполнения цикла не зависит от первоначального значения isSwapped.
Добавить проверку на null для массива numbers, чтобы избежать возможности возникновения NullPointerException.
Добавить проверку на пустой массив numbers, чтобы избежать лишних итераций цикла.
Добавить аннотацию @param для параметра numbers, чтобы указать, что это массив чисел.
Добавить аннотацию @return для метода sortNumbers, чтобы указать, что метод ничего не возвращает.
Внутри цикла while переменная stepsCount инициализируется на каждой итерации, что является избыточным.
    Рекомендуется инициализировать stepsCount один раз перед циклом.
Внутри цикла for переменная givenNumber имеет неинформативное название.
    Рекомендуется использовать более понятное название, например temp.
Внутри цикла for необходимо добавить проверку на выход за границы массива.
    В текущей реализации, если i равно numbers.length - 1, то обращение к numbers[i + 1] вызовет ArrayIndexOutOfBoundsException.
    Рекомендуется добавить условие if (i < stepsCount) перед обращением к элементу массива.*/
public class App {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 2, 6, 9, 3, 4, 1, 9};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] numbers) { //написано по рекомендациям TotaAI - не работает, если в последней паре первое число < второго числа!
        boolean isSwapped = true;
        while (isSwapped) {
            int stepsCount = numbers.length - 1;
            isSwapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int givenNumber = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = givenNumber;
                    isSwapped = true;
                }
            }
        }
    }
    public static void bubbleSortNumbers1(int[] numbers) {
        //int stepsCount = numbers.length - 1;
        boolean isSwapped;
        do {
            int stepsCount = numbers.length - 1;
            isSwapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int givenNumber = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = givenNumber;
                    isSwapped = true;
                }
            }
            //stepsCount--;
        } while (isSwapped);
    }
}
