/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_02.ObserverDesignPattern;

/**
 *
 * @author student
 */
public class Test {
    public static void main(String args[]){
        Subject s= new WeatherData();
        Observer o1 = new CurrentConditions();
        Observer o2 = new StatisticalDisplay();
        s.registerObserver(o1);
        s.registerObserver(o2);
        ((WeatherData)s).temperature=20;
        ((WeatherData)s).measurementChanged();
        
    }
}
