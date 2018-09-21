package sdp_lab_04.AdapterPattern.Homework;

import java.util.Enumeration;
import java.util.List;

public class ListAdapter<Object> implements Enumeration<Object> {
    List<Object> list;
    int index = 0;

    public ListAdapter(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasMoreElements() {
        return index<list.size();
    }

    @Override
    public Object nextElement() {
        index++;
        return list.get(index-1);
    }
}