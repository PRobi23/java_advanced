package ownlist.com.epam.robertpapp.list;


import ownlist.com.epam.robertpapp.list.AbstractClass.AnimalAbstractList;

/**
 * Created by Robert_Papp1 on 3/31/2015.
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Dévai István", 33);

        AnimalAbstractList list = new AnimalAbstractList();
        list.add(0, a);

        System.out.println(list.get(0).toString());
    }
}

