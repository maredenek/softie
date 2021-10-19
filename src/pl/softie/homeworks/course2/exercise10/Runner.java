package pl.softie.homeworks.course2.exercise10;

public class Runner {

    public static void main(String[] args) {
        Soldier s1 = new Soldier("s1", 31, 80, 80, 80);
        Soldier s2 = new Soldier("s2",31, 90, 80, 80);
        Soldier s3 = new Soldier("s3",31, 90, 90, 80);
        Soldier s4 = new Soldier("s4",31, 90, 90, 90);

        Soldier fighter1 = s4;
        Soldier fighter2 = s3;
        if(fighter1.fight(fighter2))
            System.out.println(fighter1 + " won");
        else
            System.out.println(fighter2 + " won");
    }
}
