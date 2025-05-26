package module_1;

import java.text.DecimalFormat;

public class Branching {

    public static void main(String[] args) {
        System.out.println(task1(30, 60));
        System.out.println(task2(98, 300, 56, 90));
        System.out.println(task3(1, 1, 2, 2, 3, 3));
        System.out.println(task4(15, 20, 25, 12, 6.5));
        System.out.println(task5(-3.3456));
    }

    public static String task1(double a, double b) {
        double result = a + b;
        double triangle = 180;
        double c = triangle - result;
        String message;
        if (a + b >= triangle || c <= 0) {
            message = ("Task 1: Треугольника не существует");
        } else {
            message = ("Task 1: Треугольник существует");
            if (a == 90 || b == 90 || c == 90) {
                message+= ( ", он прямоугольный");
            } else {
                message = ("");
            }
        }
        return message;
    }

    public static String task2(double a, double b, double c, double d) {
        double fline = Math.min(a, b);
        double sline = Math.min(c, d);
        return (fline > sline) ? "Task 2: min(a,b)" : "Task 2: min(c:d)";

    }

    public static String task3(double x1, double y1, double x2, double y2, double x3, double y3) {
        double x = (-x1) / (x2 - x1);
        double y = (-y1) / (y2 - y1);
        double xy = y - x;
        if (x3 - y3 == xy) {
            return ("Task 3: Точки лежат на одной прямой");
        } else {
            return ("Task 3: Точки не лежат на одной прямой");
        }
    }

    public static String task4(double A, double B, double x, double y, double z) {
        if (A > x && B > y || A > x && B > z || A > y && B > z) {
            return ("Task 4: Кирпич проходит");
        } else {
            return ("Task 4: Кирпич не проходит");
        }
    }

    public static String task5(double x) {
        double F1;
        double F2;
        F1 = Math.pow(x, 2)- 3 * x + 9 ;
        F2 = 1 / (Math.pow(x, 3) + 6);
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        String res1 = decimalFormat.format(F1);
        String res2 = decimalFormat.format(F2);

        if (x <= 3) {
            return ("Task 5: F(x)=" + res1);
        } else {
            return ("Task 5: F(x)=" + res2);
        }
    }
}
