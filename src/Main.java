// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    public static void task4() {
        int age = 13;
        if (age >=2 && age <=6) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в детский сад ");
        }
        if (age >=7 && age <= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно ходить в школу ");
        }
        if (age >18 && age < 24) {
            System.out.println(" Если возраст человека равен" + age + ", то ему нужно ходить в университет ");
        }
        if (age >24) {
            System.out.println(" если возраст человека равен" + age + ", то ему нужно ходить на работу ");
        }
    }
    public static void task5() {
        int age = 10;
        if (age <5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >=5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционне в сопровождении взрослого. Если врзослого нет, то кататься нельзя");
        }
        if (age >14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения");
        }
    }
    public static void task6() {
        int human = 89;
        if (human <60) {
            System.out.println(" в вагоне есть свободные сидяие и стоячие места");
        }
        if (human >=60 && human <=102) {
            System.out.println(" в вагоне остались свободные только стоячие места");
        } else {
            System.out.println("в вагоне мест нет");
        }
    }
    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        if ( one < three && two < three) {
            System.out.println(" число " + three + " больше всех ");
        } else {
            if (one < two && three < two) {
                System.out.println(" число " + two + " больше всех");
            }
            if (two < one && two < one) {
                System.out.println(" число " + one + " больше всез");
            }

        }
    }
    }

