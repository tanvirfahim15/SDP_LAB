package sdp_lab_04.FactoryPattern.PizzaFactory;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing...");
    }
    void bake(){
        System.out.println("Baking...");
    }
    void cut(){
        System.out.println("Cutting...");
    }
    void box(){
        System.out.println("Boxing");
    }

    public String getName() {
        return name;
    }
}
