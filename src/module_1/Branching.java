package module_1;

public class Branching {
    public static void main(String[] args) {
        task1(90, 90);
    }

    public static void task1(double a, double b) {
        double result = a + b;
        if (result < 180) {
            System.out.println("Существует");
        } else {
            System.out.println("не существует");
        }
        if (a==90 || b==90) {
            System.out.println("Прямоугольный");
        }
    }
}
