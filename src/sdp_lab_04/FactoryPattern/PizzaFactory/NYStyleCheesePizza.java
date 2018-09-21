package sdp_lab_04.FactoryPattern.PizzaFactory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super();
        super.name = "NYStyleCheesePizza";
        super.dough = "Thin crust dough";
        super.sauce = "Mariana Sauce";
        super.toppings.add("Grated Reggiano Cheese");
    }
}
