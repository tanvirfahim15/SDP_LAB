/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_02.ObserverDesignPattern;

import java.util.Vector;

/**
 *
 * @author student
 */
public class WeatherData implements Subject{
    float temperature,humidity,pressure;
    Vector<Observer> observerList=new Vector<>();
    
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
    public void measurementChanged(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        observerList.stream().forEach(e->{
            e.update(this);
        });
    }

    

    
}
