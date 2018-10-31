package sdp_lab_05.IteratorPattern;

public class MenuItem {
    public String name;
    public String Description;
    public boolean vegetarian;
    public double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        Description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name+" "+this.Description+" "+this.price+" "+this.vegetarian;
    }
}
