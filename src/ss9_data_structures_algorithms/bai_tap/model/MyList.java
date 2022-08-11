package ss9_data_structures_algorithms.bai_tap.model;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public MyList() {
        elements = new Object[10];

    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;

        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return 1;
            }
        }
        return index;
    }

    public boolean contain(E element) {
        return this.indexOf(element) >= 0;
    }

}
