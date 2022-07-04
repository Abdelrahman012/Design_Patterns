package Iterator;

import java.util.ArrayList;

public class ArrayIterator implements Iterator {

    Object[] array;
    int position = 0;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {

        if (position >= array.length) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object Next(){
        Object temp = array[position];
        position++;
        return temp;
    }
}
