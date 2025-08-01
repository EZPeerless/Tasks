package module_2;

import java.util.Scanner;

public class Array {

    public static void main(String[] args){
        System.out.println("Task 1: Ответ: " + task1());
    }

    /*
     Задание 1:
     В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
     данному K.
     */
    public static int task1() {
        Scanner arrayLenght = new Scanner(System.in);
        System.out.print("Task 1: Введите длину массива ");
        int N = arrayLenght.nextInt();
        int[] A;
        A = new int[N];
        Scanner array = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.print("Task 1: Введите значение позиции " + i + " в массиве ");
            A[i] = array.nextInt();
        }
        Scanner comparsionObject = new Scanner(System.in);
        System.out.println("Task 1: Введите объект сравнения ");
        int K = comparsionObject.nextInt();
        int results = 0;
        for (int i = 0; i < N; i++) {
            int remains = A[i] % K;
            if (remains == 0) {
                results += A[i];
            }
        }
        return results;
    }
}

