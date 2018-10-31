package sdp_lab_05.IteratorPattern;

public class DinerMenu {
    MenuItem[] menuItems;
    int numberOfItems = 0;
    public static int maxItems = 6;

    public DinerMenu() {
        menuItems = new MenuItem[maxItems];
        addItem(new MenuItem("Diner1","description1",true,20.0));
        addItem(new MenuItem("Diner2","description2",true,20.0));
        addItem(new MenuItem("Diner3","description3",true,20.0));

    }

    public void addItem(MenuItem menuItem){
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
