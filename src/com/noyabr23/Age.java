package com.noyabr23;

public class Age {
    public static void main(String[] args) {

        Minor m1 = new Minor(34, "m1", 0, 1800, true, 45);
        Minor m2 = new Minor(24, "m2", 0, 2700, false, 56);
        Minor m3 = new Minor(29, "m3",0, 3100, true, 50);

        Fehle f1 = new Fehle(23, "f1",0, 10, false, true);
        Fehle f2 = new Fehle(31, "f2",0, 9, false, false);
        Fehle f3 = new Fehle(45, "f3",0, 8, true, false);

        Standard s1 = new Standard(32, "s1",0, 900, true, 40);
        Standard s2 = new Standard(28, "s2",0, 1100, true, 45);
        Standard s3 = new Standard(38, "s3",0, 1700, false, 56);

        Evdar e1 = new Evdar(37, "e1",0, 2, false, false);
        Evdar e2 = new Evdar(34, "e2",0, 2, true, false);
        Evdar e3 = new Evdar(44, "e3",0, 3, false, true);

        AA a1 = new AA(35, "a1", 0, 9, false, false, false, false);
        AA a2 = new AA(39, "a2",0, 18, true, false, true, false);
        AA a3 = new AA(52, "a3",0, 25, true, true, true, true);
        AA a4 = new AA(44, "a4",0, 18, true, true, false, false);


        Routine[] rutin = {m1, m2, m3, f1, f2, f3, s1, s2, s3, e1, e2, e3, a1, a2, a3, a4,};

        for (Routine tt : rutin) tt.stress();

        Fat[] fat = {s1, s2, s3, a1, a2, a3, a4, e1, e2, e3};

        for (Fat tt : fat) tt.movingless();

        BadHabit[] bad = {s1, s2, s3, f1, f2, f3, a1, a2, a3, a4};

        for (BadHabit tt : bad) {
            tt.alchogolyzm();
            tt.smoking();
        }

        Doner[] doner = {s1, s2, s3, f1, f2, f3};

        for (Doner tt : doner) tt.FastFood();

        Goodhabit[] good = {m1, m2, m3};

        for (Goodhabit tt : good) {
            tt.workout();
            tt.regularSex();
        }

        Human[] humans = {m1, m2, m3, f1, f2, f3, s1, s2, s3, e1, e2, e3, a1, a2, a3, a4,};


        for (Human tt : humans) {
            System.out.print(tt.name+"\t"+tt.age+"\t"+tt.deathCount+"\t");
            if (tt.deathCount < 0) tt.age = tt.age * 3 / 2 - tt.deathCount;
            else if (tt.deathCount < 50) tt.age = tt.age + 60 - tt.deathCount;
            else if (tt.deathCount < 80) tt.age = tt.age + 90 - tt.deathCount;
            else if (tt.deathCount < 165) tt.age= 180 - tt.deathCount;
            else tt.age+= 210 - tt.deathCount;
            System.out.print(tt.age + "\t");
            System.out.println();
        }
    }
}


