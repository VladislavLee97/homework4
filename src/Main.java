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
        short age = 1;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        short temperature = 8;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 120;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;
        boolean ageFrom2To6 = age > 2 && age <= 6;
        boolean ageFrom7to18 = age >= 7 && age <= 18;
        boolean ageOver18ButUnder24 = age > 18 && age < 24;
        boolean ageFrom24 = age > 24;
        if (ageFrom2To6) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в детский сад");
        } else if (ageFrom7to18) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в школу");
        } else if (ageOver18ButUnder24) {
            System.out.println("Если человеку " + age + " то ему нужно ходить в университет");
        } else if (ageFrom24) {
            System.out.println("Если человеку " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte age = 14;
        boolean ageLess5 = age < 5;
        boolean ageOver5ButUnder14 = age >= 5 && age < 14;
        boolean ageOver14 = age >= 14;
        if (ageLess5) {
            System.out.println("Если возраст ребёнка равен " + age + " то ему нельзя кататься на аттракционе");
        } else if (ageOver5ButUnder14) {
            System.out.println("Если возраст ребёнка равен " + age + " то ему можно кататься в сопровождении взрослого");
        } else if (ageOver14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 120;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount; // стоячие места

        int seatsUsed = 60;
        int otherUsed = 50;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест");
        } else if (seatsCount == seatsCount) {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест");
        } else if (otherCount == otherCount) {
            System.out.println("Стоячих мест нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 11;
        int two = 11111;
        int three = 11111;
        if (one > two) {
            if (one >= three) {
                System.out.println("максимальное число " + one);
            } else {
                System.out.println("максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("максимальное число " + two);
            } else {
                System.out.println("максимальное число " + three);
            }
        }
        if (one > three) {
            if (three >= two) {
                System.out.println("максимальное число " + one );
            } else if (three > one) {
                System.out.println("максимальное число " + three);
            } else {
                System.out.println("Все три части равны");
            }
        }
    }
}