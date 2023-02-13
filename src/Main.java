
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println ("dog = "+dog);
        System.out.println ("cat = "+cat);
        System.out.println ("paper = "+paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog +  4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println ("dog = "+dog);
        System.out.println ("cat = "+cat);
        System.out.println ("paper = "+paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println ("dog = "+dog);
        System.out.println ("cat = "+cat);
        System.out.println ("paper = "+paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println ("friend = "+friend);
        friend = friend + 2;
        System.out.println ("friend + 2 = "+friend);
        friend = friend /7;
        System.out.println ("friend /7 = "+friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        var frog = 3.5;
        System.out.println ("frog = "+ frog);
        frog = frog * 10;
        System.out.println ("frog *10 = "+ frog);
        frog = frog /3.5;
        System.out.println ("frog /3.5 = "+ frog);
        frog = frog + 4;
        System.out.println ("frog + 4 = "+ frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        var vesBokser1 = 78.2;
        var vesBokser2 = 82.7;
        var itogo = 0.0;
        itogo = vesBokser1 + vesBokser2;
        System.out.println ("общий вес двух бойцов " + itogo);
        itogo = vesBokser2 - vesBokser1;
        System.out.println ("разницу между весами бойцов " + itogo);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        var vesBokser1 = 78.2;
        var vesBokser2 = 82.7;
        var itog = 0.0;
        itog = vesBokser2 - vesBokser1;
        System.out.println ("Вычитание из большего веса меньшего " + itog);
        itog = vesBokser2 % vesBokser1;
        System.out.println ("разницу между весами бойцов " + itog);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        var workTime = 8.0;
        var workTimeItog = 640;
        var itog = 0.0;
        itog = workTimeItog/workTime;
        System.out.println("640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?" + itog);
        itog = itog + 94;
        workTime = workTimeItog / itog;
        System.out.println("Если в компании работает " + itog + " человек, то всего " +workTime+ " часов работы может быть поделено между сотрудниками");
    }
}



