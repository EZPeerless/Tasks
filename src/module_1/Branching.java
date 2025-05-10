package module_1;

public class Branching {

    public static void main(String[] args) {
        task1(30, 60);
        task2(98, 300, 56, 90);
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
        double fline=Math.min(a,b);
        double sline=Math.min(c,d);
        String answer=(fline>sline) ? "Task 2: min(a,b)" : "Task 2: min(c:d)";
        System.out.println(answer);
    }

    }
