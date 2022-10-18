class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Mission 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println(" ");
        System.out.println("Mission 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println(" ");
        System.out.println("Mission 3");
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println(" ");
        System.out.println("Mission 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");
        System.out.println("Mission 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println(" ");
        System.out.println("Mission 6");
        var boxerOne = 78.2;
        System.out.println("Вес одного боксера – " + boxerOne + " кг.");
        var boxerTwo = 82.7;
        System.out.println("Вес второго боксера – " + boxerTwo + " кг.");
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов - " + totalWeight + " кг.");
        var differenceWeight = boxerTwo - boxerOne;
        System.out.println("Разница между весом бойцов - " + differenceWeight + " кг.");

        System.out.println(" ");
        System.out.println("Mission 7");
        var overload = (boxerTwo - boxerOne) % totalWeight;
        System.out.println("Разница между весом бойцов - " + overload + " кг.");

        System.out.println(" ");
        System.out.println("Mission 8");
        var jobHour = 640;
        System.out.println(jobHour + " - часов работы на всех сотрудников. ");
        var individualHour = 8;
        System.out.println(individualHour + " - часов работы на одного сотрудника. ");
        var allPersonal= jobHour / individualHour;
        System.out.println("Всего работников в компании – " +  allPersonal + " человек.");
        allPersonal = allPersonal + 94;
        System.out.println("Всего работников в компании теперь – " +  allPersonal + " человек.");
        individualHour = jobHour / allPersonal;
        System.out.println("Если в компании теперь работает " + allPersonal + " человека, то всего " + individualHour + " часа работы может быть поделено между сотрудниками.");

    }
}