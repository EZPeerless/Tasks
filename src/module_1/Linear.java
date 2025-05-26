package module_1;

public class Linear {
    public static void main(String[] args) {
        System.out.println("Task 1: " + task1(2,3,8));
        System.out.println("Task 2: " + task2(7, 8, 2));
        System.out.println("Task 3: " + task3(5, 9));
        System.out.println("Task 4: " + task4(767.998));
        System.out.println("Task 5: " + task5(125753434));
        System.out.println(task6(2, -1,0.5));
    }

    public static void method1(int number) {
        System.out.println("Hello" + number);
    }

    public static double task1(double a, double b, double c) {
        return  ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        double res1 = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        double res2 = b + res1;
        double res3 = 2 * a;
        double res4 = res2 / res3;
        double res5 = Math.pow(a, 3) * c + Math.pow(b, -3);
        return res4 - res5;
    }

    public static double task3(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x * y));
    }

    public static String task4(double R) {
        double x = (int) R;
        double escape = (R - x) * 1000 + (x / 1000);
        return String.format("%.3f", escape);
    }

    private static String task5(int T) {
        int time = T / 1000;
        int hours = time / 3600;
        int minute = (time - (hours * 3600)) / 60;
        int seconds = (time - (hours * 3600)) - minute * 60;
        return (hours + "ч " + minute + "мин " + seconds + "с");
    }

    private static String task6(double x, double y, double size) {

        if (y >= -3*size && y < 0 && x >= -4*size && x <= 4*size) {
            return ("Task 6: " + true);
        } else if (y >= 0 && y <= 4*size && x >= -2*size && x <= 2*size) {
            return ("Task 6: " + true);
        } else {
            return ("Task 6: " + false);
        }
    }
}


