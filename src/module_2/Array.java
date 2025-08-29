package module_2;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        System.out.println("Task 1: Ответ: " + task1());
        System.out.println("Task 2: Ответ: " + task2());
        System.out.println("Task 3: Ответ: " + task3());
        System.out.println("Task 4: Ответ: " + task4());
        task5();
        System.out.println("Task 6: Сумма таких чисел " + task6());
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
        System.out.print("Task 1: Введите объект сравнения ");
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

    /*
     Задание 2:
     Дана последовательность чисел действительных чисел a1, a2, ..., an. Заменить все ее члены,
     больше данного Z, этим числом. Подсчитать количество замен.
     */
    public static int task2() {
        int replacementCounter = 0;
        Scanner sequenceLenght = new Scanner(System.in);
        System.out.print("Task 2: Задайте длину последовательности чисел ");
        int n = sequenceLenght.nextInt();
        double[] seqofnumbers;
        seqofnumbers = new double[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            seqofnumbers[i] = random.nextInt(2500);
        }

        Scanner compared = new Scanner(System.in);
        System.out.print("Task 2: Введите число для сравнения ");
        int Z = compared.nextInt();

        for (int i = 0; i < n; i++) {
            double a = seqofnumbers[i];
            if (a > Z) {
                seqofnumbers[i] = Z;
                replacementCounter += 1;
            }
        }
        return replacementCounter;
    }

    /*
     Задание 3:
     Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нём
     отрицательных, положительных и нулевых значений.
     */
    public static String task3() {
        Scanner arrayLenght = new Scanner(System.in);
        System.out.print("Task 3: Введите длину массива ");
        int N = arrayLenght.nextInt();

        double[] arrayofnumbers;
        arrayofnumbers = new double[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arrayofnumbers[i] = random.nextDouble(50 + 50) - 50;
        }
        int neg = 0;
        int pos = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (arrayofnumbers[i] > 0) {
                pos += 1;
            } else if (arrayofnumbers[i] == 0) {
                zero += 1;
            } else {
                neg += 1;
            }
        }
        String second = zero + " нулевых значений, " + pos + " положительных чисел";
        return "Task 3: В данном массиве " + neg + " отрицательных чисел, " + second;
    }

    /*
     Задание 4:
     Даны действительные числа a1, a2, ..., an. Поменять местами наибольший и наименьший элементы.
     */
    public static String task4() {
        Random randomNumeric = new Random();

        Scanner lenghtArray = new Scanner(System.in);
        System.out.print("Task 4: Введите длину последовательность ");
        int n = lenghtArray.nextInt();
        double[] sequence;
        sequence = new double[n];
        double min = 0;
        double max = 0;
        for (int i = 0; i < n; i++) {
            sequence[i] = randomNumeric.nextDouble(100 + 100) - 100;
            if (min > sequence[i]) {
                min = sequence[i];
            } else if (max < sequence[i]) {
                max = sequence[i];
            }
        }
        return "Наименьшее число последовательности - " + min + ", наибольшее - " + max;
    }

    /*
     Задание 5:
     Даны целые числа a1, a2, ..., an. Вывести на печать только те числа, для которых ai > i.
     */
    public static void task5() {
        Random randomNumeric = new Random();
        Scanner lenghtArray = new Scanner(System.in);
        System.out.print("Task 5. Введите длину числового ряда ");
        int n = lenghtArray.nextInt();
        int[] sequence;
        sequence = new int[n];
        System.out.print("Task 5: Это числа - ");
        for (int i = 0; i < n; i++) {
            sequence[i] = randomNumeric.nextInt(50 + 50) - 50;
            if (sequence[i] > i) {
                System.out.print(sequence[i] + ", ");
            }
        }
        System.out.println(" ");
    }

    /*
     Задание 6:
     Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
     являются простыми числами.
     */
    public static double task6() {
        Scanner lenghtArray = new Scanner(System.in);
        System.out.print("Task 6: Введите длину последовательности ");
        int N = lenghtArray.nextInt();

        Random randomNumeric = new Random();
        double[] sequence;
        sequence = new double[N];
        double numberSum = 0;

        for (int i = 0; i < N; i++) {
            sequence[i] = randomNumeric.nextDouble(150 + 150) - 150;
        }

        for (int i = 1; i <= N; i++) {
            boolean logic = true;

            if (i < 2) {
                logic = false;
            } else {
                for (int d = 2; d <= Math.sqrt(i); d++) {
                    if (i % d == 0) {
                        logic = false;
                        break;
                    }
                }
            }
            if (logic) {
                numberSum += sequence[i - 1];
            }
        }
        return numberSum;
    }
}

