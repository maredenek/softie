package pl.softie.homeworks.course2.exercise10;

public class Soldier {

    private final String name;
    private final int age;
    private final int weight;
    private final int strength;
    private final int stamina;

    public Soldier(String name, int age, int weight, int strength, int stamina) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.stamina = stamina;
    }

    public boolean fight(Soldier anotherSoldier) {
        return this.getAvg() > anotherSoldier.getAvg();
    }

    @Override
    public String toString(){
        return name;
    }

    private double getAvg() {
        return (double)(age + weight + strength + stamina) / 4;
    }
}
