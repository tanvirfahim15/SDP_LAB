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
public class Test {
    public static void main(String args[]){
      
        Beverage b = new Milk(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(b.cost());
        
    }
    
}
