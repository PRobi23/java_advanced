package ownlist.com.epam.robertpapp.list.AbstractClass;

import android.support.annotation.NonNull;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import ownlist.com.epam.robertpapp.list.Animal;

/**
 * Created by Robert_Papp1 on 3/31/2015.
 */

public class AnimalAbstractList implements List<Animal> {

    private Animal [] animals = new Animal[20];

    private class AnimalAbstractListForwarder extends AbstractList<Animal> {

        public void AnimalAbstractListForwarder() {

        }

        @Override
        public Animal get(int location) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }

    AnimalAbstractListForwarder r = new AnimalAbstractListForwarder();

    @Override
    public void add(int location, Animal object) {
        animals[location] = object;
    }

    @Override
    public boolean add(Animal object) {
        add(0, object);
        return true;
    }

    @Override
    public boolean addAll(int location, Collection<? extends Animal> collection) {
        return addAll(location, collection);
    }

    @Override
    public boolean addAll(Collection<? extends Animal> collection) {
        return false;
    }

    @Override
    public void clear() {

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
    public Animal get(int location) {
        return animals[location];
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @NonNull
    @Override
    public Iterator<Animal> iterator() {
        return null;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<Animal> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<Animal> listIterator(int location) {
        return null;
    }

    @Override
    public Animal remove(int location) {
        return null;
    }

    @Override
    public boolean remove(Object object) {
        return false;
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
    public Animal set(int location, Animal object) {
        return r.set(location, object);
    }

    @Override
    public int size() {
        return animals.length;
    }

    @NonNull
    @Override
    public List<Animal> subList(int start, int end) {
        return null;
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
