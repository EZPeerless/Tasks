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
        System.out.println("Task 5: " + task5(35, 26));
        task6();
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
    public static double task5(double end, double e) {
        double summa = 0;
        for (double n = 1; n <= end; n++) {
            double a = (1 / Math.pow( 2, n )) + (1 /Math.pow( 3, n));
                // System.out.println("A ="+a+":   N ="+n);
            if (Math.abs(a) >= Math.abs(e)) {
                summa += a;
                // System.out.println("N - "+n+";"+"A =:"+a+":"+" ="+summa);
                // System.out.println(" ");
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
        char[] charArray;
        charArray = new char [15];
        System.out.println("Введите символ: ");
        charArray=

        String userInputString = " " + userInput;
        if (userInput.length() > 15) {
            System.out.println("Меньше текста брат");
        } else {
            for (char reuse : charArray) {
                System.out.println(reuse);
            }
        }



        System.out.print("Task 6: " + userInput);
    }


}