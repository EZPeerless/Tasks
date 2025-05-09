package module_1;

public class Linear {
    public static void main(String[] args) {
        task1(1, 3, 8);
        task2(7, 8, 2);
        task3(5, 9);
        task4(767.998);
        task5(125753434);
        task6(2, -1,0.5);
    }

    public static void method1(int number) {
        System.out.println("Hello" + number);
    }

    public static void task1(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        System.out.println("Task 1: " + z);
    }

    public static void task2(double a, double b, double c) {
        double res1 = Math.sqrt(Math.pow(b, 2) + 4 * a * c); // Результат вычеслений под корнем
        double res2 = b + res1; // Знаменатель дроби
        double res3 = 2 * a; // Делитель дроби
        double res4 = res2 / res3; // Трансформация дроби в число
        double res5 = Math.pow(a, 3) * c + Math.pow(b, -3);
        double res6 = res4 - res5;
        // System.out.println((b+res1)/2*a); // Вывод результата пристрелки
        System.out.println("Task 2: " + res6);
        /* double step = Math.pow(b, 4);
        System.out.println("Степень числа " + step);
        System.out.println("Корень из " + Math.sqrt(step)); */ // Чисто пристрелка
    }

    public static void task3(double x, double y) {
        double all = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * (Math.tan(x * y));
        System.out.println("Task 3: " + all);
    }

    public static void task4(double R) {
        double x = (int) R; // приводим переменную R к целочисленному значению
        double escape = (R - x) * 1000 + (x / 1000); // сам процесс (^_^)
        String result = String.format("%.3f", escape); // оганичиваем колличество знаков после точки до 3х
        System.out.println("Task 4: " + result);
    }

    private static void task5(int T) {
        int time = T / 1000; // Переводим миллисекнудны в секунды
        int hours = time / 3600;
        int minute = (time - (hours * 3600)) / 60;
        int seconds = (time - (hours * 3600)) - minute * 60;
        System.out.println("Task 5: " + hours + "ч " + minute + "мин " + seconds + "с");
    }

    private static void task6(double x, double y, double size) {

        // переменная size - устанавливает шаг сетки координат

        if (y >= -3*size && y < 0 && x >= -4*size && x <= 4*size) {
            System.out.println("Task 5: " + true);
        } else if (y >= 0 && y <= 4*size && x >= -2*size && x <= 2*size) {
            System.out.println("Task 5: " + true);
        } else {
            System.out.println("Task 5: " + false);
        }
    }
}


