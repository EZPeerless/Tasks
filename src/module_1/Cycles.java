package module_1;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Task 1: " + task1(6));
        task2(1, 4, 0.5);
    }

    public static int task1(int num) {
        int summa = 0;
        for (int i = 1; i <= num; i++) {
            summa += i;
        }
        return summa;

    }

    public static void task2(double a, double b, double h) {

        for (double x = a; x <= b; x += h) {
            double y = 0;
            if (x > 2) {
               y = x;
            } else {
                y = -x;
            }
            System.out.println("x =" + x + ", y = " + y);
        }
    }


}
