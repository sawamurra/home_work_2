package org.home_work;

import java.util.Scanner;

public class z2 {

        public static int binarySearch(int[] massiv, int searchElement) {
            int left = 0;
            int right = massiv.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (massiv[mid] == searchElement) {
                    return mid;
                }

                if (massiv[mid] < searchElement) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }

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
            // Задается элемент, который необходимо найти
            System.out.print("Введите элемент для поиска: ");
            int searchElement = scanner.nextInt();

            int index = binarySearch(massiv, searchElement);

            // Если элемент найден, то выводится его индекс
            if (index != -1) {
                System.out.println("Элемент найден на позиции " + index);
            }
            // Вывод если элемент не найден
            else {
                System.out.println("Элемент не найден");
            }
        }
    }