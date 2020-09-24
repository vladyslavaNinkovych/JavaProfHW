package hw_lists;

import java.util.AbstractList;

public class ArrayListNew<T> extends AbstractList<T> {
    private final int DEFAULT_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[DEFAULT_SIZE];
    private int counter = 0;


    public boolean add(T item) {
        if (counter == array.length - 1)
            resize(array.length * 2);
        array[counter++] = item;
        return false;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T remove(int index) {
        if (counter - index >= 0)
            System.arraycopy(array, index + 1, array, index, counter - index);
        array[counter] = null;
        counter--;
        return null;
    }

    public int size() {
        return counter;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, counter);
        array = newArray;
    }
}
