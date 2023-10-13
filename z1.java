package org.home_work;

import java.util.Scanner;
public class z1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задается количество элементов массива
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] massiv = new int[n];

        // Задаются значения элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
        }
// Начало сортировки
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    // Обмен элементов
                    //temp является временной переменной
                    int temp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}