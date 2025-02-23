import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.print("Введите температуру: ");
        int temperature = scanner.nextInt();
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        System.out.print("Введите скорость: ");
        int speed = scanner.nextInt();
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        System.out.print("Введите возраст: ");
        int PersonAge = scanner.nextInt();
        if (2 < PersonAge  && PersonAge < 6) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то ему нужно ходить в детский сад.");
        } else if (2 < PersonAge && PersonAge < 17) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то ему нужно ходить в школу.");
        } else if (18 <= PersonAge && PersonAge < 24) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то его место в университете.");
        } else if (24 < PersonAge) {
            System.out.println("Если возраст человека равен " + PersonAge + ", то ему пора ходить на работу.");
        }

        System.out.print("Введите возраст: ");
        int ChildAge = scanner.nextInt();
        if (5 > ChildAge) {
            System.out.println("Если возраст ребенка равен " + ChildAge + ", то он не может кататься на аттракционе.");
        } else if (5 < ChildAge && ChildAge <14) {
            System.out.println("Если возраст ребенка равен " + ChildAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + ChildAge + ", то он может кататься без сопровождения взрослого.");
        }

        System.out.print("Введите количество людей: ");
        int NumberOfPeople = scanner.nextInt();
        if (NumberOfPeople < 60) {
            System.out.println("Есть сидячие места.");
        } else if (NumberOfPeople <= 102) {
            System.out.println("Есть только стоячие места.");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.print("Первое число: ");
        int one = scanner.nextInt();
        System.out.print("Второе число: ");
        int two = scanner.nextInt();
        System.out.print("Третье число: ");
        int three = scanner.nextInt();
        if (one >= two && one >= three) {
            System.out.println("Самое большое число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }

        scanner.close();
    }
}