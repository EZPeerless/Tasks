package module_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Task 1: " + task1(6));
        System.out.println("Task 2: " + task2(8, 14, 0.5));
        System.out.println("Task 3: " + task3(1, 100, 2));
        System.out.println("Task 4: " + task4(1, 200, 2));
        System.out.println("Task 5: " + task5(37));
        task6();
        task7();
        System.out.println("Task 8: " + task8());
    }

    /*
    Задание 1.
    Напишите программу, где пользователь вводит любое целое положительное число, а программа
    суммирует все числа от 1 до введенного пользователем числа.
     */
    public static int task1(int number) {
        int summa = 0;
        for (int i = 1; i <= number; i++) {
            summa += i;
        }
        return summa;

    }

    /*
    Задание 2.
    Вычислить значения функции на отрезке [a, b] с шагом h
     */
    public static List<String> task2(double a, double b, double h) {
        List<String> result = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            double y = (x > 2) ? x : -x;
            result.add("x =" + x + " -- y = " + y);
        }
        return result;
    }

    /*
    Задание 3.
    Найти сумму квадратов первых ста чисел
     */
    public static double task3(double x1, double x2, double exponent) {
        double result = 0;
        for (double summa = x1; summa <= x2; summa++) {
            result += Math.pow(summa, exponent);
        }
        return result;
    }

    /*
    Задание 4.
    Составить программу нахождения произведения квадратов первых двухсот чисел
     */
    public static BigInteger task4(int start, int end, int exponent) {
        BigInteger product = BigInteger.ONE;
        for (int summa = start; summa <= end; summa++) {
            BigInteger base = BigInteger.valueOf(summa);
            BigInteger upScale = base.pow(exponent);
            product = product.multiply(upScale);
        }
        return product;
    }

    /*
    Задание 5.
    Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или
    равен заданному e. Общий член ряда имеет вид:
     */
    public static double task5(double e) {
        double summa = 0;
        for (double n = 1; ; n++) {
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (Math.abs(a) >= Math.abs(e)) {
                summa += a;
            } else {
                break;
            }
        }
        return summa;
    }

    /*
    Задание 6.
    Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера.
     */
    public static void task6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Task 6: Введите символ: ");
        String inputLine = input.nextLine();
        int lenghtInput = inputLine.length();
        char chararray[] = new char[lenghtInput];
        System.out.println("Task 6: ");
        for (int i = 0; i < lenghtInput; i++) {
            chararray[i] = inputLine.charAt(i);
            System.out.println(chararray[i] + " " + i + " " + " " + (int) inputLine.charAt(i));// .charAt(i);
        }
    }

    /*
    Задание 7.
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого
    числа. m и n вводятся с клавиатуры.
     */
    public static void task7() {
        System.out.println("Task 7:");
        Scanner m = new Scanner(System.in);
        System.out.print("Введите число, с которого начинать подбор: ");
        int mInput = m.nextInt();
        Scanner n = new Scanner(System.in);
        System.out.print("ВВедите число на котором закончится подбор: ");
        int nInput = n.nextInt();
        for (; mInput <= nInput; mInput++) {
            System.out.println("Task 7: Делители числа: " + mInput);
            for (int divider = 2; divider < mInput; divider++) {
                int remains = mInput % divider;
                if (remains == 0) {
                    System.out.print(" " + divider + ";");
                }
            }
            System.out.println(" ");
        }
    }

    /*
    Задание 8.
    Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.
     */
    public static String task8() {
        Scanner first = new Scanner(System.in);
        System.out.print("Task 8: Введите первое число: ");
        String firstNumber = first.nextLine();
        int firstLength = firstNumber.length();

        Scanner second = new Scanner(System.in);
        System.out.print("Task 8: Введите второе число: ");
        String secondNumber = second.nextLine();
        int secondLength = secondNumber.length();

        String printed = "";

        if (firstLength<secondLength){
            for (int i = 0; i < firstLength; i++) {
                char one = firstNumber.charAt(i);
                for (int y = 0; y < secondLength; y++) {
                    int two = secondNumber.charAt(y);
                    if (one == two && printed.indexOf(one) == -1) {
                        int num = Character.getNumericValue(one);
                        System.out.print(num);
                        printed += num;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < secondLength; i++) {
                int one = secondNumber.charAt(i);
                for (int y = 0; y < firstLength; y++) {
                    char two = firstNumber.charAt(y);
                    if (one == two && printed.indexOf(one) == -1) {
                        int num = Character.getNumericValue(one);
                        System.out.print(num);
                        printed += num;
                        break;
                    }
                }
            }
        }
        return printed;
    }

}
// конец класса