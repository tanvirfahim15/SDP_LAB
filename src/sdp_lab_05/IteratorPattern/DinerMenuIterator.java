package sdp_lab_05.IteratorPattern;

public class DinerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position =0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>menuItems.length||menuItems[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        position++;
        return menuItems[position-1];
    }

    @Override
    public void remove() {
        menuItems[position] = null;
        for (int i = position+1;i<DinerMenu.maxItems;i++){
            menuItems[i-1] = menuItems[i];
        }
        menuItems[DinerMenu.maxItems-1] = null;
    }
}
