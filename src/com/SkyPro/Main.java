package com.SkyPro;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray(); //
        Arrays.sort(arr);
        /* Task #1
        Посчитать сумму всех выплат за месяц.
        Написать программу, которая решит эту задачу, и вывести в консоль результат в формате:
        «Сумма трат за месяц составила … рублей».
         */
        int sumSalary = 0;

        int i = 0;
        for (int j : arr) {
            i += 1;
            sumSalary += j * 30; // per month
            if (i != arr.length) {
                System.out.print(j + ", ");
            } else {
                System.out.print(j + " ");
            }
        }
        System.out.println(); // empty line

        System.out.print("The amount of expenses for the month was " + sumSalary + " rubles");

        System.out.println(); // empty line

        /* Task #2
        Найти минимальную и максимальную трату за день. Нужно написать программу, которая решит эту задачу,
        и вывести в консоль результат в формате:
        «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        int minSalary = arr[1];
        int maxSalary = arr[0];

        for (final int current : arr) {
            if (current > maxSalary) {
                maxSalary = current;
            }
            if (current < minSalary) {
                minSalary = current;
            }
        }
        System.out.println("The minimum amount spent per day was " + minSalary + " rubles. " + "The maximum amount spent per day was " + maxSalary + " rubles. "  );

         /* Task #3
        Посчитать среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
         */
        float averageSalary = (float) sumSalary / 30;
        System.out.print("The average amount spent for the month was " + averageSalary + " rubles");

        System.out.println(); // empty line

        /* Task #4
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
         */
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int n = reverseFullName.length - 1; n >= 0; n--) {
            System.out.print(reverseFullName[n]);
            }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}

