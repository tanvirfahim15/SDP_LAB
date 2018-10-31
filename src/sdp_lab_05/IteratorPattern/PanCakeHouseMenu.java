package sdp_lab_05.IteratorPattern;

import java.util.ArrayList;

public class PanCakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PanCakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        addItem(new MenuItem("PanCakeHouse1","description1",true,20.0));
        addItem(new MenuItem("PanCakeHouse2","description2",true,20.0));
        addItem(new MenuItem("PanCakeHouse3","description3",true,20.0));

    }

    public void addItem(MenuItem menuItem){
        menuItems.add(menuItem);

    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new PanCakeHouseMenuIterator(menuItems);
    }
}
