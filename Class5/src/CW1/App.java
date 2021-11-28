package CW1;

import Fiqures.Circle;

import java.util.Arrays;

/**
 * @author Ahmed Ehab
 * Control Work No1.
 * По три балла на каждое задание. Один балл за умение использовать github.
 * Максимальный балл: 10.
 * <p>
 * Предварительные критерии оценивания. Могут быть изменены.
 * 0.
 * 1 балл: загружен используя github.
 * 0 баллов: используя другие средства (например, Teams).
 * 1.
 * 3 балла: массив создан верно, все тесты проходят. Решено используя массивы.
 * 2 балла: массив создается верно для общего случая. 3 теста из 5.
 * 1 балл: есть доля правды в решении / реализовано используя не массивы.
 * 0 баллов: задача не решена / тесты не проходят.
 * <p>
 * 2.
 * 3 балла: ответ верный, все тесты проходят. Использован эффективный метод.
 * 2 балла: ответ верный, использован неэффективный метод. 3 и более тестов проходят.
 * 1 балл: есть ход решения.
 * 0 балл: решения нет / менее 3 тестов пройдено.
 * <p>
 * 3.
 * 3 балла: ответ верный для всех случаев.
 * 2 балла: не выполнено одно из условий.
 * 1 балл: есть ход решения.
 * 0 баллов: решения нет / менее 3 тестов пройдено.
 * <p>
 * 1.
 * 2.
 * 3.
 * Итого:
 */

public class App {

    /**
     * 1.
     * Создать массив до заданного числа такой, что каждый элемент больше предыдущего на 7.
     * Начальное значние задается в параметре.
     * <p>
     * ENG:
     * Create an array up to the specified number such that each element is greater than the previous one by 7.
     * The initial value is set in the parameter.
     * <p>
     * PS: you can use only arrays.
     * <p>
     * Examples:
     * 0, -1 => []
     * 0, 1 => [0]
     * 0, 7 => [0, 7]
     * 7, 7 => [7]
     * 10, 25 => [10, 17, 24]
     */
    public static int[] getSevensArray(int start, int limit) {
        if (limit < start)
            return new int[]{};

        int size = ((limit - start) / 7) + 1;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = start + 7 * i;
        }
        return array;
    }


    /**
     * 2.
     * Дан массив. Найти второй самый большой элемент.
     * <p>
     * ENG:
     * Given an array. Find the second largest element.
     */
    public static int getSecondLargest(int[] array) {
        int max1=Integer.MIN_VALUE ,max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max1){
                max2 = max1;
                max1= array[i];
            }else if (array[i]>max2 && array[i] != max1){
                max2 = array[i];
            }
        }
        return max2;
    }

    /**
     * 3.
     * Дана строка, содержащая ISBN. Например, "ISBN 978-5-9775-0735-6". Проверить является ли ISBN валидным.
     * ISBN состоит из 13 цифр. Последняя цифра контрольная в вычислениях не учавствует.
     * Вычисляется по алгоритму EAN-13 следующим образом:
     * 1. вычисляется сумма цифр на четных позициях;
     * 2. полученная сумма умножается на три;
     * 3. вычисляется сумма цифр на нечетных местах;
     * 4. полученные числа в п.2 и п.3 складываем;
     * 5. отбрасываем десятки и отнимаем из 10, и получаем контрольную цифру.
     * Если последняя цифра числа из п.4 = 0, то контрольная цифра равна нулю.
     * Имейте ввиду, строка может содержать числа недостаточной длины, или дефисы могут быть где угодно.
     * <p>
     * ENG:
     * Given string contains ISBN, ie "ISBN 978-5-9775-0735-6". Check whether the ISBN is valid.
     * The ISBN consists of 13 digits. The last digit of the control does not participate in calculations.
     * Calculated using the EAN-13 algorithm as follows:
     * 1. the sum of digits in even positions is calculated;
     * 2. the resulting amount is multiplied by three;
     * 3. the sum of digits in odd places is calculated;
     * 4. we add the obtained numbers in item 2 and item 3;
     * 5. discard tens and subtract from 10, and get a check digit.
     * If the last digit of the number in step 4 is zero, the check digit is zero.
     * Keep in mind that the string may contain numbers of insufficient length, or hyphens may be anywhere.
     * Example:
     * 0. given "978-5-9775-0735-6" =>  "9785977507356"
     * 1. 7+5+7+5+7+5 = 36
     * 2. 36 * 3 = 108
     * 3. 9+8+9+7+0+3 = 36
     * 4. 108 + 36 = 144
     * 5. 10 - 4 = 6
     * 6. 6 == 6
     *
     * @return boolean
     */
    public static boolean isISBNValid(String str) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Задание №1.");
        int[] sevens;
        System.out.printf("Массив \"семёрок\": %s.%n", Arrays.toString(sevens = getSevensArray(1, 200)));
        System.out.printf("  Expected: [], actual: %s.%n", Arrays.toString(getSevensArray(0, -1)));
        System.out.printf("  Expected: [0], actual: %s.%n", Arrays.toString(getSevensArray(0, 1)));
        System.out.printf("  Expected: [0, 7], actual: %s.%n", Arrays.toString(getSevensArray(0, 7)));
        System.out.printf("  Expected: [7], actual: %s.%n", Arrays.toString(getSevensArray(7, 7)));
        System.out.printf("  Expected: [10, 17, 24], actual: %s.%n%n", Arrays.toString(getSevensArray(10, 25)));

        System.out.println("Задание №2.");
        System.out.printf("  Вторым самым большим элементом массива \"семёрок\" является %d.%n", getSecondLargest(sevens));
        System.out.printf("  Expected: %d, actual: %d.%n", 2, getSecondLargest(new int[]{1, 2, 3}));
        System.out.printf("  Expected: %d, actual: %d.%n", 2, getSecondLargest(new int[]{3, 2, 1}));
        System.out.printf("  Expected: %d, actual: %d.%n", 2, getSecondLargest(new int[]{1, 3, 2}));
        System.out.printf("  Expected: %d, actual: %d.%n%n", 2, getSecondLargest(new int[]{2, 3, 1}));
        System.out.printf("  Expected: %d, actual: %d.%n%n", 2, getSecondLargest(new int[]{2,4}));
        System.out.printf("  Expected: %d, actual: %d.%n%n", 2, getSecondLargest(new int[]{2,4,4}));

        System.out.println("Задание №3.");

        System.out.printf("  ISBN 978-5-9775-0735-6 %s.%n", isISBNValid("978-5-9775-0735-6") ? "правильный" : "ошибочный");
        System.out.printf("  ISBN 978-1-60309-432-0 %s.%n", isISBNValid("978-1-60309-432-0") ? "правильный" : "ошибочный");
        System.out.printf("  ISBN 978-5-9775-0735-4 (ложный) %s.%n", isISBNValid("978-5-9775-0735-4") ? "правильный" : "ошибочный");
        System.out.printf("  ISBN 116 (ложный) %s.%n", isISBNValid("116") ? "правильный" : "ошибочный");
        System.out.printf("  ISBN 000 (ложный) %s.%n", isISBNValid("000") ? "правильный" : "ошибочный");
    }
}
