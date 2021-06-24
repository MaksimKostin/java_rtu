package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SemaphoreMap<E, R> implements Map<E, R>  {
    private final Map<E, R> inter; // объявление объекта куда будет всё записываться
    private final Semaphore s; // получение Semaphore в конструкторе

    public SemaphoreMap(int num) {
        this.s = new Semaphore(num);
        this.inter = new HashMap<>();
    }

    @Override
    public int size() {
        try {
            s.acquire();
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return inter.size();

    }

    @Override
    public boolean isEmpty() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean temp = inter.isEmpty();
        s.release();
        return temp;
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean temp = inter.containsKey(key);
        s.release();
        return temp;
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean temp = inter.containsValue(value);
        s.release();
        return temp;
    }

    @Override
    public R get(Object key) {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        R temp = inter.get(key);
        s.release();
        return temp;
    }

    @Override
    public R remove(Object key) {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        R temp = inter.remove(key);
        s.release();
        return temp;
    }

    @Override
    public void clear() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inter.clear();
        s.release();
    }

    @Override
    public Set<E> keySet() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<E> temp = inter.keySet();
        s.release();
        return temp;
    }

    @Override
    public Collection<R> values() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Collection<R> temp = inter.values();
        s.release();
        return temp;
    }

    @Override
    public Set<Map.Entry<E, R>> entrySet() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<Map.Entry<E, R>> temp = inter.entrySet();
        s.release();
        return temp;
    }

    @Override
    public void putAll(Map<? extends E, ? extends R> map) {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inter.putAll(map);
        s.release();
    }

    @Override
    public R put(E key, R value) {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        R temp = inter.put(key, value);
        s.release();
        return temp;
    }
}
