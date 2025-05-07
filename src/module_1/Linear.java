package module_1;

public class Linear {
    public static void main(String[] args) {
        task2(4, 2, 2);
    }

    public static void method1(int number) {
        System.out.println("Hello" + number);
    }

    public static void task1(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

    public static void task2(double a, double b, double c) {
        double res1 = Math.sqrt(Math.pow(b, 2) + 4 * a * c); // Результат вычеслений под корнем
        double res2 = b + res1; // Знаменатель дроби
        double res3 = 2 * a; // Делитель дроби
        double res4 = res2 / res3; // Трансформация дроби в число
        double res5 = Math.pow(a, 3) * c + Math.pow(b, -3);
        double res6 = res4 - res5;


        // System.out.println((b+res1)/2*a); // Вывод результата пристрелки
        System.out.println(res6);
       /* double step = Math.pow(b, 4);
        System.out.println("Степень числа " + step);
        System.out.println("Корень из " + Math.sqrt(step)); */ // Чисто пристрелка
    }

}

