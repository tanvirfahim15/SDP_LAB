/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_01.StrategyDesignPattern;


/**
 *
 * @author student
 */
public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quacking"); 
    }
    
}
