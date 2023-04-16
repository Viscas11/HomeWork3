// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний ");
        }

        if (age < 18) {
            System.out.println("Еслив возраст человека равен " + age + ", то он не достиг совершенолетия, нужно немного подождать ");
        }
    }

    public static void task2() {
        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature < 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

}