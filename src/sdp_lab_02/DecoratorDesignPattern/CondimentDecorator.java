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
public abstract class CondimentDecorator extends Beverage{
    String description = "";

    @Override
    public String getDescription() {
        return description;
    }
}
