package pl.softie.homeworks.course2.exercise16;

public class Cat {

    private String color;
    private String name;
    private boolean isHungry;
    private boolean hasOwner;

    public Cat(String name, String color, boolean isHungry, boolean hasOwner) {
        this.name = name;
        this.color = color;
        this.isHungry = isHungry;
        this.hasOwner = hasOwner;
    }

    public String getName() {
        return this.name;
    }
}
