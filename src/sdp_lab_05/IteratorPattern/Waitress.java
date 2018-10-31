package sdp_lab_05.IteratorPattern;

public class Waitress {
    DinerMenu dinerMenu;
    PanCakeHouseMenu panCakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PanCakeHouseMenu panCakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.panCakeHouseMenu = panCakeHouseMenu;
    }

    public void printMenu(){
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator panCakeHouseMenuIterator = panCakeHouseMenu.createIterator();
        System.out.println("DinerMenuIterator:");
        printMenu(dinerMenuIterator);
        System.out.println("PanCakeHouseMenuIterator:");
        printMenu(panCakeHouseMenuIterator);
    }
    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println((MenuItem)iterator.next());
        }
    }
}
