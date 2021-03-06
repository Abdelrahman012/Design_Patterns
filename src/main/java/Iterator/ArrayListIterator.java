package Iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator{

    ArrayList<Object> arrayList;
    int position = 0;

    public ArrayListIterator(ArrayList<Object> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {

        if (position >= arrayList.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object Next(){
        Object temp = arrayList.get(position);
        position++;
        return temp;
    }
}
