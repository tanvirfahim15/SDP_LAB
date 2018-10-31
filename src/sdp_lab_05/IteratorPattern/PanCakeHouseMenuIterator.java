package sdp_lab_05.IteratorPattern;

import java.util.ArrayList;

public class PanCakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PanCakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext(){
        return position<menuItems.size();
    }

    @Override
    public Object next() {
        position++;
        return menuItems.get(position-1);
    }

    @Override
    public void remove() {
        menuItems.remove(position);

    }
}
