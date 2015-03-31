package ownlist.com.epam.robertpapp.list;

/**
 * Created by Robert_Papp1 on 3/31/2015.
 */
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("The idiots name: " + name);
    }
}
