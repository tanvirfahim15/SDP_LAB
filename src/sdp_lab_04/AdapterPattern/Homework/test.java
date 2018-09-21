package sdp_lab_04.AdapterPattern.Homework;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListAdapter<Integer> listAdapter = new ListAdapter<>(list);
        System.out.println(listAdapter.hasMoreElements());
        System.out.println(listAdapter.nextElement());
        System.out.println(listAdapter.hasMoreElements());
        System.out.println(listAdapter.nextElement());
        System.out.println(listAdapter.hasMoreElements());
        System.out.println(listAdapter.nextElement());
        System.out.println(listAdapter.hasMoreElements());

    }
}
