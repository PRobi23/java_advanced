package ownlist.com.epam.robertpapp.list.AbstractClass;

import android.support.annotation.NonNull;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


import ownlist.com.epam.robertpapp.list.Animal;

/**
 * Created by Robert_Papp1 on 3/31/2015.
 */

public class AnimalAbstractList implements Collection<Animal> {

    private List<Animal> animals = new ArrayList<>();

    private class AnimalAbstractListForwarder extends AbstractList<Animal> {
        public void AnimalAbstractListForwarder() {

        }

        @Override
        public Animal get(int location) {
            return animals.get(location);
        }

        @Override
        public int size() {
            return animals.size();
        }
    }

    AnimalAbstractListForwarder r = new AnimalAbstractListForwarder();

    @Override
    public boolean add(Animal object) {
        add(0, object);

        return true;
    }


    public void add(int location, Animal object) {
       animals.add(location, object);
    }

    @Override
    public boolean addAll(Collection<? extends Animal> collection) {
        return false;
    }

    @Override
    public void clear() {
        r.clear();
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return r.isEmpty();
    }

    @NonNull
    @Override
    public Iterator<Animal> iterator() {
        return null;
    }

    @Override
    public boolean remove(Object object) {
        return r.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public int size() {
        return r.size();
    }

    public Animal get(int location) {
        return r.get(location);
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] array) {
        return null;
    }


}
