/**
 * Created by Панащенко Василий vasssil@yandex.ru.
 */
public class MainClass {

    public static void main(String[] args) {
        createVariable();
        System.out.println(calculate(1, 2, 3, 4));
        System.out.println(task10and20(10, 3));
        isPositiveOrNegative(-1);
        System.out.println(isNegative(5));
        greetings("Bob");
        checkTheYear(400);
}

    static void createVariable() {
        byte bt = 127;
        short sh = 32767;
        int in = 2147483647;
        long lg = 9223372036854775807L;
        float ft = 2147483647.1f;
        double dbl = 9223372036854775807.1234;
        char ch = 'A';
        boolean bl = true;
        calculate(4, 4, 4, 0);
        String str = "Hello";
    }

    static int calculate(int a, int b, int c, int d) {
        if(d == 0) return 0;
        return a * (b + (c / d));
    }

    static boolean task10and20(int num1, int num2) {
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }

    static void isPositiveOrNegative(int x) {
        if (x < 0) System.out.println(a + " is Negitive");
        else System.out.println(a + " is Positive");
    }

    static boolean isNegative (int x) {
        if (x < 0) return true;
        return false;
    }

    static void greetings(String name) {
        System.out.println("Hi, " + name + "!");
    }

    static void checkTheYear (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap " + year);
        else
            System.out.println("Not leap " + year);
    }
}