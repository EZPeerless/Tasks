package module_1;

import java.util.ArrayList;
import java.util.List;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Task 1: " + task1(6));
        System.out.println("Task 2: " + task2(8, 14, 0.5));
        System.out.println("Task 3: " + task3(1, 100, 2));
        System.out.println("Task 4: " + task4(1, 200, 2 ));
    }


    public static int task1(int num) {
        int summa = 0;
        for (int i = 1; i <= num; i++) {
            summa += i;
        }
        return summa;

    }

    public static List<String> task2(double a, double b, double h) {
        List<String> results = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            double y = (x > 2) ? x : -x;
            results.add ("x =" + x + " -- y = " + y);
        }
        return results;
    }

    public static double task3(double x1, double x2, double stp) {
        double result=0;
        for (double sum = x1; sum<=x2; sum++) {
            result += Math.pow(sum, stp);
        }
        return result;
    }

    public static long task4(long x1, long x2, long stp) {
        /**  long result = 1;
        for (long sum=x1; sum<=x2; sum++) {
         result *= Math.pow(sum, stp);
        }
        return result;
        } */
    }
}