/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_02.DecoratorDesignPattern;

/**
 *
 * @author student
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;
    String description = "";


    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public float cost() {
        return beverage.cost()+(float)2.0;
    }
    
}
