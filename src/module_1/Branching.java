package module_1;

public class Branching {

    public static void main(String[] args) {
        task1(30, 60);
        task2(98, 300, 56, 90);
        task3(1, 1, 2, 2, 3, 3);
        task4(15, 20, 25, 12, 6.5);
        task5(-3);
    }

    public static void task1(double a, double b) {
        double result = a + b;
        double triangle = 180;
        double c = triangle - result;
        if (a + b >= triangle || c <= 0) {
            System.out.println("Task 1: Треугольника не существует");
        } else {
            System.out.print("Task 1: Треугольник существует");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println(", он прямоугольный");
            } else {
                System.out.println();
            }
        }
    }

    public static void task2(double a, double b, double c, double d) {
        /* System.out.println(Math.max(Math.min(a,b),Math.min(c,d))); */ // более простой и логичный вариант через Math.
        double fline = Math.min(a, b);
        double sline = Math.min(c, d);
        String answer = (fline > sline) ? "Task 2: min(a,b)" : "Task 2: min(c:d)";
        System.out.println(answer);
    }

    public static void task3(double x1, double y1, double x2, double y2, double x3, double y3) {
        double x = (-x1) / (x2 - x1);
        double y = (-y1) / (y2 - y1);
        double xy = y - x;
        if (x3 - y3 == xy) {
            System.out.println("Task 3: Точки лежат на одной прямой");
        } else {
            System.out.println("Task 3: Точки не лежат на одной прямой");
        }
    }

    public static void task4(double A, double B, double x, double y, double z) {
        if (A > x && B > y || A > x && B > z || A > y && B > z) {
            System.out.println("Task 4: Кирпич проходит");
        } else {
            System.out.println("Task 4: Кирпич не проходит");
        }
    }

    public static void task5(double x) {
        double F1;
        double F2;
        F1 = (x * x) - (3 * x) + 9;
        F2 = 1 / (Math.pow(x, 3) + 6);
        if (x <= 3) {
            System.out.println("Task 5: F(x)=" + F1);
        } else {
            System.out.println("Task 5: F(x)=" + F2);
        }
    }
}
