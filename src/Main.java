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
        System.out.println("Задача 1");
        int age = 35;
        System.out.println("Если возраст человека равен " + age + " лет");
        if (age >= 18) {
            System.out.println("Человек достиг совершеннолетия");
        } else {
            System.out.println("Человек не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 4;
        System.out.println("На улице  " + temp + " градуса");
        if (temp <= 5) {
            System.out.println("Сегодня холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        System.out.println("Если скорость равна " + speed + " км/ч,");
        if (speed <= 60) {
            System.out.println("то можно ездить спокойно.");
        } else {
            System.out.println("то придется заплатить штраф.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 19;
        System.out.println("Если возраст человека равен " + age);
        if (age < 2) {
            System.out.println("то ему пора спать");
        }
        else if (age > 2 && age < 6) {
            System.out.println("То ему нужно ходить в детский сад");
        }
        else if (age > 7 && age < 17) {
            System.out.println("То ему пора в школу");
        }
        else if (age > 18 && age < 24) {
            System.out.println("То ему пора в университет");
        }
        else if (age > 24 && age < 60) {
            System.out.println("То ему пора на работу");
        }
        else if (age >= 60) {
            System.out.println("То ему пора отдохнуть");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 12;
        boolean parents = false;
        System.out.println("Если возраст ребенка равен " + age);
        if (age < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14 && parents) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("нельзя кататься без сопровождения взрослого");
        }
        if (age >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int ticketNumber = 15;
        boolean ticketSeat = (ticketNumber >= 1 && ticketNumber <= 60);
        boolean ticketStand = (ticketNumber > 60 && ticketNumber <= 102);
        if (ticketSeat) {
            System.out .println("Есть сидячее место");
        } else {
            boolean tickedStand;
            System.out.println("Есть стоячее место");
        }
        if (ticketNumber > 102) {
            System.out.println("Мест нет");
        }
        }
        public static void task7() {
            System.out.println("Задача 7");
            int one = 350;
            int two = 67;
            int three = 99;

            int max;
            if (one > two) {
                max = one;
            } else {
                max = two;
            }
            if (max > three) {
                System.out.println("max = " + max);
            } else {
                System.out.println("max = " + three);
            }
        }
    }