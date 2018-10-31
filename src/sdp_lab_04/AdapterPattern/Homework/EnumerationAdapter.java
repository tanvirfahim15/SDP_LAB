package sdp_lab_04.AdapterPattern.Homework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class EnumerationAdapter implements Iterator {

    Enumeration  myEnum;

    @Override
    public boolean hasNext() {
        return myEnum.hasMoreElements();
    }

    @Override
    public Object next() {
        return myEnum.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("");
    }
}