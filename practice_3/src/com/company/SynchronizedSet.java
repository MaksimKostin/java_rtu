package com.company;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSet<E> implements Set<E> {
    private final Set<E> ourSet = new HashSet<>();

    @Override
    public synchronized int size() {
        return ourSet.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return ourSet.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return ourSet.contains(o);
    }

    @Override
    public  synchronized Iterator<E> iterator() {
        return ourSet.iterator();
    }

    @Override
    public  synchronized Object[] toArray() {
        return ourSet.toArray();
    }

    @Override
    public  synchronized <T> T[] toArray(T[] a) { // не реализован
        return null;
    }

    @Override
    public synchronized boolean add(E e) {
        return ourSet.add(e);
    }

    @Override
    public  synchronized boolean remove(Object o) {
        return ourSet.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized void clear() {
        ourSet.clear();
    }
}
