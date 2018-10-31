package sdp_lab_05.IteratorPattern;

public class test {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(),new PanCakeHouseMenu());
        waitress.printMenu();
        System.out.println("\n\nDeleting From DinerMenu");
        Iterator testIterator = waitress.dinerMenu.createIterator();
        testIterator.remove();
        testIterator.remove();
        waitress.printMenu();
        System.out.println("\n\nDeleting From PanCakeHouseMenu");
        testIterator = waitress.panCakeHouseMenu.createIterator();
        testIterator.remove();
        testIterator.remove();
        waitress.printMenu();
    }
}